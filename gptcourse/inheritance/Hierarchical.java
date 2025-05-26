package gptcourse.inheritance;

class A{
    void displayA(){
        System.out.println("Class A");
    }
}

class B extends A {
    void displayB(){
        System.out.println("Class B");
    }
}

class C extends A {
    void displayC(){
        System.out.println("Class C");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        B b1 = new B();
        C c1 = new C();

        b1.displayA();
        b1.displayB();

        c1.displayA();
        c1.displayC();
    }
}
