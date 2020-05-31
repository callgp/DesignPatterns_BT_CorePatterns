import java.util.ArrayList;
import java.util.List;

public class ListMethods3 {

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
		
		
		//to find list has particular object or not??
		
		if(list.contains(222)){//if i use 10 instead of 222 i see true
			System.out.println("list has value");
		}else {
			System.out.println("list does not have value");
		}
		
		//get size
		for(int i=0;i<list.size();i++){
			
			System.out.println(list.get(i));
		}
		list.remove(3);
		System.out.println("list afterrrr "+list);
	
	}

}
/*
list is before insert..[10, 20, 30, 40, 50, 60, 70, 80, 90]
list after insert..[10, 20, 100, 30, 40, 50, 60, 70, 80, 90]
list after set..[10, 20, 100, 300, 40, 50, 60, 70, 80, 90]
list after addAll..[10, 20, 100, 300, 111, 1111, 11111, 111111, 40, 50, 60, 70, 80, 90]
list does not have value*/

/*
list is before insert..[10, 20, 30, 40, 50, 60, 70, 80, 90]
list after insert..[10, 20, 100, 30, 40, 50, 60, 70, 80, 90]
list after set..[10, 20, 100, 300, 40, 50, 60, 70, 80, 90]
list after addAll..[10, 20, 100, 300, 111, 1111, 11111, 111111, 40, 50, 60, 70, 80, 90]
list does not have value
10
20
100
300
111
1111
11111
111111
40
50
60
70
80
90
list afterrrr [10, 20, 100, 111, 1111, 11111, 111111, 40, 50, 60, 70, 80, 90]*/

