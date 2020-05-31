package constuctrors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface f1= s->new MyClass(s);
		f1.get("usijg lambdas");
		
		MyInterface f2= s->MyClass::new;//errprsThe target type of this expression must be a functional interface
		f2.get("using constrcotr mapping");

	}

}


//in constructor null

//why null going???
