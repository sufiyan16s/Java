package college;
import java.util.*;

class Circle{
    int radius;

    void calculateArea(){
        double area;
        area = 2*3.14*radius;
        System.out.println("Area of circle = " + area);

    }
}
public class Circles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Circle c1 = new Circle();
        
        c1.radius = sc.nextInt();

        c1.calculateArea();
    } 
    
}
