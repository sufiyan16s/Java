package question;

import java.util.*;

public class IfQ {
    @SuppressWarnings("resource")
   public static void main(String []args) {
       Scanner sc = new Scanner(System.in);
       int button = sc.nextInt();

       if(button == 1) {
           System.out.println("Hello");
       } else if(button == 2) {
           System.out.println("Namasate");
       } else if(button == 3) {
           System.out.println("Bounjour");
       } else {
           System.out.println("Invalid button");
       }
   }


}
