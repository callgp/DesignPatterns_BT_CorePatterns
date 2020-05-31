package collectionsutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionReverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l=new ArrayList<>();
		
		l.add(10);
		l.add(8);
		l.add(50);
		l.add(78);
		
		System.out.println("before revers"+l);
		Collections.reverse(l);
		System.out.println(l);

	}

}

/*before revers[10, 8, 50, 78]
[78, 50, 8, 10]*/

