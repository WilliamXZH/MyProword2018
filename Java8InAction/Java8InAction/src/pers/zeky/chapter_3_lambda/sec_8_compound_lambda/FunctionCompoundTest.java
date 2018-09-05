package pers.zeky.chapter_3_lambda.sec_8_compound_lambda;

import java.util.function.Function;

public class FunctionCompoundTest {

	public static void main(String[] args) {
		
		Function<Integer,Integer> f = x->x+1;
		Function<Integer,Integer> g = x->x*2;
		Function<Integer,Integer> h = f.andThen(g);//g(f(x)) or (g o f)(x)
		Function<Integer,Integer> h2 = f.compose(g);//f(g(x)) or (f o g)(x)
		int result = h.apply(1);
		int result2 = h2.apply(1);
		System.out.println(result+":"+result2);
		
	}
	
}
