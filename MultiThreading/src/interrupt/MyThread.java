package interrupt;

public class MyThread extends Thread{

	public void run(){
		try {
		for (int i = 0; i <=10; i++) {
			System.out.println("i am lazy thread");
			
				Thread.sleep(2000);
			} 
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("interrupted");
		}
	}
}
