import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo03 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("key1","jikexueyuan");
		map.put("key2", "www");
		map.put("key3", "com");
		map.put("key4","eoe");
		map.put("key5","eoeandroid");
		map.put("key6","hello");
		Set<String> s = map.keySet();
		Iterator<String> i = s.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		Collection<String> c = map.values();
		Iterator<String> i2 = c.iterator();
		while(i2.hasNext()){
			System.out.println(i2.next());
		}
		
	}
	
}
