package college;
import java.util.*;

class Laptops{
    String brand;
    int price;

    void displayDetails(){
        System.out.println("--laptop details--");
        System.out.println("Brand Nmae:" + brand);
        System.out.println("Price: " + price);
    }
}
public class Laptop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Laptops l1 = new Laptops();

        l1.brand = sc.nextLine();
        l1.price = sc.nextInt();

        l1.displayDetails();

    }
    
}
