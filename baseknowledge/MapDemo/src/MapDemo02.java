import java.util.HashMap;
import java.util.Map;

public class MapDemo02 {
	
	public static void main(String[] args) {
			
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("key1","jikexueyuan");
		map.put("key2", "www");
		map.put("key3", "com");
		map.put("key4","eoe");
		map.put("key5","eoeandroid");
		map.put("key6","hello");
		
		if(map.containsKey("key1")){
			System.out.println("key存在");
		}else{
			System.out.println("key不存在");
		}
		
		if(map.containsValue("jikexueyuan1")){
			System.out.println("value存在");
		}else{
			System.out.println("value不存在");
		}
	}
	
}
