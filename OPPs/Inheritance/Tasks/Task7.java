// 7. Static Block and Static Methods in Single Inheritance:
//    - Problem Statement: Create a single inheritance setup with classes 'Library' and 'Book'. The 'Library' class should have a static block to initialize a static variable 'libraryName', and a static method 'showLibraryInfo()'. The 'Book' class should have attributes 'title' and 'author', and a method 'showBookInfo()'. Demonstrate the use of static blocks, static methods, and the 'super' keyword.

class Library {
    private static String libraryName;

    static {
        libraryName = "vedant";
    }
    public Library(String libraryName) {
        Library.libraryName = libraryName;
    }

    public static void showLibraryInfo() {
        System.out.println("Library Name :" + libraryName);
    }
}
class Books extends Library{
    private String title;
    private String author;
    public Books (String libraryName,String title, String author) {
        super(libraryName);
        this.title = title;
        this.author = author;
    }

    public void showBookInfo() {
        System.out.println("-- Book Info --");
        super.showLibraryInfo();
        System.out.println("Book Title :" + this.title);
        System.out.println("Book Author :" + this.author);
    }
}

public class Task7 {
    public static void main(String []args) {
        Books b1 = new Books("national library", "harry potter", "harry");
        b1.showBookInfo();
    }
}
