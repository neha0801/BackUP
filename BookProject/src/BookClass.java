
/**
 * To Create a Book class that allows for Book title, author, description, price and isInStock variables
 * Also to create a method that returns the pricing for a requested number of books. 
 * for example, five books at $20.00 should return $100, if they are in stock. 
 * If they are not in stock, that should be handled appropriately
 */

/**
 * @author Neha
 *
 */

public class BookClass {

	// variable for the details of the book
	String bookCode;
	
	String bookTitle;
	String author;
	String description;
	double price;
	boolean isInStock = true;
	
	// getters and setters for the book details
	
	//method to get book code
	public String getBookCode() {
		return bookCode;
	}

	// method to set book code
	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}

	//method to get book title
	public String getBookTitle() {
		return bookTitle;
	}
	
	// method to set book title
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	// method to get author
	public String getAuthor() {
		return author;
	}
	//method to set author
	public void setAuthor(String author) {
		this.author = author;
	}
	//method to get description
	public String getDescription() {
		return description;
	}
	//method to set description
	public void setDescription(String description) {
		this.description = description;
	}
	
	//method to get price
	public double getPrice() {
		return price;
	}
	//method to Set price
	public void setPrice(double price) {
		this.price = price;
	}
	
	//method to get the status of stock
	public boolean isInStock() {
		return isInStock;
	}
	//method to set the status of stock
	public void setInStock(boolean isInStock) {
		this.isInStock = isInStock;
	}
	
	/**
	 * method to compute the total price based on the number of books requested
	 * @param noOfBooks
	 * @return
	 */
	public double totalPrice(int noOfBooks){

		// if the books are in stock compute the total price
		if(this.isInStock){
			return noOfBooks*this.getPrice();
		}else{
			// if the books are not in stock print out of stock message and return 0.0
			System.out.println("The requested book is out of Stock");
			return 0.0;
		}			
	}
}
