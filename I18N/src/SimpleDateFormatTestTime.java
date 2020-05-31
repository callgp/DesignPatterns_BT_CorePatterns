import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTestTime {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf=new SimpleDateFormat("M/dd/yyyy");//month first
		String format = sdf.format(new Date());
		System.out.println(format);
		
//5/23/2020

//string to date istnace
		
		String dateAsString="10-12-2014";
		
		SimpleDateFormat simpleDateFormat111 = new SimpleDateFormat("dd-M-yyyy");
		Date date1=simpleDateFormat111.parse(dateAsString);
		System.out.println(date1);
	
	}

}
/*
5/23/2020
Wed Dec 10 00:00:00 EST 2014
*/
