package pers.zeky.chapter_2.sec_1;

public class Apple {

	private Integer weight;
	private String color;
	
	public Apple(Integer weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}

	public Apple() {
		super();
	}

	public Apple(Integer weight) {
		super();
		this.weight = weight;
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
	
	
	
}
