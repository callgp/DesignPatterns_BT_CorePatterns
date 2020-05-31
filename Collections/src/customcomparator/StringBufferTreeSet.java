package customcomparator;

import java.util.Set;
import java.util.TreeSet;

public class StringBufferTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<StringBuffer> set=new TreeSet<>(new StringBufferComparator());
		
		set.add(new StringBuffer("xyzd"));
		set.add(new StringBuffer("abcer"));
		set.add(new StringBuffer("lmnmam"));
		set.add(new StringBuffer("dwzabcde"));
		
		for(StringBuffer obj:set){
			System.out.println(obj);
		}

	}

}

//based on length orders them not alphabetical..to reverse make -1 to 1 
/*
 xyzd
abcer
lmnmam
dwzabcde*/

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

