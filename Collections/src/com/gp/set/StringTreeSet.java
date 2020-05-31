package com.gp.set;

import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new TreeSet<>();
		set.add("xyz");
		set.add("abc");
		set.add("lmn");
		set.add("dwz");
		
		for(String obj:set){
			System.out.println(obj);
		}

	}

}

//oreder of alphabetical with string..try with string buffer

/*abc
dwz
lmn
xyz*/

