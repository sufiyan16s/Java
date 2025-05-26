package gptcourse.inheritance;

class A{
    void displayA(){
        System.out.println("Class A");
    }
}

class B extends A{
    void displayB(){
        System.out.println("Class B");
    }
}

class C extends B{
    void displayC(){
        System.out.println("Class C");
    }
}
public class Multilevel {
    public static void main(String[] args){
        C c1 = new C();

        c1.displayA();
        c1.displayB();
        c1.displayC();
    }
}
