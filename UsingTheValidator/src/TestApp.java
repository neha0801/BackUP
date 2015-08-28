import java.util.Scanner;

public class TestApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// get the input from the user
			String name = Validator.getString(sc, "Enter name: ");
			int age = Validator.getInt(sc, "Enter age (1-100): ", 1, 100);
			int height = Validator.getInt(sc,
					"Enter your height (36 - 92 inches): ", 32, 92);
			int weight = Validator.getInt(sc,
					"Enter your weihgt (80 - 400 lbs): ", 80, 400);
			double decNum = Validator.getDouble(sc,
					"Enter your favorite decimal number (0-1): ", 0, 1);

			System.out.println("\nName:  \t" + name + "\nAge:   \t" + age
					+ " years" + "\nHeight:\t" + height + " inches"
					+ "\nWeight:\t" + weight + " lbs" + "\nFavorite Decimal: "
					+ decNum);
			// see if the user wants to continue
			choice = Validator.getString(sc, "Another assignment? (y/n): ");
			System.out.println();
		}
		System.out.println("Good Bye");
	}
}