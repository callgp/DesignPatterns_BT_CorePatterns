import java.util.Scanner;

public class JoinDemo extends Thread {
	
	private static int n,sum=0;

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		System.out.println("sum of N numbers");
		System.out.println("enter nbr");
		Scanner sc=new Scanner(System.in);
		JoinDemo.n=sc.nextInt();
		
		JoinDemo jd=new JoinDemo();
		jd.start();//make sure sop sum  wait till other method over and gets sum to print
		try {
			jd.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("sum of first given numbers is "+JoinDemo.sum);
		long end=System.currentTimeMillis();
		
		System.out.println("total time taken"+(end-start)/1000+"seconds");//since milli seconds devide by 1000 to make seconds
	}
	
	
	public void run(){
		for(int i=0;i<=JoinDemo.n;i++){
			JoinDemo.sum+=i;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}



/*sum of N numbers
enter nbr
4
sum of first given numbers is 6
*/
