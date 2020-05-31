
public class Outer {
	
	static void f1(){
		System.out.println("outer static method");
	}
	static class Inner{
		static void f2(){
			System.out.println("inner static method");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer.f1();
		Outer.Inner.f2();

	}

}
