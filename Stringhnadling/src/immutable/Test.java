package immutable;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User(1,"jp");
		System.out.println(user);//immutable.User@15db9742 pkg name and class name and hashcode u see..as user is mutable cannot see actual value as it can change any time
		
		String s=new String("gp");
		System.out.println(s);//prints gp as string is imutable cannot change any time so can diplsy who thing without hashcode jibberish
		

		Integer i=new Integer(30);
		System.out.println(i);//30 same like String wrpper also immutable so whole value not jibbersh hashcodes
	}

}
