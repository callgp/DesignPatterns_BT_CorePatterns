
public class MultiThreadedName extends Thread{
	
	public static void main(String[] args) throws InterruptedException {
		MultiThreadedName mt=new MultiThreadedName();
		mt.start();
		
		Thread currentThread = Thread.currentThread();
		System.out.println("name is "+currentThread.getName());
		
		/*for(int j=1;j<=200;j++){
			System.out.print("j :"+j+"\t");//happens parallelly//no waste of processor time
		    Thread.sleep(1000);//if we wait for resource web service or server or db appl try again after the sleep time..
		}*/
		
	}
	
	public void run(){
		Thread currentThread = Thread.currentThread();
		currentThread.setName("print 200 nbrs");
		System.out.println("name is "+currentThread.getName());
		
	/*	for(int i=1;i<=200;i++){
			System.out.print("i :"+i+"\t");
			try {
				Thread.sleep(1000);//both child thread and code in main thread also we are sending to sleep
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("child thread exiting");
			}
		}*/
	}

}
