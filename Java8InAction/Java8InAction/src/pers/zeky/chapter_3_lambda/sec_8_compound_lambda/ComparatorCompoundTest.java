package pers.zeky.chapter_3_lambda.sec_8_compound_lambda;

import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

import java.util.Arrays;

import pers.zeky.chapter_2.sec_1.Apple;

public class ComparatorCompoundTest {

	public static void main(String[] args) {
		List<Apple> inventory = Arrays.asList(new Apple(12),
				new Apple(34),new Apple(19),new Apple(23));
		
		Comparator<Apple> c = Comparator.comparing(Apple::getWeight);
		
		inventory.sort(comparing(Apple::getWeight).reversed());
		inventory.sort(comparing(Apple::getWeight)
				.reversed()
				.thenComparing(Apple::getColor));
		System.out.println(inventory);
		
	}
	
}
