import java.util.ArrayList;

public class WildcardParams {
	
	public static void main(String[] args) {
		
	}

	public void myMethod(ArrayList<?> l){
		
		l.add(null);//null ok...but add any other errors
		l.add("gp");
	}
}
//The method add(capture#2-of ?) in the type ArrayList<capture#2-of ?> is not applicable for the arguments (String)
//wild card with ? only for null value