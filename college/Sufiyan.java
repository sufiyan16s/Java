package college;

public class Sufiyan {
    public static void main(String[] args) {
        System.out.println("Hello, Sufiyan!");
    }
    public void display() {
        System.out.println("This is a method in the Sufiyan class.");
    }
    public void display(String message) {
        System.out.println("Message: " + message);
    }
    public void display(int number) {
        System.out.println("Number: " + number);
    }
    public void display(String message, int number) {
        System.out.println("Message: " + message + ", Number: " + number);
    }
    public void display(int number, String message) {
        System.out.println("Number: " + number + ", Message: " + message);
    }
    public void display(String message, int number, String extraMessage) {
        System.out.println("Message: " + message + ", Number: " + number + ", Extra Message: " + extraMessage);
    }
    public void display(int number, String message, String extraMessage) {
        System.out.println("Number: " + number + ", Message: " + message + ", Extra Message: " + extraMessage);
    }
    
}
