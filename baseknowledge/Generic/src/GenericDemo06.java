
class Gener{
	public <T>T tell(T t){
		return t;
	}
}

public class GenericDemo06 {

	public static void main(String[] args) {
		
		Gener g = new Gener();
		String str = g.tell("jikexueyuan");
		System.out.println(str);
		int i = g.tell(10);
		System.out.println(i );
		
	}
}
