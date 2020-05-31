package sortingobjects;

public class Employee  implements Comparable<Employee>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int id;
	String name;
	
	Employee(int id, String name){
		this.id=id;
		this.name=name;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		//e1.compareTo(e2)
		int id1=this.id;
		int id2=o.id;
		
		if(id1<id2){
			return -1;
		}else if(id1>id2){
			return 1;
		}else{
			return 0;
		}
		
		//return 0;
	}

}
