
public class TestRunnable2 {

	public static void main(String[] args) {
		
		AnyRunnable<Thread> t=new AnyRunnable<Thread>();//thread im[plemrns runnable internallys ok
		AnyRunnable<String> t=new AnyRunnable<String>();//Bound mismatch: The type String is not a valid substitute for the bounded parameter <T extends Runnable> of the type AnyRunnable<T>
	}
}
