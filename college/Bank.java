package college;



class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message){
        super(message);
    }
}
public class Bank {
    private static int accountCounter = 1000;
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public Bank(String accountHolderName, double initialDeposite) {
        this.accountNumber = accountCounter++;
        this.accountHolderName = accountHolderName;

        if(initialDeposite < 0) {
            System.out.println("Initial deposite cannot be negative. Setting balance to 0.");
            this.balance = 0;
        } else {
            this.balance = initialDeposite;
        }
    }

    public void deposite(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited: $"+ amount);
        } else{
            System.out.println("Deposite amount must be positive!");
        }
    }

    public void withdraw(double amount) {
        try {
            if(amount > balance){
                throw new InsufficientBalanceException("Insufficient funds! Available balance: $" + balance);
            }
            if(amount <= 0){
                System.out.println("Withdrawal amount must be positive!");
                return;
            }
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    public void checkBalance() {
        System.out.println("Account Balance: $" + balance);
    }

    public void displayAccountDetails() {
        System.out.println("----Bank Account Details----");
        System.out.println("Account Holder: "+ accountHolderName);
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Current Balance: $"+ balance);
        System.out.println("----------------------------");
    }

    public static void main(String[] args){
        Bank account1 = new Bank("Sufiyan", 500.0);
        account1.displayAccountDetails();

        account1.deposite(200);
        account1.withdraw(100);
        account1.withdraw(700);
        account1.checkBalance();
    }
}
