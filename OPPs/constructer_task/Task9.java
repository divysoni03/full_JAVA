// 9. Library Book Class: Design a `LibraryBook` class with a constructor that includes the book's title, author, and a boolean indicating whether it's checked out.

class Library {
    private String bookTitle;
    private String bookAuthor;
    private boolean bookStatus;

    public Library() {
        this.bookAuthor = "";
        this.bookTitle = "";
        this.bookStatus = true;
    }
    public Library (String bookTitle,String bookAuthor) {
        this.bookAuthor = bookAuthor;
        this.bookTitle = bookTitle;
        this.bookStatus = true;
    }

    void display() {
        System.out.println("--- Book Details ---");
        System.out.println("Book Title :" + this.bookTitle);
        System.out.println("Book Auther :" + this.bookAuthor);
        System.out.println("Book Status :" + this.bookStatus);
    }

    boolean borrowBook() {
        if(this.bookStatus) {
            this.bookStatus = false;
            System.out.println("Book Is borrowed Successfully.");
            return true;
        }
        else {
            this.bookStatus = true;
            System.out.println("Book Is now available !");
            return false;
        }
    }
}

public class Task9 {
    public static void main(String[] args) {
        Library b1 = new Library("Harry potter","michel jection");
        b1.display();
        b1.borrowBook();
        b1.display();
    }
}
