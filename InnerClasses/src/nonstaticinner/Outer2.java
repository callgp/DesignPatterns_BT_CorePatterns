package nonstaticinner;

public class Outer2 {
	
	private static int x=50;
	private int y;
	
	Outer2(int y){
		this.y=y;
	}
	void f1(){
		System.out.println("outer classes non static method");
	}
	class Inner{
		private int y;
		
		Inner(int y){
			this.y=y;
		}
		void f2(){
			//System.out.println("inner classes non static method");
			System.out.println("outer class x-->"+Outer2.x);
			System.out.println("outer class y-->"+Outer2.this.y);
			System.out.println("inner class y-->"+this.y);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer2 outer=new Outer2(80);
		outer.f1();
		Outer2.Inner inner=outer.new Inner(30);
		inner.f2();
		System.out.println(inner.y);
		

	}

}


/*outer classes non static method
inner classes non static method*/
