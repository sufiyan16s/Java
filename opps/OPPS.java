package opps;

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }
}

public class OPPS {
    public static void main(){
        Pen pen1 = new Pen();

        pen1.color = "Blue";
        pen1.type = "gel";

        pen1.write();
    }
    
}
