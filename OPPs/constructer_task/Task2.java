// 2. Book Class: Design a `Book` class with a constructor to store information about a book, including its title, author, and publication year.

class Book{
	private String bookTitle;
	private String bookAuther;
	private int bookYear;
	
	//constructors
	public Book() {
		this.bookTitle = "";
		this.bookAuther = "";
		this.bookYear = 0;
	}
	public Book(String bookTitle,String bookAuther,int bookYear) {
		this.bookTitle = bookTitle;
		this.bookAuther = bookAuther;
		this.bookYear = bookYear;
	}
	public Book(Book sampleBook) {
		this.bookTitle = sampleBook.bookTitle;
		this.bookAuther = sampleBook.bookAuther;
		this.bookYear = sampleBook.bookYear;
	}

	//methods
	void displayBook() {
		System.out.println("Book Title :" + this.bookTitle);
		System.out.println("Book Auther :" + this.bookAuther);
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