package pers.zeky.chapter_1.sec1_why;

public class Apple {

	private Integer weight;

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
	
	public int compareTo(Apple b){
		return this.getWeight()-b.getWeight();
	}
	
	
}
