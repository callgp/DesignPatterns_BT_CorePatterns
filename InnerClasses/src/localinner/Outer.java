package localinner;

public class Outer {
	
	void f1(){
		System.out.println("inside outers f1()");
		class LocalInner{//cannot give like privatge as inside the method..if variable or method under class private etc ok
			void f2(){
				System.out.println("inside local inners f2()");
			}
		}
		LocalInner inner=new LocalInner();
		inner.f2();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer=new Outer();
		outer.f1();
		//LocalInner inner=new LocalInner();//here you cannot instantiate it
		//inner.f2();
	}

}
