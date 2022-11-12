package dateAndTimeInJava;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class LearnDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormatExample();
		CalendarExample();
	}
	
	public static void SimpleDateFormatExample () {
		
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/YYYY");
		String formattedDate = dateFormatter.format(date);
		System.out.println("formatted date is:" + formattedDate);
		LocalDateTime now = LocalDateTime.now();
		System.out.println("LocalDateTime for now is : "+ now);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd");
		System.out.println("Formatted LocalDateTime for now is : "+ dtf.format(now));
	}
	
	public static void CalendarExample() {
		Calendar calendar = Calendar.getInstance();
		System.out.println("Calendar type is: "+calendar.getCalendarType());
		System.out.println("TimeZone: "+calendar.getTimeZone());
		System.out.println("Time: "+calendar.getTime());
		
		SimpleDateFormat dateFormater = new SimpleDateFormat("MM/dd/YYYY");
		System.out.println("Time in MM/dd/YYYY format: "+dateFormater.format(calendar.getTime()));
		
		dateFormater = new SimpleDateFormat("MM/DD/YYYY");
		System.out.println("Time in MM/dd/YYYY format: "+dateFormater.format(calendar.getTime()));
		
		dateFormater = new SimpleDateFormat("mm/dd/YYYY");
		System.out.println("Time in MM/dd/YYYY format: "+dateFormater.format(calendar.getTime()));
	}

}
