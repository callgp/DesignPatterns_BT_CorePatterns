
public class GCDemo3 {

	int objId;
	
	public GCDemo3(int objId) {
		// TODO Auto-generated constructor stub
		this.objId=objId;
		System.out.println(this.objId+"creatd");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GCDemo3(1);
		new GCDemo3(2);
		for(int i=1;i<=100;i++){
			System.gc();//no guarantee
			
		}
		/*new GCDemo2();
		new GCDemo2();*/
			//new GCDemo3(i);

	}


protected void finalize(){
	System.out.println(this+"finalized to cleanup"+objId);
}
}


/*1creatd
2creatd
GCDemo3@c7b3681finalized to cleanup1
GCDemo3@2bcc97efinalized to cleanup2*/

