package college;

public class BankDeposit {
    private String accountHolderName;
    private double balance;

    BankDeposit(String accountHolderName){
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    void deposit(int cashAmount){
        balance += cashAmount;
        System.out.println("Cash deposited: ₹" + cashAmount);
    }

    void deposit(double checkAmount){
        balance += checkAmount;
        System.out.println("Check deposited: ₹" + checkAmount);
    }

    void deposit(String fromAccount, double amount){
        balance += amount;
        System.out.println("transferred " + amount + " from " + fromAccount);
    }

    void displayAccountDetails(){
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        BankDeposit account = new BankDeposit("John Doe");
        account.deposit(1000);
        account.deposit(2000.50);
        account.deposit("Jane Smith", 1500.75);
        account.displayAccountDetails();
    }
    
    
}
