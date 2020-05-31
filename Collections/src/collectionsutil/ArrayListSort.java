package collectionsutil;

import java.util.Arrays;
import java.util.List;

public class ArrayListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a={40,10,15,7};
		
		System.out.println("before sort");
		for(int eachElement:a){
			System.out.println(eachElement);
		}
		
		Arrays.sort(a);
		
		System.out.println("after");
		for(int eachElement:a){
			System.out.println(eachElement);
		}
		
		
		String[] s={"V","A","Z","P"};
		
		
		System.out.println("strings");
		Arrays.sort(s, new MyComparator());//reverse order
		for(String eachElement:s){
			System.out.println(eachElement);
		}
		
		
		List<String> asList = Arrays.asList(s);
		List<int[]> asList2 = Arrays.asList(a);
		System.out.println(asList);//[Z, V, P, A] after converting list if change array impact to list
		s[1]="Y";
		System.out.println(asList);//[Z, Y, P, A]//change to list impact array and vice versa
		
		asList.add("c");
		System.out.println(asList);//after convertig to list if try to change size by adding elements gets unsupported exc as array size to begin with same
		
	/*	A
		[Z, V, P, A]
		[Z, Y, P, A]
		Exception in thread "main" java.lang.UnsupportedOperationException
			at java.util.AbstractList.add(Unknown Source)
			at java.util.AbstractList.add(Unknown Source)
			at collectionsutil.ArrayListSort.main(ArrayListSort.java:42)*/
	}
	
/*	before sort
	40
	10
	15
	7
	after
	7
	10
	15
	40
	strings
	Z
	V
	P
	A
*/
	
/*	before sort
	40
	10
	15
	7
	after
	7
	10
	15
	40
	strings
	A
	P
	V
	Z
*/

}
/*

before sort
40
10
15
7
after
7
10
15
40*/
