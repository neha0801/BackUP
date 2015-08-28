
/**
 * 
 */

/**
 * 
 * @author Neha
 *
 */
import java.util.Scanner;

public class BoookApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// display a welcome message
		System.out.println("Welcome to the Book Selector");
		System.out.println();
		
		//display books
		Scanner keyboard = new Scanner(System.in);
		String choice = "y";
		String bookCode;
		int noOfBooks =0;
		while (choice.equalsIgnoreCase("y")){
			// prompt user for input
			System.out.println("Enter the book code: ");
			bookCode =keyboard.next();
			// prompt user for number of books required
			System.out.println("Enter the number of books required: ");
			noOfBooks = keyboard.nextInt();
			keyboard.nextLine(); // discard any input after that
			// create a Book object
			BookClass myBook = BookDB.getBook(bookCode);
			// display the output in a formatted way
			System.out.println("--------------------------------------------");
			System.out.println("Selected Book");
			System.out.println("Book Title: " + myBook.bookTitle);
			System.out.println("Book Description: " + myBook.description);
			System.out.println("Price of one book: " + myBook.price);
			System.out.println("Total Price: " + myBook.totalPrice(noOfBooks));
			System.out.println("--------------------------------------------");
			
			// check with user to continue.
			System.out.println("Continue? (y/n): ");
			choice = keyboard.nextLine();
		}
		// close the scanner
		keyboard.close();
	}

}
