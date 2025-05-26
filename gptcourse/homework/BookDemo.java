package gptcourse;

class BookS{
    String title;
    String author;

    //constructor
    BookS(String t, String a){
        title = t;
        author = a;
    }

    void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
public class BookDemo {
    public static void main(String[] args){
        BookS b1 = new BookS("Harry Potter", "J.K Rowling");

        b1.displayInfo();
    }
    
}
