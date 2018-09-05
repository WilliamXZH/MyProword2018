package pers.zeky.chapter_3_lambda.sec_2_where_and_how_use_lambda;

import java.util.concurrent.Callable;
import java.util.function.Predicate;

import pers.zeky.chapter_2.sec_1.Apple;

public class Testing {
	
	public void execute(Runnable r){
		r.run();
	}
	
	public Callable<String> fetch(){
		return ()->"Tricky example ;-)";
	}
	
	public static void main(String[] args) {
		
		//Predicate<Apple> p = (Apple a)->a.getWeight();//not boolean
		
		boolean bool = false;
		System.out.println(bool);
		Test test = ()->System.out.println(bool);
		//bool = false;
		//Predicate<Apple> p = (Apple a)->new Boolean();
	}
	
	@FunctionalInterface
	public interface Test{
		public void test();
		//public void test2();
		default  void test2(){
			
		}
		
	}

}
