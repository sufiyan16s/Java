package gptcourse.inheritance;

class Parent{

    void speak(){
        System.out.println("I am the parent");
    }
}

class Child extends Parent{

    void play(){
        System.out.println("I am the child.");
    }
}
public class ParentDemo {
    public static void main(String[] args) {
        Child c1 = new Child();

        c1.speak();
        c1.play();
    }
}
