class Info<T>{
	private T key;

	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "Info [key=" + key + "]";
	}
	
}


public class GenericDemo04 {
	public static void main(String[] args) {
		Info<String> i =new Info<String>();
		i.setKey("jikexueyuan");
		tell(i);
	}
	
	/**
	 * Í¨Åä·û: ?
	 * @param i
	 */
	public static void tell(Info<?> i){
		System.out.println(i);
	}

}
