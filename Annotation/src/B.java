import java.util.ArrayList;
import java.util.List;

public class B {

	//@SuppressWarnings("deprecation")//where we use that method we can say suppress warnings
	//@SuppressWarnings(value ={"deprecation"})
	//@SuppressWarnings(value ={"deprecation", "unused"})
	@SuppressWarnings(value ={"deprecation", "rawtypes"})///u can add additional here also
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a =new A();
		a.myMethod();//The method myMethod() from the type A is deprecated
		a.myMethod2();//this is ok as deprecation now only mymethod1 level not at mymethod2 level
		System.out.println(a);
		
		
		
		//@SuppressWarnings("rawtypes")
		List arrayList = new ArrayList();//get below warning
	/*	Multiple markers at this line
		- List is a raw type. References to generic type List<E> should be parameterized
		- The value of the local variable arrayList is not used
		- ArrayList is a raw type. References to generic type ArrayList<E> should be 
		 parameterized*/
	}

}
/*Multiple markers at this line
- The type A is deprecated
- The type A is deprecated
- The constructor A() is 
 deprecated*/