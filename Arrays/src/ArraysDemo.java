
public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int arr[5]; invalid syntax
		//int arr[]={10,20,30,40,50};//2nd way
		int arr[]=new int[5];//3rd way to define array
		
		arr[0]=10;
		arr[1]=new Integer(20);//autoboing so ok
		//arr[2]=30.54;//Type mismatch: cannot convert from double to int
		arr[2]=30;
		
		//arr[7]=70;//no error at compiule time buyt at run time arryaindexoutofboundexc Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 7
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//for eacjh from java 1.5
		
	for(int element:arr){//datatype amd eacjelement in array //onluy forward directin...only one one at at time not i+10 element after i etc
		System.out.println("===="+element);
	}
		
	}

}


/*10
20
30
0//if no valuer assigns default 0
0*/
