
class Cons<T>{
	private T value;
	public Cons(T value){
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}

public class GenericDemo03 {

	public static void main(String[] args) {
		Cons<String> c = new Cons<String>("���췽����ʹ�÷���");
		System.out.println(c.getValue());
	}
	
}
