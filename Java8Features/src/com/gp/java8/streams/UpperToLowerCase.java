package com.gp.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperToLowerCase {

	public static void main(String[] args) {

		List<String> l1=new ArrayList<String>();
		l1.add("SS");
		l1.add("AA");
		l1.add("WW");
		
		List<String> l2 = l1.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
		System.out.println(l2);//[GG, SDD, RE]//[ss, aa, ww]


	}

}
