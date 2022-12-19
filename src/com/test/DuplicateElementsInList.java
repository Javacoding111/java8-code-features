package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementsInList {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,2,3,5,3,5,2);
		
		//Fetch the duplicate elemts in a list
//		Map<Object, Long> groupList = list.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
//		groupList.entrySet().stream().filter(entry -> entry.getValue()>1).forEach(entry -> System.out.println(entry.getKey()));
		
		//fetch all the unique elements
//		list.stream().distinct().forEach(System.out::println);
		
		Set<Integer> collect = list.stream().filter(name -> Collections.frequency(list, name) >=1).collect(Collectors.toSet());
		System.out.println(collect);
	}

}
