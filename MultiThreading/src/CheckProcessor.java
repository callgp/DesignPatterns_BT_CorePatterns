
public class CheckProcessor implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("processed checks");

	}
	public static void main(String[] args) {
		
		CheckProcessor cp=new CheckProcessor();
		Thread t=new Thread(cp);
		t.start();
		
	}

}
