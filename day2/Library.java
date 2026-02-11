package week2.day2;

public class Library {

	// Declaring the methods outside main method

	// The method will return a value of type String and has return Keyword
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}

	// The method will not return any value as it is void
	public void issueBook() {
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating object for the methods

		Library libraryobject = new Library();
		// passing value to the input variable
		String addBook = libraryobject.addBook("Davinci Code");
		System.out.println("Book Name : " + addBook);
		libraryobject.issueBook();
	}

}
