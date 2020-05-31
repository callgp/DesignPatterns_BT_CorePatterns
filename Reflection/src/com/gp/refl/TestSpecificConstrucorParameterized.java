package com.gp.refl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestSpecificConstrucorParameterized {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			Class<?> myClass = Class.forName(Calculator.class.getName());
			//System.out.println(forName);
			System.out.println(myClass.getName());
			
			
			 Constructor<?>[] constructors = myClass.getConstructors();
			System.out.println(constructors);
			
			System.out.println(Arrays.toString(constructors));
			System.out.println(Arrays.toString(myClass.getMethods()));
			
			
			Constructor<?> constructorss = myClass.getConstructor(null); //no security exception or nosuchmethodexception throwing here
			constructorss.newInstance(null);
			
			System.out.println(constructorss.newInstance(null));
			
			
			
			Constructor<?>  newInstancess = myClass.getConstructor(double.class,double.class);
			System.out.println(newInstancess.newInstance(3,7));
			
			Object myObj = newInstancess.newInstance(3,7);
			Method method = myClass.getMethod("getNum1", null);
			method.invoke(myObj, null);
			System.out.println(method.invoke(myObj, null));
			
			
			Method method2 = myClass.getMethod("getNum2", null);
			method2.invoke(myObj, null);
			System.out.println(method2.invoke(myObj, null));
			
		/*	com.gp.refl.Calculator
			[Ljava.lang.reflect.Constructor;@15db9742
			[public com.gp.refl.Calculator(double,double), public com.gp.refl.Calculator()]
			[public double com.gp.refl.Calculator.getNum1(), public double com.gp.refl.Calculator.getNum2(), public void com.gp.refl.Calculator.setNum1(), public void com.gp.refl.Calculator.setNum2(), public final void java.lang.Object.wait() throws java.lang.InterruptedException, public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException, public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException, public boolean java.lang.Object.equals(java.lang.Object), public java.lang.String java.lang.Object.toString(), public native int java.lang.Object.hashCode(), public final native java.lang.Class java.lang.Object.getClass(), public final native void java.lang.Object.notify(), public final native void java.lang.Object.notifyAll()]
			default constroctor
			default constroctor
			com.gp.refl.Calculator@4e25154f
			com.gp.refl.Calculator@70dea4e
			3.0
			7.0*/

			
		/*	com.gp.refl.Calculator
			[Ljava.lang.reflect.Constructor;@15db9742
			[public com.gp.refl.Calculator(double,double), public com.gp.refl.Calculator()]
			[public double com.gp.refl.Calculator.getNum1(), public double com.gp.refl.Calculator.getNum2(), public void com.gp.refl.Calculator.setNum2(), public void com.gp.refl.Calculator.setNum1(), public final void java.lang.Object.wait() throws java.lang.InterruptedException, public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException, public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException, public boolean java.lang.Object.equals(java.lang.Object), public java.lang.String java.lang.Object.toString(), public native int java.lang.Object.hashCode(), public final native java.lang.Class java.lang.Object.getClass(), public final native void java.lang.Object.notify(), public final native void java.lang.Object.notifyAll()]
			default constroctor
			default constroctor
			com.gp.refl.Calculator@4e25154f
			com.gp.refl.Calculator@70dea4e
			3.0*/

			
			/*com.gp.refl.Calculator
			[Ljava.lang.reflect.Constructor;@15db9742
			[public com.gp.refl.Calculator(double,double), public com.gp.refl.Calculator()]
			[public double com.gp.refl.Calculator.getNum1(), public void com.gp.refl.Calculator.setNum1(), public void com.gp.refl.Calculator.setNum2(), public double com.gp.refl.Calculator.getNum2(), public final void java.lang.Object.wait() throws java.lang.InterruptedException, public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException, public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException, public boolean java.lang.Object.equals(java.lang.Object), public java.lang.String java.lang.Object.toString(), public native int java.lang.Object.hashCode(), public final native java.lang.Class java.lang.Object.getClass(), public final native void java.lang.Object.notify(), public final native void java.lang.Object.notifyAll()]
			default constroctor
			default constroctor
			com.gp.refl.Calculator@4e25154f
			com.gp.refl.Calculator@70dea4e*/

			
			
		/*	com.gp.refl.Calculator
			[Ljava.lang.reflect.Constructor;@15db9742
			[public com.gp.refl.Calculator(double,double), public com.gp.refl.Calculator()]
			[public double com.gp.refl.Calculator.getNum1(), public double com.gp.refl.Calculator.getNum2(), public void com.gp.refl.Calculator.setNum2(), public void com.gp.refl.Calculator.setNum1(), public final void java.lang.Object.wait() throws java.lang.InterruptedException, public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException, public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException, public boolean java.lang.Object.equals(java.lang.Object), public java.lang.String java.lang.Object.toString(), public native int java.lang.Object.hashCode(), public final native java.lang.Class java.lang.Object.getClass(), public final native void java.lang.Object.notify(), public final native void java.lang.Object.notifyAll()]
			default constroctor
			default constroctor
			com.gp.refl.Calculator@4e25154f*/
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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

