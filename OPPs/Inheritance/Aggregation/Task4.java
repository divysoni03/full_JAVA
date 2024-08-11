// 4. Aggregation:
//    Implement a Java program to simulate a library system where you have classes for "Library," "Book," and "Member." Show the relationship between the library and its books using aggregation.
import java.util.Scanner;

class Book{
    private int ISBN;
    private String title;
    private String auther;
    private double price;
    private boolean isBorrowed;
    public Book(int ISBN, String title, String auther, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.auther = auther;
        this.price = price;
        this.isBorrowed = false;
    }

    public Book() {}

    public void setISBN(int ISBN) {this.ISBN = ISBN;}
    public void setTitle(String title) {this.title = title;}
    public void setAuther(String auther) {this.auther = auther;}
    public void setPrice(double price) {this.price = price;}
    public void setBorrowed() {
        if(this.isBorrowed) this.isBorrowed = false;
        else this.isBorrowed = true;
    }

    public void showInfo() {
        System.out.println("-- About Book --");
        System.out.println("ISBN :" + this.ISBN);
        System.out.println("Title :" + this.title);
        System.out.println("Auther :" + this.auther);
        System.out.println("Price :" + this.price);
        System.out.println("Availibility : " + (isBorrowed?"Not Available":"Available"));
    }
}
class Library{
    private int libraryId;
    private String libraryName;
    private Book[] books;
    private int bookCount;
    Scanner sc = new Scanner(System.in);

    public Library(int libraryId, String libraryName, int capacity) {
        this.libraryId = libraryId;
        this.libraryName = libraryName;
        this.books = new Book[capacity];
        this.bookCount = 0; 
    }

    public int inputISBN() {
        System.out.print("Enter ISBN : ");
        return sc.nextInt();
    }
    public String inputTitle() {
        System.out.print("Enter Book Title : ");
        sc.nextLine();
        return sc.nextLine();
    }
    public String inputAuther() {
        System.out.print("Enter Auther : ");
        return sc.nextLine();
    }
    public double inputPrice() {
        System.out.print("Enter Price : ");
        return sc.nextDouble();
    }

    public void addBook() {
        if(bookCount >= books.length) {
            System.out.println("Error: max books reached can not add more.");
            return;
        }
        books[bookCount++] = new Book(inputISBN(), inputTitle(), inputAuther(), inputPrice());
        // books[bookCount].setTitle(inputTitle());
        // books[bookCount].setISBN(inputISBN());
        // books[bookCount].setAuther(inputAuther());
        // bookCount++;
        // books[bookCount].setPrice(inputPrice());
    }
    public void borrowBook() {
        System.out.println("Enter ISBN no :");
        int tempISBN = sc.nextInt();
        books[tempISBN].setBorrowed();
    }
    public void displayAllBooks() {
        for(int i=0;i<bookCount;i++) {
            books[i].showInfo();
        }
    }
    public void showInfo() {
        System.out.println("-- About Library --");
        System.out.println("Library Id :" + this.libraryId);
        System.out.println("Library Name :" + this.libraryName);
    }
}

public class Task4 {
    public static void main(String []args) {
        Library l1 = new Library(101, "Main library", 10);
        l1.addBook();
        l1.addBook();
        l1.showInfo();
        l1.displayAllBooks();
    }
}
