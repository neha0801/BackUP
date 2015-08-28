

/**
 * 
 */

/**
 * @author Neha
 *
 */

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DataActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DateMethods myDateObj = new DateMethods(); 
		Scanner keyboard = new Scanner(System.in);
		SimpleDateFormat dayOfWeek  = new SimpleDateFormat("EEEE"); ;
		int dateDiff = 0;
		
		// till user wants to enter date. will terminate if date is not in correct format
		while(myDateObj.getUserChoice().equalsIgnoreCase("y"))
		{
		
			System.out.println("What is the date that you are asking about? "
					+ "\nDate should be in format as MMM dd yyyy(eg: Aug 01 1988):");
			
			// set input value
			myDateObj.setUserInput(keyboard.nextLine());
			// change the string value entered into Date format 
			myDateObj.changeStringToDate();
			// find the day of week for the given date
			myDateObj.setWeekDay(dayOfWeek.format(myDateObj.getDateEntered()));
			
			// get the difference in terms of number of days
			dateDiff = myDateObj.getDateDiff();
	
			// set the temperature according to date entered
			myDateObj.getTemp();

			// print output based on the difference in number of days 
			if (dateDiff <0){
				System.out.println("This is a future date.");
			}else if (dateDiff==0){
				System.out.println("Today is " + myDateObj.getWeekDay() + ".");
			}else{
				System.out.println("That was a " + myDateObj.getWeekDay() + ". It was a " + myDateObj.getDayTemp() +
						" day and the temperature averaged " + myDateObj.getTemperature() 
						+ " degrees. It was " + dateDiff + " days ago.");
			}
			
			System.out.print("Do you want to continue? (y/n):\t");
			myDateObj.setUserChoice(keyboard.nextLine());
			
			//if user enters something else except Y or N
			if (!myDateObj.getUserChoice().equalsIgnoreCase("n") && !myDateObj.getUserChoice().equalsIgnoreCase("y")){
				System.out.println("Incorrect input.");
			}	
		}// loop ends here
		
		// close the scanner
		keyboard.close();
		System.out.println("Good Bye!!");
	}
	
}


