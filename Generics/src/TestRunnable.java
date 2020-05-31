
public class TestRunnable {

	public static void main(String[] args) {
		
		AnyRunnable2<Thread> t=new AnyRunnable2<Thread>();//thread im[plemrns runnable internallys ok
		//AnyRunnable<String> t=new AnyRunnable<String>();//Bound mismatch: The type String is not a valid substitute for the bounded parameter <T extends Runnable> of the type AnyRunnable<T>
	}
}

/*
 * 
 * can extends thread to athreadMultiple markers at this line

- Bound mismatch: The type Thread is not a valid substitute for the bounded parameter <T extends Runnable & Comparable> of the type 
 AnyRunnable2<T>
- Bound mismatch: The type Thread is not a valid substitute for the bounded parameter <T extends Runnable & Comparable> of the type 
 AnyRunnable2<T>*/