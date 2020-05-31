import java.util.ArrayList;

public class WildcardParams3 {
	
	public static void main(String[] args) {
		WildcardParams3 wcp=new WildcardParams3();
		wcp.myMethod(new ArrayList<A>());//or MyClass also ok..anything extends runnable ??why error here?
	}

	public void myMethod(ArrayList<? super B> l){//super meanong this method accept aything super of B whch is A..allow as parameter..just ? then extends then super we learned all 3
		
		l.add(null);//null ok...but add any other errors //just read onlys
		//l.add("gp");
		l.add(new B());//here ok
	}
}
//The method add(capture#2-of ?) in the type ArrayList<capture#2-of ?> is not applicable for the arguments (String)
//wild card with ? only for null value