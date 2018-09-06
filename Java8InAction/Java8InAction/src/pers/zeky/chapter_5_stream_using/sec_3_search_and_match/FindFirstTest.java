package pers.zeky.chapter_5_stream_using.sec_3_search_and_match;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstTest {
	
	public static void main(String[] args) {
		
		List<Integer> someNumber = Arrays.asList(1,2,3,4,5);
		Optional<Integer> firstSquareDivisibleByThree = 
				someNumber.stream().map(x->x*x)
				.filter(x->x%3==0)
				.findFirst();
		System.out.println(firstSquareDivisibleByThree);
		
	}

}
