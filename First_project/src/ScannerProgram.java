/**
 * 
 */

/**
 * @author Neha
 *
 */
import java.util.Scanner;
public class ScannerProgram {

	/**
	 * @param args
	 * Program to show how to use Scanner example
	 */
	public static void main(String[] args) {
		 //Print the message to enter some data
		 System.out.println("Enter: ");
		 // create a scanner instance and use to get a input from the console
		 Scanner input = new Scanner(System.in);
		 // declare a string variable
		 String str;
		 //save the first line from the console to a str
		 str = input.nextLine();
		 // print out the data from str variable
		 System.out.println(str);
		 input.close();
	}
}
