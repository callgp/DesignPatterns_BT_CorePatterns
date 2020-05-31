import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=new LinkedList<>();
		
		list.add("xyz");
		list.add("cde");
		list.add("abc");

		ListIterator<String> itr=list.listIterator();
		
		System.out.println("traverse in forward direction: ");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("traverse in previous direction: ");
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
		
	}

}

/*
traverse in forward direction: 
xyz
cde
abc
traverse in previous direction: 
abc
cde
xyz*/

