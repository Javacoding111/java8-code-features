package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortNumbers {
	
	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(54,32,64,32,76,24);
//		numberList.stream().sorted().forEach(System.out::println);
		numberList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
