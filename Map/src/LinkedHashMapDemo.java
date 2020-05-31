import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> map=new LinkedHashMap<>();
		
		map.put("gp", 70);
		map.put("agpp", 700);
		map.put("ngppp", 7000);
		map.put("bgpppp", 70000);
		
		Set<String> keySet = map.keySet();
		System.out.println("keys "+keySet);
		
		Collection<Integer> values = map.values();
		System.out.println("valesc "+values);
		
		//to make keys ordered used linked hashmaps
		
		for(String key:keySet){
			System.out.println("key is "+key +"balue is "+map.get(key));
		}

	}

}

/*//all comes in same insertion orders
keys [gp, agpp, ngppp, bgpppp]
valesc [70, 700, 7000, 70000]
key is gpbalue is 70
key is agppbalue is 700
key is ngpppbalue is 7000
key is bgppppbalue is 70000*/


