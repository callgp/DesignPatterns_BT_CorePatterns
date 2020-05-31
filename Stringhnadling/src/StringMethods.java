
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
		
		System.out.println(s.length());//no of code units there ie 5
		System.out.println(s.indexOf('o'));//4 as starts with 0 index
		System.out.println(s.charAt(4));//give value o...opposite of indexOf..if give 5 outofboundexception
		System.out.println(s.substring(3));//lo..start all way to end index
		System.out.println(s.substring(3,4));//gives l....start at 3 and ends at 4-1 which is 3
		
		//s.split(regex)
		
		
		

	}

}
