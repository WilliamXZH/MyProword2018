package pers.zeky.chapter_3_lambda.sec_4_functional_interface;

@FunctionalInterface
public interface Predicate<T> {
	
	boolean test(T t);

}
