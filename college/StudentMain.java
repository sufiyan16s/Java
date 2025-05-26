package college;

import java.util.*;

class Students{
    String name;
    int rollNumber;
    double chemistyMarks;
    double physicsMarks;
    double mathMarks;
    double totalMarks;
    double percentage;
    String grade;
    
    public void calculateTotalMarks(){
        totalMarks = chemistyMarks + physicsMarks + mathMarks;
    }

    public void calculatePercentage(){
        percentage = (totalMarks/300) * 100;
    }

    public void calculateGrade(){
        if(percentage >= 90 && percentage <= 100){
            grade = "A+";
        } else if(percentage >= 80){
            grade = "A";
        } else if(percentage >=70){
            grade = "B";
        } else if(percentage >=60){
            grade = "C";
        } else if(percentage >=50){
            grade = "D";
        } else{
            grade = "F";
        }
    }

    public void printReportCard(){
        System.out.println("\n--- Report Card ---");
        System.out.println("Name:" + name);
        System.out.println("Roll Number:" + rollNumber);
        System.out.println("Marks in Chemistry:" + chemistyMarks);
        System.out.println("Marks in Physics:" + physicsMarks);
        System.out.println("Marks in Math:" + mathMarks);
        System.out.println("Total Marks:" + totalMarks + "/300");
        System.out.println("Percentage:" + percentage +"%");
        System.out.println("Grade:" + grade);
        System.out.println("----------------");
    }
}
public class StudentMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Students student = new Students();

        System.out.println("Enter student's name:");
        student.name = sc.nextLine();

        System.out.println("Enter roll number:");
        student.rollNumber = sc.nextInt();

        System.out.println("Enter marks in Chemistry:");
        student.chemistyMarks = sc.nextDouble();

        System.out.println("Enter marks in Physics:");
        student.physicsMarks = sc.nextDouble();

        System.out.println("Enter marks in math:");
        student.mathMarks = sc.nextDouble();

        student.calculateTotalMarks();
        student.calculatePercentage();
        student.calculateGrade();
        student.printReportCard();

        sc.close();
       
    }
}
