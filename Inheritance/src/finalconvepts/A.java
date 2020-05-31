package finalconvepts;

public class A {//cannot exend final classes
	//Float pi=3.34f;
	//final Float pi=3.34f;if you assign in constructor need not assign here
	//final Float pi;
	final static float pi=3.14f;
	/*A(){
		pi=3.8f;
	}*/
	
	public final void displayValue(){
		System.out.println(A.pi);
	}
	public static void main(String[] args) {
		 A a1=new A();//if final cannot assign
		//a1=new A();
		
		//a1.pi=10f;//i do not want to assign any value to pi so make pi as final
		System.out.println(A.pi);
		
	}
	
	

}
