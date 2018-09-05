package pers.zeky.chapter_4_leadin_stream.sec_1_whats_stream;

public class Dish {

	private String name;
	private Integer calories;
	private Type type;

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Dish(Integer calories, String name, Type type) {
		super();
		this.calories = calories;
		this.name = name;
		this.type = type;
	}

	public Dish(Integer calories, String name) {
		super();
		this.calories = calories;
		this.name = name;
	}

	public Integer getCalories() {
		return calories;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public Dish(Integer calories) {
		super();
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "Dish [name=" + name + ", calories=" + calories + ", type=" + type + "]";
	}

}
