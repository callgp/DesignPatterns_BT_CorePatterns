
public class MyGeneric<T> {
	
	T obj;
	
	public MyGeneric(T obj) {
		// TODO Auto-generated constructor stub
		this.obj=obj;
	}

	
	public void displayObjectDetails(){
		
		System.out.println("type of obj is "+obj.getClass().getName());
	}
	
	
	public T getObject(){
		return obj;
	}
}
