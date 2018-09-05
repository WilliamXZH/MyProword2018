
class Con<T>{
	private T value;
	public Con(T value){
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}

public class GenericDemo02 {

	public static void main(String[] args) {
		Con<String> c = new Con<String>("构造方法中使用泛型");
		System.out.println(c.getValue());
	}
	
}
