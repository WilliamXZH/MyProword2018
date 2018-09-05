package pers.zeky.chapter_2.sec_1;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

	private static List<Apple> filterGreenApples(List<Apple> inventory){
		List<Apple> result = new ArrayList<Apple>();
		for (Apple apple:inventory){
			if ("green".equals(apple.getColor())){
				result.add(apple);
			}
		}
		return result;
	}
	
	private static List<Apple> filterApplesByColor(List<Apple> inventory, String color) {
		List<Apple> result = new ArrayList<Apple>();
		for (Apple apple:inventory){
			if (color.equals(apple.getColor())){
				result.add(apple);
			}
		}
		return result;
	}
	
	public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight){
		
		List<Apple> result = new ArrayList<Apple>();
		for (Apple apple:inventory){
			if (apple.getWeight() > weight){
				result.add(apple);
			}
		}
		return result;
		
	}
	
	public static List<Apple> filterApples(List<Apple> inventory,String color,int weight,boolean flag){
		List<Apple> result = new ArrayList<Apple>();
		for (Apple apple:inventory){
			if ((flag&&apple.getColor().equals(color))
				||(!flag&&apple.getWeight()>weight)){
				result.add(apple);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		List<Apple> inventory = new ArrayList<>();
		
		List<Apple> greenApples = filterApplesByColor(inventory,"green");
		List<Apple> redApples = filterApplesByColor(inventory,"red");
		
		List<Apple> greenApples2 = filterApples(inventory,"green",0,true);
		List<Apple> heavyApples = filterApples(inventory,"",150,false);		
		
	}
	
}
