package customcomparator;

import java.util.Comparator;

//import sortingobjects.Employee;

public class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		String s1=o1.name;
		String s2=o2.name;
		
		return s1.compareTo(s2);//a;ready implemented in string so use it
	}



}
