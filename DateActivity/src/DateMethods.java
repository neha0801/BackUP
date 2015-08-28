import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateMethods {

	private Date dateEntered;
	private String userInput;
	private String expectedPattern;
	private SimpleDateFormat formattedDate ;
	private Date currentDate;
	private GregorianCalendar cal = new GregorianCalendar();
	private String weekDay;
	private int temperature;
	private String dayTemp;
	private String userChoice;
	
	static final int MILLS_IN_DAY = 24 * 60 * 60 * 1000;
	
	
	public DateMethods(){
		this.dateEntered = null;
		this.userInput = "";
		this.expectedPattern  = "MMM dd yyyy";
		this.formattedDate = new SimpleDateFormat(expectedPattern);
		this.currentDate = new Date();
		this.weekDay="";
		this.temperature = 70;
		this.dayTemp ="sunny";
		this.userChoice="y";
	}


	public Date getDateEntered() {
		return dateEntered;
	}

	public void setDateEntered(Date dateEntered) {
		this.dateEntered = dateEntered;
	}


	public String getUserInput() {
		return userInput;
	}


	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}

	public String getWeekDay() {
		return weekDay;
	}


	public void setWeekDay(String weekDay) {
		this.weekDay = weekDay;
	}


	public GregorianCalendar getCal() {
		return cal;
	}


	public void setCal(GregorianCalendar cal) {
		this.cal = cal;
	}
	
	public Date getCurrentDate() {
		return currentDate;
	}


	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}
	
	public String getDayTemp() {
		return dayTemp;
	}


	public void setDayTemp(String dayTemp) {
		this.dayTemp = dayTemp;
	}


	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}


	public int getTemperature() {
		return temperature;
	}

	
	public String getUserChoice() {
		return userChoice;
	}


	public void setUserChoice(String userChoice) {
		this.userChoice = userChoice;
	}

	/**
	 * calculate the number of days from today
	 * @return difference of today's date and date entered in number of days
	 */
	public int getDateDiff(){
		long diff;
		diff = this.currentDate.getTime() - this.dateEntered.getTime();
		return (int)(diff/MILLS_IN_DAY);
	}
	
	/**
	 * Change the date entered in string format to date format
	 */
	
	public void changeStringToDate()
	{
		String input = this.getUserInput();
		
		try
		{
			this.setDateEntered(this.formattedDate.parse(input));
			this.getCal().setTime(this.getDateEntered());
			
		} catch(ParseException e)
		{
			// if incorrect format is entered for date exit the application
			System.out.println("Incorrect date Format. Run the application again. Good Bye!!");
			System.exit(1);
		}
	}

	/**
	 *  to set the specific temperature information
	 */
	public void getTemp(){
		int day = this.cal.get(Calendar.DAY_OF_MONTH);
		int month = this.cal.get(Calendar.MONTH);

		if (day<=15 && month <=4){
			 this.setTemperature(65);
			 this.setDayTemp("cloudy");
		}
		else if (day>15 && month<=4){
			 this.setTemperature(72);
			 this.setDayTemp("mostly cloudy");
		}
		else if (month>4 && month<=10){
			this.setTemperature(79);
			this.setDayTemp("sunny");
		}
		else if (month>10){
			this.setTemperature(60);
			this.setDayTemp("cloudy");
		}
	}
	
}
