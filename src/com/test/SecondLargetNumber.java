package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondLargetNumber {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(5, 8, 10, 56);
		// approach 1 for highest number
//		Optional<Integer> highestNumber = numberList.stream().sorted(Comparator.reverseOrder()).findFirst();
//		System.out.println(highestNumber.get());

		// approach 2 for highest number
		int highestNumber = numberList.stream().collect(Collectors.maxBy(Comparator.comparing(Integer::valueOf))).get();
		System.out.println(highestNumber);

		// For second highest number
		Stream<Integer> secondHighestNumber = numberList.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1);
		System.out.println(secondHighestNumber.findFirst().get());
	}

}
