package interrupt;

public class InterruptDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t=new MyThread();
		
		t.start();
		//t.interrupt();//if comment all 10 times
		System.out.println("end of main methodss");

	}

}

/*end of main methodss
i am lazy thread
interrupted*/


/*end of main methodss
i am lazy thread
i am lazy thread
i am lazy thread
i am lazy thread
i am lazy thread
i am lazy thread
i am lazy thread
i am lazy thread
i am lazy thread
i am lazy thread
i am lazy thread*/

