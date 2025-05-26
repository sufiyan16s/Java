package gptcourse.encapsulation.home;
class Bank{
    private String accountHolderName;
    private int accountNumber;
    double balance;

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public void setAccountHolderName(String name){
        this.accountHolderName = name;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(int number){
        this.accountNumber = number;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double amount){
        if(amount >=0){
            this.balance = amount;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        } else{
            System.out.println("Deposited amount must be positive!");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
        } else if(amount > balance){
            System.out.println("Insufficient funds!");
        } else{
            System.out.println("Withdrawn amount must be positive!");
        }
    }
    

}
public class BankAccountDemo {
    public static void main(String[] args){
        Bank acc1 = new Bank();

        acc1.setAccountHolderName("Sufiyan");
        acc1.setAccountNumber(229600);
        acc1.setBalance(21000.00);
        acc1.deposit(5000.00);
        acc1.withdraw(3000.00);
        System.out.println("Account Holder Name: " + acc1.getAccountHolderName());
        System.out.println("Account Number: " + acc1.getAccountNumber());
        System.out.println("Available Balance: " + acc1.getBalance());
        acc1.withdraw(30000.00); // Attempt to withdraw more than balance
        acc1.withdraw(-1000.00); // Attempt to withdraw negative amount
        acc1.deposit(-500.00); // Attempt to deposit negative amount
        acc1.deposit(0.00); // Attempt to deposit zero amount
        acc1.withdraw(0.00); // Attempt to withdraw zero amount
        acc1.withdraw(20000.00); // Attempt to withdraw more than balance
        acc1.deposit(10000.00); // Deposit a valid amount
        System.out.println("Updated Balance: " + acc1.getBalance());
        acc1.withdraw(20000.00); // Attempt to withdraw more than balance
    }
}
