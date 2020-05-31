package com.gp.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LOWERToUpperCase {

	public static void main(String[] args) {

		List<String> l1=new ArrayList<String>();
		l1.add("gg");
		l1.add("sdd");
		l1.add("re");
		
		List<String> l2 = l1.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l2);//[GG, SDD, RE]

	}

}
