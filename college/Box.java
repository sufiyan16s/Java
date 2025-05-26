package college;
import java.util.*;

class Boxs{
    int length;
    int width;
    int height;

    void caslculateVolume(){
        int volume;
        volume = length*width*height;
        System.out.println("Volume= " + volume);
    }
}
public class Box {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Boxs b1 = new Boxs();

        b1.length = sc.nextInt();
        b1.width = sc.nextInt();
        b1.height = sc.nextInt();

        b1.caslculateVolume();
    }
    
}
