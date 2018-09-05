
interface GenInter<T>{
	public void say();
}

class Gin implements GenInter<String>{

	private String info;
	
	public Gin(String info){
		this.info = info;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public void say() {
		// TODO Auto-generated method stub
		
	}
	
}

public class GenericDemo05 {

	public static void main(String[] args) {
		Gin g = new Gin("jikexueyuan");
		System.out.println(g.getInfo());
	}
	
}
