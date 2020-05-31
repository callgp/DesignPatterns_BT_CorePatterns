package com.gp.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LOWERToUpperCasecOUNTOtherMEthods {

	public static void main(String[] args) {

		List<Integer> l1=new ArrayList<>();
		
	
		for(int i=0; i<=10;i++){
			l1.add(i);
		}
		
		System.out.println(l1);
		
		
	/*	List<Integer> l2=new ArrayList<>();
		for(Integer i:l1){
			if(i%2 == 0){
				l2.add(i);
			}
		}*/
		
		List<Integer> l2 = l1.stream().filter(i->i%2==0).collect(Collectors.toList());
		long count = l1.stream().filter(i->i%2==0).count();
		System.out.println(count);
		
		List<Integer> l3 = l1.stream().sorted().collect(Collectors.toList());
		System.out.println(l3);
		
		
		Comparator<Integer> comp=(i1,i2)->i1.compareTo(i2);
		List<Integer> l4 = l1.stream().sorted(comp).collect(Collectors.toList());
		System.out.println(l4);//still same as original for loop order to reverse make i1 and i2 vice versa as below
		

		Comparator<Integer> comp1=(i1,i2)->i2.compareTo(i1);
		List<Integer> l5 = l1.stream().sorted(comp1).collect(Collectors.toList());
		System.out.println(l5);//now got revers [10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
	
	}
}

/*[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
6
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0]*/

/*[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
6
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]*/


/*[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
6
*/

/*
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[0, 2, 4, 6, 8, 10]
*/


/*[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[0, 2, 4, 6, 8, 10]*/
