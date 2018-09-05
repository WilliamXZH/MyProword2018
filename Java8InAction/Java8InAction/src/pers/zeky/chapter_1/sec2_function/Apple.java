package pers.zeky.chapter_1.sec2_function;

public class Apple {
	
	private Integer weight;
	private String color;
	public Apple() {
		super();
	}
	public Apple(Integer weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	

	@Override
	public String toString() {
		return "Apple [weight=" + weight + ", color=" + color + "]";
	}
	
	public void outputAppleInfo(){
		System.out.println(this.toString());
	}
	
	//code in Java8
	public static boolean isGreenApple(Apple apple){
		return "green".equals(apple.getColor());
	}
	public static boolean isHeavyApple(Apple apple){
		return apple.getWeight() > 150;
	}
	
	

}
