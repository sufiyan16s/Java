package gptcourse.inheritance;

// Single Inheritance
class Animal{
    void eat(){
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("The dog barks ");
    }
}
public class AnimalDemo {
    public static void main(String[] args){
        Dog d1 = new Dog();

        d1.eat();
        d1.bark();
    }
}
