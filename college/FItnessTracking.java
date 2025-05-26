package college;

import java.util.*;

public class FItnessTracking {

    public class User{
        String name;
        int userId;
        int caloriesBurned;
    }

    

    public int excercies(int caloriesBurned){
        if(caloriesBurned < 0){
            System.out.println("Calories burned cannot be negative");
            return -1;
        } else{
        totalCaloriesBurned += caloriesBurned;
        return totalCaloriesBurned;
        }
    }

    public void dispaly

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter user name:");
        String name = sc.nextLine();

        System.out.println("Enter user Id:");
        int usreId = sc.nextInt();

        System.out.println("Enter calories burned:");
        double caloriesBurned = sc.nextDouble();
        
    }
}
