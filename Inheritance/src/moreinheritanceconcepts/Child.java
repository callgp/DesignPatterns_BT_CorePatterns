package moreinheritanceconcepts;

public class Child extends Parent{
	int c,d;
	Child(int a, int b,int c, int d) {
		super(a,b);
		this.c=c;
		this.d=d;
		//super(a, b);
		// TODO Auto-generated constructor stub
	}

	
	void displayDetails(){
		System.out.println("parents a"+super.a);
		System.out.println("parents b"+super.b);
		System.out.println("childss c"+this.c);
		System.out.println("childs d"+this.d);
	}
	
	void f1(){
		super.f1();
		System.out.println(this);
		//System.out.println(super);
		System.out.println("in child f1");
	}

}
