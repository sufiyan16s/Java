package college;
import java.util.*;

class Squares{
    int side;
    

    void getData(){
        Scanner sc = new Scanner(System.in);
        side = sc.nextInt();
    }

    void calc_perimeter(){
        int perimeter;
        perimeter = 4*side;
        System.out.println("perimetr= " + perimeter);
    }
}
public class Square {
    public static void main(String[] args) {
        Squares s1 = new Squares();

        s1.getData();
        s1.calc_perimeter();
    }

}
