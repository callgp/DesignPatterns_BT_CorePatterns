package com.gp.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {

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
		System.out.println(l2);
}
}

/*
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[0, 2, 4, 6, 8, 10]
*/


/*[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[0, 2, 4, 6, 8, 10]*/
