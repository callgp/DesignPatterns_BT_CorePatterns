import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double d=12373222.3432;
		NumberFormat instance = NumberFormat.getInstance();
		System.out.println(instance.format(d));//us locale defaul so output 12,373,222.343

		

		Double d1=12373222.3432;
		NumberFormat instance1 = NumberFormat.getInstance(Locale.FRANCE);
		System.out.println(instance1.format(d1));
		
		/*12,373,222.343
		12 373 222,343*/


	}

}
