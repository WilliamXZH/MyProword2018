package pers.zeky.chapter_3_lambda.sec_8_compound_lambda;

import java.util.function.Predicate;

import pers.zeky.chapter_2.sec_1.Apple;

public class PredicateCompoundTest {

	public static void main(String[] args) {
		
		Predicate<Apple> redApple = a->a.getColor().equals("red");
		Predicate<Apple> notRedApple = redApple.negate();
		Predicate<Apple> redAndHeavyApple = redApple.and(a->a.getWeight()>150);
		Predicate<Apple> redAndHeavyAppleOrGreen = 
				redApple.and(a->a.getWeight()>150)
				.or(a->"green".equals(a.getColor()));
		/* a.or(b).and(c) <==> (a||b)&&c */
	}
	
}
