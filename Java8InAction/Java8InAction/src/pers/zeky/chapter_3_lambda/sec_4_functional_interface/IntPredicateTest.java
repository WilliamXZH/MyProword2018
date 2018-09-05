package pers.zeky.chapter_3_lambda.sec_4_functional_interface;

public class IntPredicateTest {

	public static void main(String[] args) {
		IntPredicate evenNumbers = (int i)->i%2==0;
		evenNumbers.test(1000);
		
		Predicate<Integer> oddNumbers = (Integer i)->i%2==1;
		oddNumbers.test(1000);
	}
	
}
