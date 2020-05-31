package com.gp.navigableset;

import java.util.TreeSet;

public class NavigableQueuSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> s= new TreeSet<Integer>();
			
			s.add(10);
			s.add(20);
			s.add(30);
			s.add(40);
			s.add(50);
			
			System.out.println(s);
			
			System.out.println(s.ceiling(20));
			System.out.println(s.higher(40));
			System.out.println(s.floor(10));
			System.out.println(s.lower(30));
			System.out.println(s.pollFirst());//removes first
			System.out.println(s.pollLast());//remvoes last
			System.out.println(s);
			System.out.println(s.descendingSet());//shows in descending order
		/*	
			[10, 20, 30, 40, 50]
					20
					50
					10
					20
					10
					50
					[20, 30, 40]
					[40, 30, 20]*/


	}

}
