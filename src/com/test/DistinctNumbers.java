package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DistinctNumbers {
	
	public static void main(String[] args) {
//		List<Integer> numbers = Arrays.asList(23,55,43,55,27,65,23,34);
		//numbers.stream().distinct().forEach(i -> System.out.println(i));;
//		numbers.stream().distinct().forEach(System.out::println);
		
		Stream<Integer> stream = Stream.of(34,76,34,78,44,78);
		stream.distinct().forEach(System.out::println);;
	}

}
