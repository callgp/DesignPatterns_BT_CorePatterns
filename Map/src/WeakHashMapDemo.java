import java.util.HashMap;
import java.util.Map;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Map<Users, String> map=new HashMap<>();
		Users u=new Users();//123
		map.put(u,"tom");
        System.out.println(map);
        u=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(map);
	}

}
//{User=tom}
//gc did not happen as map using object even though we make object null....if weakhashmap it deletes.. and gc done..if no other objects in appl points to u other than map 