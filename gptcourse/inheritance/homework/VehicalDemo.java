package gptcourse.inheritance.homework;

class Vehical{
    void drive(){
        System.out.println("Vehical is driving..");
    }
}

class Car extends Vehical{
    void company(){
        System.out.println("Car is BMW..");
    }
}

class ElectricCar extends Car{
    void battery(){
        System.out.println("Electric car is charging..");
    }
}
public class VehicalDemo {
    public static void main(String[] args) {
        ElectricCar e1 = new ElectricCar();

        e1.drive();
        e1.company();
        e1.battery();
    }
}
