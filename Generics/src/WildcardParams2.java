import java.util.ArrayList;

public class WildcardParams2 {
	
	public static void main(String[] args) {
		WildcardParams2 wcp=new WildcardParams2();
		wcp.myMethod(new ArrayList<Thread>());//or MyClass also ok..anything extends runnable
	}

	public void myMethod(ArrayList<? extends Thread> l){
		
		l.add(null);//null ok...but add any other errors //just read onlys
		//l.add("gp");
		l.add(new MyClass());//not [possible only pass in above not wild card ? and extends
	}
}
//The method add(capture#2-of ?) in the type ArrayList<capture#2-of ?> is not applicable for the arguments (String)
//wild card with ? only for null value