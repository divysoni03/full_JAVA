// 12. Overloading Constructors:
//    Design a 'Book' class with fields for 'title', 'author', and 'price'. Implement multiple constructors: one default, one that takes only 'title' and 'author', and another that takes all three fields. Write a method to display book details.

class Books {
    private String bookTitle;
    private String bookAuthor;
    private double bookPrice;
    
    public Books() {
        this.bookTitle = "";
        this.bookAuthor = "";
        this.bookPrice = 0.0;
    }
    public Books(String bookTitle, String bookAuthor, double bookPrice) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
    }
    public Books(String bookTitle, String bookAuthor) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    void displayBook() {
        System.out.println("Book Details,");
        System.out.println("Book Title :" + this.bookTitle);
        System.out.println("Book Author :" + this.bookAuthor);
        System.out.println("Book Price :" + this.bookPrice);
    }
}

public class Task12 {
    public static void main(String[] args) {
        Books b1 = new Books("Harry potter","harry", 250);
        b1.displayBook();
    }
}
