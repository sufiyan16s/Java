package object_oriented;

class Car{
    //Attributes
    String brand;
    int speed;

    //method
    void drive(){
        System.out.println("Driving the " + brand + " at " + speed +" km/h");
    }
}
public class CarDemo {
    public static void main(String[] args) {
        // creating an object of the car class
        Car c1 = new Car(); // Object created

        //Setting values(attributes) for the object
        c1.brand = "BMW";
        c1.speed = 130;

        //Calling the method of the object
        c1.drive();
    }
}
