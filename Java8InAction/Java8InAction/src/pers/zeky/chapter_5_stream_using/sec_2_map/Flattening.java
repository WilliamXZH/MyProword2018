package pers.zeky.chapter_5_stream_using.sec_2_map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import pers.zeky.util.ArrayUtil;

public class Flattening {
	public static void main(String[] args) {
		String [] wordsArray = {"Hello","World"};
		ArrayUtil.printArray(wordsArray);
		List<String> words = Arrays.asList("Hello","World");
		System.out.println(words);
		List<String[]> chars = words.stream().
				map(word->word.split("")).distinct().
				collect(Collectors.toList());
		System.out.println(chars.size());
		chars.forEach(ArrayUtil::printArray);
		
		String [] arrayOfWords = {"Goodbye","World"};
		Stream<String> streamOfWords = Arrays.stream(arrayOfWords);
		
		/* 尝试使用Arrays.stream */
		List<Stream<String>> chars2 = words.stream().map(word->word.split(""))
				.map(Arrays::stream)
				.distinct().collect(Collectors.toList());
		chars2.forEach(a->a.collect(Collectors.toList()).forEach(System.out::print));
		
		/* 使用faltMap */
		List<String> uniqueCharacters = words.stream()
				.map(w->w.split(""))
				.flatMap(Arrays::stream)
				.distinct()
				.collect(Collectors.toList());
		
	}
	
}
