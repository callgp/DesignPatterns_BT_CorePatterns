import java.util.ArrayList;
import java.util.List;

public class ListMethods5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Integer> list=new ArrayList();
		List<Integer> list=new ArrayList();//betterr future runtime polymorphism can replace arraylist with linkedlist on rhs
		

		for (int i = 10; i < 100; i=i+10) {
			list.add(i);
			
		}
		
		System.out.println("list is before insert.."+list);
		
		list.add(2,100);
		System.out.println("list after insert.."+list);
		
		list.set(3, 300);
		System.out.println("list after set.."+list);
		
		
		List<Integer> secondList=new ArrayList<>();
		secondList.add(111);
		secondList.add(1111);
		secondList.add(11111);
		secondList.add(111111);
		
		list.addAll(4,secondList);//insert list at particula index
		System.out.println("list after addAll.."+list);
		//System.out.println("first list.."+list);
	
	}

}

/*list is before insert..[10, 20, 30, 40, 50, 60, 70, 80, 90]
list after insert..[10, 20, 100, 30, 40, 50, 60, 70, 80, 90]
list after set..[10, 20, 100, 300, 40, 50, 60, 70, 80, 90]*/


