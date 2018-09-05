import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
	
		map.put("key1","jikexueyuan");
		map.put("key2", "www");
		map.put("key3", "com");
		map.put("key4","eoe");
		map.put("key5","eoeandroid");
		map.put("key6","hello");
		
		String str = map.get("key1");
		System.out.println(str);
		
	}
	
}
