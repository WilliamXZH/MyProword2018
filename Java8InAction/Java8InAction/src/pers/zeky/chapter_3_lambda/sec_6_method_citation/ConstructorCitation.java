package pers.zeky.chapter_3_lambda.sec_6_method_citation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import pers.zeky.chapter_2.sec_1.Apple;

public class ConstructorCitation {
	
	public static List<Apple> map(List<Integer> list,Function<Integer,Apple> f){
		List<Apple> result = new ArrayList<>();
		for (Integer e:list){
			result.add(f.apply(e));
		}
		return result;
	}
	
	public static void main(String[] args) {
		
	
		Supplier<Apple> c1 = Apple::new;
		Apple a1 = c1.get();
		System.out.println(a1);
		
		BiFunction<Integer,String,Apple> c2 = Apple::new;
		Apple a2 = c2.apply(123, "green");
		System.out.println(a2);
		
		
		List<Integer> weights = Arrays.asList(7,3,4,10);
		List<Apple> apples = map(weights,Apple::new);
		System.out.println(apples);
		
		
		
	}

}
