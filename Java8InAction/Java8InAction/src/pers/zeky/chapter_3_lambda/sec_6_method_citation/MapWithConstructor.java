package pers.zeky.chapter_3_lambda.sec_6_method_citation;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MapWithConstructor {
	
	static Map<String,Function<Integer,Fruit>> map = new HashMap<>();
	static{
		
		map.put("apple", Apple::new);
		map.put("orange", Orange::new);
		//etc...
	}
	
	public static Fruit giveMeFruit(String fruit,Integer weight){
		return map.get(fruit.toLowerCase()).apply(weight);
	}
	
	public static void main(String[] args) {
		
		System.out.println(giveMeFruit("Apple", 135));
		
	}

}
