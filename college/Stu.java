package college;
import java.util.*;

class Student{
    String name;
    int age;
    double marks;
    String grade;

    public void displayStudentDetails(){
        System.out.println("Name:" + name);
        System.out.println("Age"+ age);
        System.out.println("Marks"+ marks);
        System.out.println("Grade"+ grade);
    }


}


public class Stu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        
        for(int i = 1; i<=6; i++){
            
             System.out.println("Enter student name");
             student.name = sc.nextLine();

             System.out.println("Enter grade:");
             student.grade = sc.nextLine();

             System.out.println("Enter student age:");
             student.age = sc.nextInt();

            System.out.println("Enter marks:");
            student.marks = sc.nextDouble();
            sc.nextLine();
        }
        student.displayStudentDetails();


    }
    
}
