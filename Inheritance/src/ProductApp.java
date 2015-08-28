
/**
 * 
 */

/**
 * @author Neha
 *
 */
import java.util.Scanner;

public class ProductApp {

	/**
	 * main function to print the details of item requested
	 * @param args
	 */
	public static void main(String[] args) {
		
		// create object for book and software class
		Book myBook = new Book();
		Book newBook = new Book();
		Software mySoftware = new Software();
		Software newSoftware = new  Software();
		// input variables
		int productType = 0;
		Scanner keyboard = new Scanner(System.in);
		int record[] = new int[6];
		int code;
		String choice = "y";
		
		// loops runs till user want to enter data
		while(choice.equalsIgnoreCase("y"))
		{			
			// prompt user for product type
			System.out.println("Enter a product type (1 for Book and 2 for Software): ");
			productType = keyboard.nextInt();
		
			// if user wants a book detail
			if (productType == 1)
			{
				System.out.println("Enter the Product code: \n 1 for Book1 \n 2 for Book2 \n 3 for Software1 \n 4 for Sofwtare2 ");
				code = keyboard.nextInt();
				// increment the flag for book count in array record
				record[0] += 1;
				// if user wants book B1
				if (code == 1)
					record[2] +=1; // increment the count for book1 in array record
				else if (code == 2)		// if user wants book2
					record[3] =1; // increment the count for book2 in array record
				else
					System.out.println("Incorrect code entered");	// if user entered any other input
			} else if (productType == 2) 	// when user wants a software details
			{
				// prompt user for product code
				System.out.println("Enter the Product code: \n 1 for Book1 \n 2 for Book2 \n 3 for Software1 \n 4 for Sofwtare2 ");
				code = keyboard.nextInt();
				// increment the software count flag in the array 
				record[1] +=1;
				// if user wants software1
				if (code == 3)
					record[4] +=1; 	// increment the counter for software1 in array
				else if (code == 4) 		// if user wants software2
					record[5] =1;				// increment the counter for software2 in array
				else
					System.out.println("Incorrect code entered"); // if user enters incorrect code
				
			}else
				System.out.println("Incorrect code entered"); // if user enters incorrect product type
				
			// ask user if he wants to continue
			System.out.println("Do you want to see any other product (y/n): ");
			choice = keyboard.next();
		}
		
		// if  user requested for Book1
		if (record[2]>0)
		{
			myBook.setCode("B1");
			myBook.setDescription("Little women: Victorian bestseller about a New England family of girls. ");
			myBook.setAuthor("Louisa M. Alcott");
			myBook.setPrice(59.99);
			System.out.println(myBook.toString());
		}
		//if  user requested for Book2
		if (record[3]>0){
			myBook.setCode("B2");
			myBook.setDescription("Alice's Adventures In Wonderland: A story written for the nine-year-old daughter of an "
					+ "Oxford don that still baffles most kids.  ");
			myBook.setAuthor(" Lewis Carroll ");
			myBook.setPrice(39.99);
			System.out.println(myBook.toString());
		}
		//if  user requested for Software1
		if (record[4]>0){
			mySoftware.setCode("S1");
			mySoftware.setDescription("Firefox: a web browser ");
			mySoftware.setVersion("4.5V");
			mySoftware.setPrice(19.99);
			System.out.println(mySoftware.toString());
		}
		// if user requested for Software2
		if (record[5]>0){
			mySoftware.setCode("S2");
			mySoftware.setDescription("OS x Yosemite ");
			mySoftware.setVersion("10.10.4 Update");
			mySoftware.setPrice(29.99);
			System.out.println(mySoftware.toString());
		}
		
		// code to test the equals function
		newBook.setCode("B1");
		newBook.setAuthor("Louisa M. Alcott");
		newSoftware.setCode("S2");
		if (newBook.equals(myBook)){
			System.out.println("This book is a classic");
		}
		if (newSoftware.equals(mySoftware)){
			System.out.println("This software is an update patch");
		}
		
		
		// close the scanner
		keyboard.close();
	}
	
}
