package comparator;

import java.util.Set;
import java.util.TreeSet;

public class StringBufferTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<StringBuffer> set=new TreeSet<>(new StringBufferComparator());
		
		set.add(new StringBuffer("xyz"));
		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("lmn"));
		set.add(new StringBuffer("dwz"));
		
		for(StringBuffer obj:set){
			System.out.println(obj);
		}

	}

}
/*
now get natural ordering a then d then l then x
abc
dwz
lmn
xyz*/

/*
Exception in thread "main" java.lang.ClassCastException: java.lang.StringBuffer cannot be cast to java.lang.Comparable
at java.util.TreeMap.compare(Unknown Source)
at java.util.TreeMap.put(Unknown Source)
at java.util.TreeSet.add(Unknown Source)
at com.gp.set.StringBufferTreeSet.main(StringBufferTreeSet.java:12)*/
//any class add to tree set should provide impl of comparator..or class should impl comparable interface..next example


//oreder of alphabetical with string..try with string buffer

/*abc
dwz
lmn
xyz*/

