import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list=new ArrayList();//ArrayList<Integer> list=new ArrayList<Integer>(); right hand side optional
		list.add(new Integer(10));//warning is Type safety: The method add(Object) belongs to the raw type ArrayList. References to generic type ArrayList<E> should be parameterized
		
		list.add(10);
		//list.add("hi");
		//list.add("10.5");
	}

}
