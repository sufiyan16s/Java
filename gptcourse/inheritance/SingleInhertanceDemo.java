package gptcourse.inheritance;

class A {
    void displayA(){
        System.out.println("Class A");
    }
}

class B extends A{
    void displayB(){
        System.out.println("Class B");
    }
}
public class SingleInhertanceDemo {
    public static void main(String[] args) {
        B obj = new B();

        obj.displayA();
        obj.displayB();
    }
}
