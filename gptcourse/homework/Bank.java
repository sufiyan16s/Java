package gptcourse;

class BankAccount{
    int accountNo;
    double balance;
    
    //method to deposit amount
    void deposit(double amount){
        if(amount > 0){
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    
    // method to withdraw amount
    void withdraw(double amount){
        if(amount < 0){
            System.out.println("Invalid withdrawal amount!");
        } else if(balance < amount){
            System.out.println("Insufficient balance!");
        } else{
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        }
    }

    void checkBalance(){
        System.out.println("Current balanceL: ₹" + balance);
    }
}
public class Bank {
    public static void main(String[] args){
        BankAccount acc1 = new BankAccount();
        acc1.accountNo = 229600;
        acc1.balance = 20000;

        acc1.deposit(5000);
        acc1.withdraw(10000);
        acc1.withdraw(20000);
        acc1.deposit(-300);
        acc1.checkBalance();
    }
    
}
