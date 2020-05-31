package override;

public class MyChild extends MyParent {

	@Override
	public String greet(Integer name){//The method greet(Integer) of type MyChild must override or implement a supertype method..cannot override string param with inteer param
		return "hi "+name;
	}
}
