package week2.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating object for the methods in the class Library

		Library libraryobject = new Library();
		// passing value to the input variable
		String addBook = libraryobject.addBook("Davinci Code");
		System.out.println("Book Name : " + addBook);
		libraryobject.issueBook();

	}

}
