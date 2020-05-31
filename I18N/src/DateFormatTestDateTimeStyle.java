import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTestDateTimeStyle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		DateFormat dateInstance = DateFormat.getDateInstance(0,Locale.US);
		DateFormat dateInstance2 = DateFormat.getDateInstance(0,Locale.UK);
		
		System.out.println("date in us"+dateInstance.format(d));
		System.out.println("date in uk"+dateInstance2.format(d));
		
		//from here new
		
		DateFormat timeInstance = DateFormat.getTimeInstance(0);//fefault style 3..give 0..u see est
		
		System.out.println(timeInstance.format(d));

		
		
DateFormat timeInstance22 = DateFormat.getDateTimeInstance(0,0);//fstyle for time also apart from date
		
		System.out.println(timeInstance22.format(d));
	}

}


/*
date in usSaturday, May 23, 2020
date in ukSaturday, 23 May 2020
5:55:39 PM EDT
Saturday, May 23, 2020 5:55:39 PM EDT*/


/*date in usSaturday, May 23, 2020
date in ukSaturday, 23 May 2020
5:51:26 PM EDT*/


/*date in usSaturday, May 23, 2020
date in ukSaturday, 23 May 2020
5:47:41 PM*/



/*
date in usSaturday, May 23, 2020
date in ukSaturday, 23 May 2020
*/