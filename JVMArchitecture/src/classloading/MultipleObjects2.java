package classloading;

public class MultipleObjects2 {

	public static void main(String[] args) {

		User u1=new User();
		Class c1=u1.getClass();
		
		User u2=new User();
		Class c2=u2.getClass();
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1==c2);
		
		System.out.println(c1.getClassLoader());
		System.out.println(String.class.getClassLoader());//string etc bootstrap class loader..jre lib rt.jar..native C etc cannot get info.
		
		
	}

}

/*366712642
366712642
true
sun.misc.Launcher$AppClassLoader@73d16e93
null*/


/*366712642
366712642
true
sun.misc.Launcher$AppClassLoader@73d16e93*/


/*366712642
366712642
true
*/