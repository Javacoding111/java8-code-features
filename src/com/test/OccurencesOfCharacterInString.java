package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurencesOfCharacterInString {
	public static void main(String[] args) {
		String str = "Swarupa";
		List<String> list = Arrays.asList(str.split(""));
		Map<String, Long> countMap = list.stream().map(String::toLowerCase).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		countMap.entrySet().stream().forEach(System.out :: println);
	}

}
