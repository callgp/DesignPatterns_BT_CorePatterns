
public class TestRunnable3 {

	public static void main(String[] args) {
		
		AnyRunnable2<MyClass> t=new AnyRunnable2<MyClass>();///now no errors//thread im[plemrns runnable internallys ok
		//sAnyRunnable<String> t=new AnyRunnable<String>();//Bound mismatch: The type String is not a valid substitute for the bounded parameter <T extends Runnable> of the type AnyRunnable<T>
	}
}
