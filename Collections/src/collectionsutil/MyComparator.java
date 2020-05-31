package collectionsutil;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {
	
	public int compare(String o1, String o2){
		return o2.compareTo(o1);
	}

}
