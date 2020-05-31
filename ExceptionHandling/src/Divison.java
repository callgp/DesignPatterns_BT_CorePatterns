import java.util.Scanner;

public class Divison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		
		try{
		System.out.println("enter two integers");
		
		Scanner obj=new Scanner(System.in);
		
		a=obj.nextInt();
		b=obj.nextInt();
		c=a/b;
		
		System.out.println("result"+c);
		}scatch (RuntimeException e) {//without catch ok normal flow..but negative case exception comes
			// TODO: handle exception
			System.out.println("please do not enter 0 in bottom");
		}finally{
			System.out.println("in finally at last always");
		}
		System.out.println("more can go here");

	}

}
