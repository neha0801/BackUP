
/**
 * 
 */

/**
 * @author Neha
 *
 */
import java.util.Scanner;

public class MyCalc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		Scanner keyboard = new Scanner(System.in);
		calc.setUserChoice(keyboard.next());
		
		while(calc.getUserChoice().equalsIgnoreCase("y")){
			System.out.print("What is the first number:\t");
			calc.setOperand1(keyboard.nextDouble());
			
			System.out.println("1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division\n5 - Modulus");
			
		}
		
	}

}
