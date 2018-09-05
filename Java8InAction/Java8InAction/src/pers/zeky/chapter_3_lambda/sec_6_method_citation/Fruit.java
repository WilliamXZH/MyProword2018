package pers.zeky.chapter_3_lambda.sec_6_method_citation;

public class Fruit {

	private Integer weight;

	public Fruit(Integer weight) {
		super();
		this.weight = weight;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Fruit [weight=" + weight + "]";
	}

}
