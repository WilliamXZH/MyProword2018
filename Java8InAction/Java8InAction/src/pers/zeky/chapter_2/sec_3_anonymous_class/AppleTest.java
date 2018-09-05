package pers.zeky.chapter_2.sec_3_anonymous_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pers.zeky.chapter_2.sec_1.Apple;
import pers.zeky.chapter_2.sec_2_behavioral_parameterization.ApplePredicate;

public class AppleTest {
	public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

	public static void main(String[] args) {	
		
		List<Apple> inventory = Arrays.asList(new Apple(80, "green")
				, new Apple(155, "green")
				, new Apple(135, "white")
				, new Apple(175, "brown")
				, new Apple(175, "red")
				, new Apple(195, "brown")
				, new Apple(185, "red")
				, new Apple(115, "green")
				, new Apple(105, "pink")
				, new Apple(120, "red"));
		
		List<Apple> redApples = filterApples(inventory,new ApplePredicate(){
			public boolean test(Apple apple){
				return "red".equals(apple.getColor());
			}
		});
		System.out.println(redApples);
		
		List<Apple> result = filterApples(inventory, (Apple apple)->"red".equals(apple.getColor()));
		System.out.println(result);
		
	}
	
}
