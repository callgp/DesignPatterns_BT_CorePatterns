
public class CompileTimeBinding {
	
	void add(int a, int b){
		int result=a+b;
		System.out.println("result of int method"+result);
	}
	
	void add(float a, float b){
		float result=a+b;
		System.out.println("result of float method"+result);
	}
	
	void add(int a, int b, int c){
		float result=a+b+c;
		System.out.println("result of 3 int method"+result);
	}
	
	public static void main(String[] args) {
		CompileTimeBinding ctb=new CompileTimeBinding();
		ctb.add(10, 5);
		ctb.add(3f, 2f);
		ctb.add(3, 3,11);
		
	}

}
