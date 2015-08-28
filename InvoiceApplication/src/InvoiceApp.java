
/**
 * 
 */

/**
 * @author Neha
 *
 */

import java.util.Scanner;

public class InvoiceApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Product myProduct;
		LineItem myItem;;
		Invoice myInvoice = new Invoice();
		
		// temp variables
		String code;
		int quantity;
		
		
		System.out.println("Welcome to the Invoice application.\n\n");
		
		while(myInvoice.getUserChoice().equalsIgnoreCase("y")){
			myProduct= new Product();
			code = Validator.validateCode(sc, "Enter the product code:\t");
			myProduct.setItemCode(code);

			System.out.print("Enter quantity:\t");
			quantity = sc.nextInt();

			if(!Validator.validateQuantity(quantity))
			{
				System.out.println("Invalid quantity entered");
				continue;		
			}
			myItem= new LineItem(myProduct,quantity);
	
			myInvoice.addItem(myItem);
			System.out.print("\nAnother line item? (y/n):\t");
			myInvoice.setUserChoice(sc.next());
		}
		System.out.println("\nCode\t\t Description\t\t\t Price\t\t  Qty\t\tTotal" 
				+ "\n------\t-------------------------------\t\t--------------\t-------  -------------" );
		System.out.println(myInvoice);
	}

}
