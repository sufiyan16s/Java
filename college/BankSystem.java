package college;
import java.util.*;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}


public class BankSystem {
    private static int accountCounter = 1000;
    private String accountHolderName;
    private int accountNumber;
    private double balance;


    public BankSystem(String accountHolderName, double initialDeposit){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountCounter++;


        if(initialDeposit < 0){
            System.out.println("Initial deposit cannot be negative. setting balance to 0.");
            this.balance = 0;
        } else {
            this.balance = initialDeposit;
        }
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else{
            System.out.println("Deposit amount must be positive!");
        }
    }

    public void withdraw(double amount){
        try {
            if(amount > balance) {
                throw new InsufficientBalanceException("Insufficient funds! Available balance: $" + balance);
            }
            if(amount <= 0){
                System.out.println("Withdrawal amount must be positive!");
                return;
            }
            balance -= amount;
            System.out.println("Withdrawm: $" + amount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    public void checkBalance() {
        System.out.println("Account Balance: $" + balance);
    }


    public void displayAccountDetails() {
        System.out.println("---- Bank Account Details ----");
        System.out.println("Account Holder :" + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current BAlance: $" + balance);
        System.out.println("-------------------------------");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Holder Name");
        String name = sc.nextLine();

        System.out.println("Enter Initial Deposit Amount");
        double initialDeposit = sc.nextDouble();

        BankSystem userAccount = new BankSystem(name, initialDeposit);
        userAccount.displayAccountDetails();

        while (true) { 
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check Balance");
            System.out.println("4. View Account Details");
            System.out.println("5. Exit");

            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    userAccount.deposit(depositAmount);
                    break;

                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    userAccount.withdraw(withdrawAmount);
                    break;
                
                case 3:
                    userAccount.checkBalance();
                    break;
                
                case 4:
                    userAccount.displayAccountDetails();
                    break;

                case 5:
                    System.out.println("Thank you for banking with us!");
                    sc.close();
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Invalid choice! please try again.");
            }
        }
    }
}
