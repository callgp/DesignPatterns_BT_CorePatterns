package immutable;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1=new User(1,"abc");
		User user2=new User(2,"abc");
		
		System.out.println(user1);
		System.out.println(user2);
		
		String s1="abc";
		String s2="abc";
		//String s3="abc";
		
		System.out.println(s1);
		System.out.println(s2);
		//System.out.println(s3);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	//	System.out.println(s3.hashCode());//above two lines and this line same hash code values
		
		String s3="xyz";
		System.out.println(s3.hashCode());//if i change string object then only changes the reference to 119193 othwrwise jvm optimises and points to same string object in string pool..also thread safe..as same string writes and read by two different threads..once write complete it creates new string object and read still happen on old string so no data corruption
	}

}


/*immutable.User@15db9742
immutable.User@6d06d69c
abc
abc
96354
96354
*/