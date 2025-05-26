package gptcourse.homework;

class Laptop{
    String brand;
    int price;

    void showDetails(){
        System.out.println("-------------");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("-------------");
    }
}
public class LaptopDemo {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();

        l1.brand = "Lenovo";
        l1.price = 81999;
        l1.showDetails();
    }
    
}
