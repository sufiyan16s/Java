package college;
import java.util.*;

public class Students {

    static class StudentDetails {
        private String name;
        private int rollnumber;
        private char grade;

        public StudentDetails(String name, int rollnumber, char grade) {
            this.name = name;
            this.rollnumber = rollnumber;
            this.grade = grade;
        }

        void displayStudentDetails() {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollnumber);
            System.out.println("Grade: " + grade);
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = sc.nextLine();
        System.out.println("Enter roll number:");
        int rollNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter grade:");
        char grade = sc.nextLine().charAt(0);
        StudentDetails student = new StudentDetails(name, rollNumber, grade);
        student.displayStudentDetails();
        sc.close();
    }
    
}
