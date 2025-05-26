package basic;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 18) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Not adult");
        }
    }
}
