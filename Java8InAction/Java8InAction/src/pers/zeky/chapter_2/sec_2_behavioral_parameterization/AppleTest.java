package pers.zeky.chapter_2.sec_2_behavioral_parameterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import pers.zeky.chapter_2.sec_1.Apple;

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
	
	public static void prettyPrintApple(List<Apple> inventory,AppleFormatter formatter){
		for (Apple apple:inventory){
			String output = formatter.accept(apple);
			System.out.println(output);
		}
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

		List<Apple> redAndheavyApples = filterApples(inventory, new AppleRedAndHeavyPredicate());

		redAndheavyApples.forEach(new Consumer<Object>() {

			@Override
			public void accept(Object t) {
				// TODO Auto-generated method stub
				System.out.println(t.toString());
			}

		});
		System.out.println(redAndheavyApples.size());
		prettyPrintApple(inventory, new AppleFancyFormatter());
		prettyPrintApple(inventory, new AppleSimpleFormatter());

	}

}
