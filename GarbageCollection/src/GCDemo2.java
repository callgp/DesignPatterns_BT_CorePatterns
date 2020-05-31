
public class GCDemo2 {

	int objId;
	
	public GCDemo2(int objId) {
		// TODO Auto-generated constructor stub
		this.objId=objId;
		System.out.println(this.objId+"creatd");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=500000;i++)
		/*new GCDemo2();
		new GCDemo2();*/
			new GCDemo2(i);

	}


protected void finalize(){
	System.out.println(this+"finalized to cleanup"+objId);
}
}
