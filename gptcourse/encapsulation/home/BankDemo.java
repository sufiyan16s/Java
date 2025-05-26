package gptcourse.encapsulation.home;

class BankAccount{
    private String accountHolderName;
    private int accountNumber;
    private double balance;
    
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
        if(amount >= 0){
            this.balance = amount;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }
}
public class BankDemo {
    public static void main(String[] args) {
        BankAccount ac1 = new BankAccount();

        ac1.setAccountHolderName("Sufiyan");
        ac1.setAccountNumber(22960001);
        ac1.setBalance(500000.0);

        System.out.println("Account Holder Name: " + ac1.getAccountHolderName());
        System.out.println("Account Number:n " + ac1.getAccountNumber());
        System.out.println("Available balance: " + ac1.getBalance());
    }
    
}
