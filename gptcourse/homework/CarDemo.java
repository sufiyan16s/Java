package gptcourse;

class Car{
    String model;

    void drive(){
        System.out.println(model+" is driving");
    }
}
public class CarDemo {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.model = "BMW";
        c1.drive();
        Car c2 = new Car();
        c2.model = "Audi";
        c2.drive();
    }
}
