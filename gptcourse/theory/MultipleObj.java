package gptcourse.theory;


public class MultipleObj {
    public static void main(String[] args) {

        // Creating multiple objects
        Student s = new Student();
        Student s2 = new Student();
        s.name = "Md Sufiyan";
        s2.name = "Niraj";
        s.age = 21;
        s2.age = 22;

        s.study();
        s2.study();
    }
    
}
