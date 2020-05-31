
public class Outer2 {
	
	static void f1(){
		System.out.println("outer static method");
	}
	static class Inner{
		static void f2(){
			System.out.println("inner static method");
		}
		
		void f3(){
			System.out.println("non static method inside the inner class");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer2.f1();
		Outer2.Inner.f2();
		
		Outer2.Inner inner=new Outer2.Inner();
		inner.f3();//to call non static method

	}

}
