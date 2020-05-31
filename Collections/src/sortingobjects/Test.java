package sortingobjects;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<Employee> set=new TreeSet<>();
		set.add(new Employee(100, "omar"));
		set.add(new Employee(400, "Tomar"));
		set.add(new Employee(300, "Bomar"));
		set.add(new Employee(200, "Romar"));
		
		for(Employee emp:set){
			System.out.println(emp.id);
			System.out.println(emp.name);
		}

	}

}
/*
 * came based on id order ascending 100 then 200 then 300 then 400
100
omar
200
Romar
300
Bomar
400
Tomar
*/
