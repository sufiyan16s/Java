package gptcourse.homework;

class Mobile{
    String brand;
    int price;

    Mobile(String brand, int price){
        this.brand = brand;
        this.price = price;
    }

    void displayFeatures(){
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("---------------");
    }
}

public class MobileDemo {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Lenovo" , 31999);
        Mobile m2 = new Mobile("Vivo", 27999);
        Mobile m3 = new Mobile("XiomiPad", 32999);

        m1.displayFeatures();
        m2.displayFeatures();
        m3.displayFeatures();
    }
    
}
