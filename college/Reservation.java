package college;
import java.util.*;

class Passenger{
    String name;
    int age;

    
}

class Train{
    static int availableSeats = 200;


     int reserveSeat(int seats){
        availableSeats -= seats;
        System.out.println("Available seat:" + availableSeats);
        return availableSeats;
        

    }
}
public class Reservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Passenger p1 = new Passenger();
        p1.name = sc.nextLine();
        p1.age = sc.nextInt();

        int seat = sc.nextInt();

        Train t1 = new Train();
        t1.reserveSeat(seat);
    }
    
}
