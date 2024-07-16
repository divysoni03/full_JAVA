// 2. Book Class: Design a `Book` class with a constructor to store information about a book, including its title, author, and publication year.

class Book{
	private String bookTitle;
	private String bookAuthor;
	private int bookYear;
	
	//constructors
	public Book() {
		this.bookTitle = "";
		this.bookAuthor = "";
		this.bookYear = 0;
	}
	public Book(String bookTitle,String bookAuthor,int bookYear) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookYear = bookYear;
	}
	public Book(Book sampleBook) {
		this.bookTitle = sampleBook.bookTitle;
		this.bookAuthor = sampleBook.bookAuthor;
		this.bookYear = sampleBook.bookYear;
	}

	//methods
	void displayBook() {
		System.out.println("Book Title :" + this.bookTitle);
		System.out.println("Book Author :" + this.bookAuthor);
		System.out.println("Book Year :" + this.bookYear);
	}
}

public class Task2{
	public static void main(String[] args) {
		Book b1 = new Book("Harry potter","Harry",1991);
		Book b2 = new Book(b1);

		b1.displayBook();
		b2.displayBook();
	}
}