package com.gp.set;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list=new ArrayList();
		list.add(new Integer(10));//warning is Type safety: The method add(Object) belongs to the raw type ArrayList. References to generic type ArrayList<E> should be parameterized
		
		list.add(10);
		list.add("hi");
		list.add("10.5");
		
		Iterator<Integer> itr=list.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}


/*
10
10
hi
10.5*/
