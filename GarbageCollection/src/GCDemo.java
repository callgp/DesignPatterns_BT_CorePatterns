
public class GCDemo {

	//int objId;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GCDemo();
		new GCDemo();

	}
public GCDemo() {
	// TODO Auto-generated constructor stub
	System.out.println(this+"creatd");
}

protected void finalize(){
	System.out.println(this+"finalized to cleanup");
}
}
