
public class IndexOOBDemo {
public static void main(String[] args) {
	int arr[]={10,20,30};
	try{
	System.out.println("elements of arrays are");
	for(int i=0;i<=arr.length;i++){
		System.out.println(arr[i]);
	}
	}catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
		System.out.println("beyond index");
	}
	
	
	System.out.println("after");//wont execute as abrupt exception built in jvm class thrown
}


void method1(){
	System.out.println("method 1");
}
}
