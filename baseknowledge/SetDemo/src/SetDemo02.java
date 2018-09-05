import java.util.Set;
import java.util.TreeSet;

public class SetDemo02 {

	public static void main(String[] args) {
		Set<String> s = null;
		s = new TreeSet<String>();
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		s.add("E");
		s.add("F");
		s.add("F");
		System.out.println(s);
		
	}
	
}
