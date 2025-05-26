package college;

class Studen{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Studen(Studen S2) {
        this.name = S2.name;
        this.age = S2.age;
    }

    Studen(){

    }
}

public class Stude {
    public static void main(String[] args){
        Studen S1 = new Studen();
        S1.name = "sufiyan";
        S1.age = 21;

        Studen S2 = new Studen(S1);
        S2.printInfo();
    }
}
