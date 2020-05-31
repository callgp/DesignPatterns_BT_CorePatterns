package ananymousinner;

public class AnonymousRunnable {

	public static void main(String[] args) {
		
		Thread t=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("anonymous runnable implementation");
			}
		});
		
		t.start();
	}
}
