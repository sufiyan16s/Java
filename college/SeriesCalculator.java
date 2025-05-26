package college;
import java.util.*;

class Series{
    public int calculateSum(int n){
        int a = 1;
        int d = 2;
        return (n * (2 * a + (n-1) * d)) / 2;

    }
}
public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n");
        int n = sc.nextInt();

        Series s = new Series();

        int sum = s.calculateSum(n);
        System.out.println("Sum of series is: " + sum);
    }
}
