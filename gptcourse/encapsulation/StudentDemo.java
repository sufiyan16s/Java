package gptcourse.encapsulation;

class Student{
    private String name;
    private int age;

    //Getter method
    public String getName(){
        return name;
    }

    //Setter method
    public void setName(String n){
        name = n;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        if(a >= 0){
            age = a;
        } else {
            System.out.println("Age can't be negative!");
        }
    }
}
public class StudentDemo {
    public static void main(String[] args){
        Student s1 = new Student();

        s1.setName("Sufiyan");
        s1.setAge(21);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}
