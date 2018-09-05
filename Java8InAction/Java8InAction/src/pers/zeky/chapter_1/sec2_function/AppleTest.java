package pers.zeky.chapter_1.sec2_function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppleTest {

	public static List<Apple> filterGreenApples(List<Apple> inventory){
		List<Apple> result = new ArrayList<>();
		
		for (Apple apple:inventory){
			if ("green".equals(apple.getColor())){
				result.add(apple);
			}
		}
		return result;
	}
	
	public static List<Apple> filterHeadvyApples(List<Apple> inventory){
		List<Apple> result = new ArrayList<>();
		
		for (Apple apple:inventory){
			if (150 < apple.getWeight()){
				result.add(apple);
			}
		}
		return result;
	}
	
	
	
	public interface Predicate<T>{
		boolean test(T t);
	}
	
	static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p){
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory){
			if (p.test(apple)){
				result.add(apple);
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		
		List<Apple> inventory = Arrays.asList(new Apple(80,"green"),
				new Apple(155,"green"),
				new Apple(120,"red"));
		
		List<Apple> greenApples = filterApples(inventory, Apple::isGreenApple);
		greenApples.forEach(Apple::outputAppleInfo);
		System.out.println();
		List<Apple> heavyApples = filterApples(inventory, Apple::isHeavyApple);
		heavyApples.forEach(Apple::outputAppleInfo);
		System.out.println();
		//List<Apple> filteredApples = filterApples(inventory,(Apple a)->"green".equals(a.getColor()));
		//List<Apple> filteredApples = filterApples(inventory,(Apple a)->a.getWeight()>150);
		List<Apple> filteredApples = filterApples(inventory,(Apple a)->a.getWeight()<80||"brown".equals(a.getColor()));
		
		
		filteredApples.forEach(Apple::outputAppleInfo);
		
	}
	
	//public static <T>Collection<T> filter(Collection<T> c, Predicate<T> p);
	//filter(inventory,(Apple a)->a.getWeight()>50);
}
