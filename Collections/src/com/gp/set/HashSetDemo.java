package com.gp.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random obj=new Random();
		
		List<Integer> list=new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			int number=obj.nextInt(5);
			list.add(number);
			
		}
		
		System.out.println("list "+list);
		
		Set<Integer> set=new HashSet<>(list);
		System.out.println("set is"+set);
		
	}

}


/*
list [2, 1, 3, 4, 0, 3, 3, 2, 4, 1]
set is[0, 1, 2, 3, 4]*/
//all duplicates of set are gone
