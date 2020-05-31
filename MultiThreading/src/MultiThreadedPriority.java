
public class MultiThreadedPriority extends Thread{
	
	public static void main(String[] args) throws InterruptedException {
		MultiThreadedPriority mt=new MultiThreadedPriority();
		mt.setPriority(MAX_PRIORITY);
		mt.start();
		
		
		MultiThreadedPriority mt1=new MultiThreadedPriority();
		mt1.setPriority(MIN_PRIORITY);//no guarantee but most cases it works
		mt1.setName("mt1");
		mt1.start();
		
		
		/*Thread currentThread = Thread.currentThread();
		System.out.println("name is "+currentThread.getName());*/
		
		/*for(int j=1;j<=200;j++){
			System.out.print("j :"+j+"\t");//happens parallelly//no waste of processor time
		    Thread.sleep(1000);//if we wait for resource web service or server or db appl try again after the sleep time..
		}*/
		
	}
	
	public void run(){
		System.out.println("thread name "+Thread.currentThread().getName());
		/*Thread currentThread = Thread.currentThread();
		currentThread.setName("print 200 nbrs");
		System.out.println("name is "+currentThread.getName());*/
		
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
