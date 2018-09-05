package pers.zeky.chapter_3_lambda.sec_6_method_citation;

public class Apple extends Fruit {

	private Integer weight;
	
	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	

	public Apple(Integer weight) {
		super(weight);
		this.weight = weight;
	}

	public Apple(Integer weight, Integer weight2) {
		super(weight);
		weight = weight2;
	}

	@Override
	public String toString() {
		return "Apple [weight=" + weight + "]";
	}

	
	
}
