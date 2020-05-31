import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/M/yyyy");
		String format = sdf.format(new Date());
		System.out.println(format);
		
//23/5/2020

	}

}
