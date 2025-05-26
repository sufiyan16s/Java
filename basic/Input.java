package basic;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // input
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        // nextInt() for integer
        // nextDouble() for double
        // next() for string
        //nextFloat() for float
        System.out.println(name);
    }
}
