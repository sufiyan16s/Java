package gptcourse.theory;

class Student{
    // properties(Data members)
    String name;
    int age;

    //Method(Behavior)
    void study() {
        System.out.println(name + " is studying.");
        System.out.println(age + " years old");
    }
}
public class ClassDemo {
    public static void main(String[] args) {
        //Creating objects
        Student s1 = new Student();
        s1.name = "Sufiyan";
        s1.age = 20;

        // Calling method
        s1.study();
    }
}
