package collectionsutil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l=new ArrayList<>();
		l.add("2");
		l.add("A");
		l.add("X");
		l.add("B");
		System.out.println("before sort "+l);
		Collections.sort(l,new MyComparator());
		
		System.out.println("aftet "+l);//now comes reverse of natural sorting order due to comparators
	}

}


/*before sort [2, A, X, B]
aftet [2, A, B, X]*/
