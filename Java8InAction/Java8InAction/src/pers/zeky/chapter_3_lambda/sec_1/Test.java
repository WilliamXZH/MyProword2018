package pers.zeky.chapter_3_lambda.sec_1;

public class Test {

	public static Test04Predicate test04(Test04Predicate tp){
		return tp;
		//System.out.println(tp.apply());
	}
	public static Test05Predicate test05(Test05Predicate tp){
		return tp;
	}
	
	public static void main(String[] args) {
		
		Test04Predicate tp = (Integer i)->{return "Alan-"+i;};
		
		System.out.println(tp.apply(10));
		System.out.println(test04((Integer i)->{return "test-"+i;}).apply(+99));
		
		/* test 05 */
		System.out.println(test05((String s)->{/*"IronMan"*/;}));
		
	}
	
}
