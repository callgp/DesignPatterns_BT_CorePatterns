package moreinheritanceconcepts;

public class SuperClass {

	
	int x;
	
	public SuperClass(){//since arg constuctor there i ahve to define this default constructor myself as compiler does not create one gets compilation err if i comment this method
		System.out.println("no arg super class constructor");
	}
	
	public SuperClass(int x){
		this();
		System.out.println("one arg super class constructor");
	}
	
	
}
