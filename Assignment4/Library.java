import java.util.*;

public class Library {
	String address;
	// need a list or array that holds the list of added book; or a hashmap or set. 
	ArrayList<Book> BookList = new ArrayList<Book>();
	String openingHours;
	public Library(String name){
		this.address = name;
	}
	
	public void addBook(Book newBook) {
		this.BookList.add(newBook);
	}
	
	public void setOpeningHours(String hours) {
		this.openingHours = hours;
	}
	
	public void printOpeningHours() {
		System.out.println(this.openingHours);
	}
	
	public String printAddress() {
		return this.address;
	}
	
	public void borrowBook(Book newBook) {
		if (BookList.contains(newBook)){
			newBook.borrowed = true;
			BookList.remove(newBook);
		} else {
			System.out.println("Book not available in the Library");
		}
	}
	public void printAvailableBooks() {
		for (int i = 0; i < BookList.size(); i++) {
		     System.out.println(BookList.get(i));
		}
	}
	
	public void returnBook(Book newBook) {
		if (newBook.borrowed == false) {
			System.out.println("Press Y if you want to donate the book");
			Scanner scn = new Scanner(System.in);
			String str = scn.nextLine();
			if (str == "Y") {
				BookList.add(newBook);
			}
			else {
				System.out.println("This Book does not belong to us.");
		}
	}
	}
	
	public static void main(String[] args) {
		Library firstLibrary = new Library("10 Main St.");
		Library secondLibrary = new Library("228 Liberty St.");
		// Add four books to the first library
		firstLibrary.addBook(new Book("The Da Vinci Code"));
		firstLibrary.addBook(new Book("Le Petit Prince"));
		firstLibrary.addBook(new Book("A Tale of Two Cities"));
		firstLibrary.addBook(new Book("The Lord of the Rings"));
		// Print opening hours and the addresses
		System.out.println("Library hours:");
		firstLibrary.printOpeningHours();
		System.out.println();
		System.out.println("Library addresses:");
		firstLibrary.printAddress();
		secondLibrary.printAddress();
		System.out.println();
		// Try to borrow The Lords of the Rings from both libraries
		System.out.println("Borrowing The Lord of the Rings:");
		firstLibrary.borrowBook(new Book("The Lord of the Rings"));
		firstLibrary.borrowBook(new Book("The Lord of the Rings"));
		secondLibrary.borrowBook(new Book("The Lord of the Rings"));
		System.out.println();
		// Print the titles of all available books from both libraries
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Books available in the second library:");
		secondLibrary.printAvailableBooks();
		System.out.println();
		// Return The Lords of the Rings to the first library
		System.out.println("Returning The Lord of the Rings:"); 
		firstLibrary.returnBook(new Book("The Lord of the Rings")); System.out.println();
		// Print the titles of available from the first library
		System.out.println("Books available in the first library:"); firstLibrary.printAvailableBooks();

	}

}
