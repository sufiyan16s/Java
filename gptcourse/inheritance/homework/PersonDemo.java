package gptcourse.inheritance.homework;

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Student extends Person{
    int rollNumber;

    Student(String name, int age, int rollNumber){
        super(name, age);
        this.rollNumber = rollNumber;
    }

    void displayDetails(){
        System.out.println("-------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("-------------");
    }
}
public class PersonDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Sufiyan", 21, 258);

        s1.displayDetails();

        Student s2 = new Student("Monaz", 21, 259);

        s2.displayDetails();

    }
}
