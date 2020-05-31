package list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object object[]=new Object[1000000];
		for(int i=0;i<object.length;i++){
			object[i]=new Object();
			
		}
		
		LinkedList<Object> list=new LinkedList();
		long start=System.currentTimeMillis();
		for (Object object2 : object) {
			list.add(object2);
			
		}
		long end=System.currentTimeMillis();
		System.out.println("time  "+(end-start));
		

	}

}
