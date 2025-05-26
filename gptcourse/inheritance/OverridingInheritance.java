package gptcourse.inheritance;



class Car{
    void drive(){
        System.out.println("Car is driving..");
    }
}

class Brand extends Car{
    @Override
    void drive(){
        System.out.println("Brand is BMW..");
    }
}


public class OverridingInheritance {
    public static void main(String[] args){
        Car c1 = new Brand();

        c1.drive();
    }
}
