package week1.homeassignment;

public class Library {
	
	public String addBook(String bookTitle) {
		System.out.println(bookTitle+" Book added successfully");
		return bookTitle;
	}
	
	public void issueBook() {
		System.out.println("Book issued successfully");
	}
	
	public static void main(String[] args) {
		Library a = new Library();
		a.addBook("Java Fundamentals");
		a.issueBook();
	}
}
