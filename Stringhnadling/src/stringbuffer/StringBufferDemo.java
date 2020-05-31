package stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());//default initial cpacity is 16
		
		sb.append("all  power");//no ned to assign back similar to string here it is not nededed
		System.out.println(sb);
		sb.append("is in u");
		System.out.println(sb);//all  poweris in u
		System.out.println("new capacity"+sb.capacity());//new capacity34 ..it increased the capacity nwo
		
		System.out.println(sb.charAt(0));//a
		
		StringBuffer sb1=new StringBuffer("abcde");
		System.out.println("reverse"+sb1.reverse());//reverseedcba
		
		System.out.println(sb1.insert(0, "xyz"));//xyzedcba

		System.out.println(sb1.delete(0,2));//zedcba 0 till 2-1 index deletes
	}
}
