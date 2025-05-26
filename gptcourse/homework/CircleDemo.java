package gptcourse.homework;

class Circle{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    double calculateArea() {
        
        return 3.14 * radius * radius;
    }
}
public class CircleDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);

        System.out.println("Area of circle = " + c1.calculateArea());
    }
    
}
