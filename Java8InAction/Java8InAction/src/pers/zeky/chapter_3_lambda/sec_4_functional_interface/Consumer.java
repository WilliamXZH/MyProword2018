package pers.zeky.chapter_3_lambda.sec_4_functional_interface;

@FunctionalInterface
public interface Consumer<T> {

	void accept(T t);
}
