import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		DateFormat dateInstance = DateFormat.getDateInstance(0,Locale.US);
		DateFormat dateInstance2 = DateFormat.getDateInstance(0,Locale.UK);
		
		System.out.println("date in us"+dateInstance.format(d));
		System.out.println("date in uk"+dateInstance2.format(d));

	}

}
/*
date in usSaturday, May 23, 2020
date in ukSaturday, 23 May 2020
*/