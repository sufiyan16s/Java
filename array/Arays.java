package array;

public class Arays {
    public static void main(String[] args) {
        //int[] marks = new int[3];
        int marks[] = new int[3]; // array declaration and instantiation
        //int marks[] = {95, 85, 90}; // array initialization
        //int marks[] = new int[]{95, 85, 90}; // array initialization
        marks[0] = 95;
        marks[1] = 85;
        marks[2] = 90;

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        for(int i=0; i<3; i++) {
            System.out.println(marks[i]);
        }
    }
    
}
