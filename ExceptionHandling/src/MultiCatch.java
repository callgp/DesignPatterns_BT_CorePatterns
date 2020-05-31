
public class MultiCatch {
public static void main(String[] args) {
	try{
	String input=args[0];
	
	System.out.println("input is"+input);
	int output=Integer.parseInt(input);
	System.out.println("output is"+output);
	}catch (RuntimeException e) {
		// TODO: handle exception
		System.out.println("input needed");
	}/*catch (NumberFormatException e) {
		// TODO: handle exception
		System.out.println("invalid input provided");
	}*/
	System.out.println("more code here");
	
}
}
