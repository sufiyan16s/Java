package college;

public class Animal {
    String name = "Generic Animal";


    class Dog extends Animal{
        String name = "Dog";


        Dog() {
            super("Buddy");
            System.out.println("");
        }
    }
    
}
