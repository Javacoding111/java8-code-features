package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElements {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Ramu", "Raj", "Ramu");
		List<String> uniqueList = list.stream().distinct().collect(Collectors.toList());
		System.out.println("Unique elements list " + uniqueList);
	}

}
