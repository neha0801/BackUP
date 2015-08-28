import java.util.Scanner;

public class Validator {
	
	public static String validateCode(Scanner sc, String prompt) {
		System.out.print(prompt);
		String s = sc.next(); // read user entry
		sc.nextLine(); // discard any other data entered on the line
		return s;
	}
	
	public static boolean validateQuantity(int quantity){
		if(quantity<=0 || quantity >50)
				return false;
		else
			return true;
	}
	
	public static boolean validatePrice(double price){
		if(price<0 || price >=1000)
				return false;
		else
			return true;
	}
}
