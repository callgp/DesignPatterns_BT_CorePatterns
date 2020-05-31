package com.gp.refl;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		try {
			Class<?> myClass = Class.forName(Calculator.class.getName());
			//System.out.println(forName);
			System.out.println(myClass.getName());
			
			
			 Constructor<?>[] constructors = myClass.getConstructors();
			System.out.println(constructors);
			
			System.out.println(Arrays.toString(constructors));
			System.out.println(Arrays.toString(myClass.getMethods()));
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		}

	}

}

/*com.gp.refl.Calculator
[Ljava.lang.reflect.Constructor;@15db9742
[public com.gp.refl.Calculator(double,double), public com.gp.refl.Calculator()]
[public double com.gp.refl.Calculator.getNum1(), public double com.gp.refl.Calculator.getNum2(), public void com.gp.refl.Calculator.setNum2(), public void com.gp.refl.Calculator.setNum1(), public final void java.lang.Object.wait() throws java.lang.InterruptedException, public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException, public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException, public boolean java.lang.Object.equals(java.lang.Object), public java.lang.String java.lang.Object.toString(), public native int java.lang.Object.hashCode(), public final native java.lang.Class java.lang.Object.getClass(), public final native void java.lang.Object.notify(), public final native void java.lang.Object.notifyAll()]
*/
		

/*com.gp.refl.Calculator
[Ljava.lang.reflect.Constructor;@15db9742
[public com.gp.refl.Calculator(double,double), public com.gp.refl.Calculator()]*/

		
/*com.gp.refl.Calculator
[Ljava.lang.reflect.Constructor;@15db9742
[public com.gp.refl.Calculator()]*/


/*com.gp.refl.Calculator
public com.gp.refl.Calculator()*/

// class com.gp.refl.Calculator ..class loaded to memory

