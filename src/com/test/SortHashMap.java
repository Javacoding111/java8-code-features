package com.test;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SortHashMap {
	
	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Swarupa", 123);
		hashMap.put("Swarupa", 45);
		hashMap.put("Nehanya", 789);
//		System.out.println(hashMap);
		hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out:: println);
	}

}
