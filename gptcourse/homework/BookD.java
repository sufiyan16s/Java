package gptcourse;

class Book{
    String title;
    String author;

    void displayInfo(){
        System.out.println(title + " of book");
        System.out.println(author + " of book");
    }
}

public class BookD {
    public static void main(String[] args){
        Book b1 = new Book();
        b1.title = "Harry Potter";
        b1.author = "J.K.Rowling";

        b1.displayInfo();
    }
}
