package nonstaticinner;

public class Outer {
	void f1(){
		System.out.println("outer classes non static method");
	}
	class Inner{
		void f2(){
			System.out.println("inner classes non static method");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer outer=new Outer();
		outer.f1();
		Outer.Inner inner=outer.new Inner();
		inner.f2();

	}

}


/*outer classes non static method
inner classes non static method*/
