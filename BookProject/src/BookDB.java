/**
 * 
 */

/**
 * @author Neha
 *
 */
public class BookDB {
	
	public static BookClass getBook(String bookCode){
		// create book object
		BookClass myBook = new BookClass();
		
		// fill the book object with data
		myBook.setBookCode(bookCode);
		// look up for the code entered and provide respective description
		if (bookCode.equalsIgnoreCase("J101"))
		{
			myBook.setBookTitle("Just Java");
			myBook.setDescription("Introduction to Java");
			myBook.setPrice(49.99);
			myBook.setInStock(true);
		} else if (bookCode.equalsIgnoreCase("DB101"))
		{
			myBook.setBookTitle("Database concepts");
			myBook.setDescription("Database and SQL Learning");
			myBook.setPrice(59.99);
			myBook.setInStock(false);
		} else{
			myBook.setBookTitle("Unknown");
			myBook.setDescription("unknown book");
			System.out.println("The book is code is inncorrect");

		}
		// return the book object
		return myBook;
		
	}
}
