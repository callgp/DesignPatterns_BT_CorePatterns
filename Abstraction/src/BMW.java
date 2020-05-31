
public abstract class BMW {//cannot make abstact class as final as need to impl
	
	void commonFunc(){//to use in 3 series 5 series all
		System.out.println("in common func");
	}
	
	//abstract static void accelerate();//cannot make abstract method as static as only impl needs to b called not this unimplemented method
	abstract void accelerate();
	abstract void brake();
	public static void main(String[] args) {
		System.out.println("in main");
	}

}
