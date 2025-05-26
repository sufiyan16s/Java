package patternquestion;

import java.util.Scanner;

public class RotatedPyramid {

    public static void main(String args[]) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        //int n = 10;
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop -> print space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //inner loop -> print *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
