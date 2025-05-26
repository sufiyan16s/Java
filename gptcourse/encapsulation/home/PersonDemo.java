package gptcourse.encapsulation.home;

class Person{
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age >= 0){
            this.age = age;
        } else {
            System.out.println("Age can't be negative!");
        }
    }
}
public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.setName("Sufiyan");
        p1.setAge(21);

        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());

        Person p2 = new Person();

        p2.setName("Monaz");
        p2.setAge(21);

        System.out.println("Name: " + p2.getName());
        System.out.println("Age: " + p2.getAge());
    }
}
