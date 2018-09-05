
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
		Cons<String> c = new Cons<String>("构造方法中使用泛型");
		System.out.println(c.getValue());
	}
	
}
