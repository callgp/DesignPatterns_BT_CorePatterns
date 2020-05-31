import java.util.HashMap;
import java.util.Map;

public class IdentityHashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<>();
		Integer id1=new Integer(10);
		Integer id2=new Integer(10);//both id1 and id2 same content
		map.put(id1, "gp");
		map.put(id2, "ss");
		System.out.println(map);


	}

}
//{10=ss} //since same key  overrides it if hashmap as uses equals com[arison...where ass identify uses == to see references not conents so keeps both]