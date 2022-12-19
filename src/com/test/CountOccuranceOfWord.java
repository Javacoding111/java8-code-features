package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccuranceOfWord {
	
	public static void main(String[] args) {
		String str = "welcome to code decode and code decode welcome you";
		List<String> wordList = Arrays.asList(str.split(" "));
		Map<String, Long> map = wordList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		map.entrySet().stream().forEach(System.out::println);
		
	}

}
