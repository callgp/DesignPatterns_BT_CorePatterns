
public class ThrowKeyword2 {
	public static void main(String[] args) {
		try {
			throw new Exception("checked exc");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("handling checked exception here");
		}//that directly extend exception are checked one exend run time exception are un cehcked...checked must handle
	System.out.println("after that normal flow");
	}

}
