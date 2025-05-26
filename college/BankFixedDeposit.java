package college;

class Customer{
    int customerId;
    String name;

    public Customer(int customerId, String name){
        this.customerId = customerId;
        this.name = name;
    }
}

class FixedDeposit{
    static String bankName = "ABC Bank";
    private double depositAmount;
    private double interestRate;

    public FixedDeposit(double depositAmount, double interestRate){
        this.depositAmount = depositAmount;
        this.interestRate = interestRate;
    }

    public double calculateMaturityAmount(int years){
        return depositAmount*Math.pow(1 + interestRate/100, years);
    }

    public void displayDetails(int years){
        System.out.println("Bank: " + bankName);
        System.out.println("Deposit Amount: " + depositAmount);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Maturity Amount after " + years + " years: " + calculateMaturityAmount(years));
    }
}

public class BankFixedDeposit {
    public static void main(String[] args) {
        Customer customer1 = new Customer(258, "Sufiyan");

        FixedDeposit fd1 = new FixedDeposit(100000, 7.5);

        System.out.println("Customer ID: " + customer1.customerId);
        System.out.println("Customer Name:" + customer1.name);
        System.out.println("\nFixed Deposit Details:");
        fd1.displayDetails(5);
    }
}
