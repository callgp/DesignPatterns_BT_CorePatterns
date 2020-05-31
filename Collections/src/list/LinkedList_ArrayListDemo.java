package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object object[]=new Object[1000000];
		for(int i=0;i<object.length;i++){
			object[i]=new Object();
			
		}
		
		List<Object> list=new ArrayList();
		long start=System.currentTimeMillis();
		for (Object object2 : object) {
			list.add(object2);
			
		}
		long end=System.currentTimeMillis();
		System.out.println("time  "+(end-start));
		

	}

}
