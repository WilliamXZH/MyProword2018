package pers.zeky.main;

public enum Clothes {

	SMALL("red",1),
	MIDDLE("green",2),
	LARGE("blue",3);
	
	private final String color;
	private final Integer size;
	
	private Clothes(String c, Integer s){
		this.color = c;
		this.size = s;
	}
	
}
