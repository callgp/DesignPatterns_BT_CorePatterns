package collectionsutil;

import java.util.Arrays;

public class ArraysSort2 {

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
		Arrays.sort(s);
		for(String eachElement:s){
			System.out.println(eachElement);
		}
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
