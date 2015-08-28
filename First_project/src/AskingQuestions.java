/**
 * 
 */

/**
 * @author Neha
 *
 */
import java.util.Scanner;
public class AskingQuestions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// scanner instance to read the input
		Scanner keyboard = new Scanner(System.in);
		// variables of data type int
		int num1, num2, num3;
		
		// ask the user to enter first temperature
		System.out.print( "First temperature? " );
		num1 = keyboard.nextInt();

		//ask the user to enter second temperature
		System.out.print( "Second temperature? " );
		num2 = keyboard.nextInt();
		
		// calculate average
		num3 = (num1+num2)/2;
		// print the average
		System.out.println("The average value is : " + num3);
			
		// close the scanner
		keyboard.close();
	}
}
