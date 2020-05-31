package moreinheritanceconcepts;

public class ChildClass extends SuperClass {
	
	public ChildClass() {//since arg constuctor there i ahve to define this default constructor myself as compiler does not create one gets compilation err if i comment this metho
		this(10);//must be first stmt in method
		// TODO Auto-generated constructor stub
		System.out.println("no arg child class constructor");
	}
	
	public ChildClass(int x) {
		// TODO Auto-generated constructor stub
		super(x);//must be first stmt in method
		System.out.println("one arg child class constructor");
	}
	
	public static void main(String[] args) {
		ChildClass c=new ChildClass();
		
		
	}

}
