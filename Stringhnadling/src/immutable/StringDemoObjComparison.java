package immutable;

public class StringDemoObjComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1=new User(1,"abc");
		User user2=new User(2,"abc");
		
		System.out.println(user1);
		System.out.println(user2);
		
		String s1="abc";
	//	String s2="abc";
		String s3="abc";
		String s4=new String("abc");
		
		System.out.println(s1);
		System.out.println(s3);
		//System.out.println(s3);
		
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
	//	System.out.println(s3.hashCode());//above two lines and this line same hash code values
		
		String s2="xyz";
		System.out.println(s3.hashCode());//if i change string object then only changes the reference to 119193 othwrwise jvm optimises and points to same string object in string pool..also thread safe..as same string writes and read by two different threads..once write complete it creates new string object and read still happen on old string so no data corruption
	
	
		System.out.println(s1==s3);//checks the memory locations
		
		System.out.println(s1.equals(s3));//not memory locations but contnents of strings
	
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1==s4);//false as new operator to create string jvm allocate new memory location does not use...so creates new one in string pools..if u like to reuse create like primite string ..if no need to reuse create string with new operators
		System.out.println(s1.equals(s4));//true as compares the contents
		
		System.out.println(user1==user2);//false as separate locations
		System.out.println(user1.equals(user2));//false as contents different..even content same for user etc custom obje works reverse of String objects
		
		User user3=new User(1,"abc");
		User user4=new User(1,"abc");
		System.out.println(user3==user4);//false
		System.out.println(user3.equals(user4));//false as well.. to compare equals for custom objects i need to define my own equal method by overriding it
	}

}


/*immutable.User@15db9742
immutable.User@6d06d69c
abc
abc
96354
96354
*/