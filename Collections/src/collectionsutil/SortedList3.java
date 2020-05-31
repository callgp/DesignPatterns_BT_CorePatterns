package collectionsutil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l=new ArrayList<>();
		l.add("Z");
		l.add("A");
		l.add("X");
		l.add("B");
		System.out.println("before sort "+l);
		//Collections.sort(l,new MyComparator());
		Collections.sort(l);
		System.out.println("aftet "+l);//now comes reverse of natural sorting order due to comparators
		
		int resutl = Collections.binarySearch(l, "X");// if ask for c says c as not there if says -5 means after A 4th position can be inserted
		
		System.out.println("index is "+resutl);
	}

}

/*before sort [Z, A, X, B]
aftet [A, B, X, Z]
index is 2*/



/*before sort [2, A, X, B]
aftet [2, A, B, X]*/
