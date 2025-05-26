package gptcourse.homework;
import java.util.*;
class Teacher{
    String name;
    String subject;

    Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    void teach(){
        System.out.println("Mr. " + name + " is teaching " + subject);
    }
}
public class TeacherDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter teacher name: ");
        String name = sc.nextLine();
        System.out.print("Enter subject: ");
        String subject = sc.nextLine();

        Teacher t1 = new Teacher(name, subject);

        t1.teach();

        sc.close();

    }
}
