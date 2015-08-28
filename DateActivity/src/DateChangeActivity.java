import java.util.Date;
import java.text.SimpleDateFormat;

public class DateChangeActivity {

	public static void main(String[] args) {
		
		Date now = new Date();
		
		SimpleDateFormat date1 = new SimpleDateFormat("dd MMM yyyy");
		SimpleDateFormat date2 = new SimpleDateFormat("hh:mm:ss a");

		
		System.out.println("Today's date is:\n" + date1.format(now));
		System.out.println("Current Time is:\n " + date2.format(now));
	}

}