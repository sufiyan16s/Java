package gptcourse.inheritance;

class Animals{
    void eat(){
        System.out.println("Eating...");
    }
}

class Dogs extends Animals{
    void bark(){
        System.out.println("Barking...");
    }
}

class Puppy extends Dogs{
    void weep(){
        System.out.println("Weeping...");
    }
}

public class AnimalMultilevel {
    public static void main(String[] args) {
        Puppy p1 = new Puppy();
        p1.eat();
        p1.bark();
        p1.weep();
    }
}
