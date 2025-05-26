package college;
class Books {
    String title;
    String author;
    double price;

    public void displayBookDetails(){
        System.out.println("Book Title:" + title);
        System.out.println("Author:" + author);
        System.out.println("Price: $" + price);
    }
}
public class Book {
    public static void main(String[] args) {
        Books book1 = new Books();

        book1.title = "Java programming";
        book1.author = "James Gosling";
        book1.price = 45.99;

        book1.displayBookDetails();
    }
}
