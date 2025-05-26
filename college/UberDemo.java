package college;
abstract class Uber{
    abstract void bookRide();
    abstract void economeyRide();
    abstract void primiumRide();
    abstract void cancleRide();

    
}

abstract class UberX extends Uber{
    void bookRide(){
        System.out.println("Book uberX ride.");
    }

    void economeyRide(){
        System.out.println("Book economy ride.");
    }

    void primiumRide(){
        System.out.println("Book primium ride.");
    }

    void cancleRide(){
        System.out.println("Cancle ride.");
    }
}
public class UberDemo {
    public static void main(String[] args) {
        UberX u1 = new UberX() {
            
        };
        
        u1.bookRide();
        u1.economeyRide();
        u1.primiumRide();
        u1.cancleRide();
    }
}
