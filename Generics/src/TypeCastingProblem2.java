import java.util.ArrayList;
import java.util.List;

public class TypeCastingProblem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s=new String[10];
		s[0]="john";
		s[1]="gp";
		//s[2]=123;//array does not allow other datatypes
		
		List<Object> l=new ArrayList<String>();//not possible//type safety and type cating problems avoided...parameters cannot have polymorphism like lhs <> has object rhs <> has string not possible..also cannot use primitives primitieves
		
		List<123> l=new ArrayList<String>();//only object types and wrapper tyhpes not primitives
		l.add("xyz");
		l.add("rr");
		l.add(123);//list is ok with any kind of data type upto 1.5
		
		
		String name=(String)l.get(0);
		String name2 = (String) l.get(1);
		String name3 = (String) l.get(1);
		
		/*prior to 1.5 used to get below error ..then generics introduced to fix in 1.5 by mentioning type in angular type on rhs and lhs..starting 1.8 rhs optional..then gives compile time eror no need to blow up at run time.. ..Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			Type mismatch: cannot convert from int to String

			at TypeCastingProblem.main(TypeCastingProblem.java:12)*/
		
		

	}

}
