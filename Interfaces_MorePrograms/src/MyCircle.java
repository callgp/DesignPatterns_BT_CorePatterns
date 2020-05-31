
public class MyCircle implements Circle, Circle2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

	@Override
	public void calculateArea() {//The return type is incompatible with Circle2.calculateArea()..if 2 interfaces same method name and parameter with separate return types not allowed
		// TODO Auto-generated method stub
		//pi=1.5f;//final variable cannot be changed
		//System.out.println(pi);//The field pi is ambiguous
		System.out.println(Circle2.pi);
		
	}

	@Override
	public void calculateArea(float radius) {
		// TODO Auto-generated method stub
		
	}
	
/*	@Override
	public void calculateArea(float radius) {
		// TODO Auto-generated method stub
		
	}*/
/*
	@Override
	public void calculateArea(float radius) {//u can comment this method if remove from circle 2 float radius..if change return type from void to int also issue here
		// TODO Auto-generated method stub
		
	}*/

}
