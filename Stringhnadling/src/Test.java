
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product(1,"ip");

		System.out.println(product);//prints Product@15db9742
		
		String s="123";
		Integer i=new Integer(456);
		
		System.out.println(s);//123
		System.out.println(i);//456 ..for string and wrapper treatment of jvm different it prints whole value not reference

	}

}
