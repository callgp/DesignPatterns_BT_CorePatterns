
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyGeneric<String> s=new MyGeneric<>("gp");
		s.displayObjectDetails();
		
		System.out.println(s.getObject());
		
	
		
		
		MyGeneric<String> i=new MyGeneric<>("23");
		s.displayObjectDetails();	
		System.out.println(i.getObject());
		
		
		MyGeneric<String> d=new MyGeneric<>("23.45");
		s.displayObjectDetails();	
		System.out.println(d.getObject());
	}

}
/*type of obj is java.lang.String
gp
type of obj is java.lang.String
gp
type of obj is java.lang.String
23
type of obj is java.lang.String
23.45*/
