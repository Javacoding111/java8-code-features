package com.test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortEmployeeMap {

	public static void main(String[] args) {
		Map<Employee, String> map = new HashMap<>();
		map.put(new Employee(1, "Raj", 25, 20000, "Testing"), "TestingDept");
		map.put(new Employee(2, "Venkat", 20, 40000, "Devops"), "DevopsDept");
		map.put(new Employee(3, "Sunder", 40, 100000, "Dev"), "DevlopmentDept");
		map.put(new Employee(4, "Pichaih", 50, 60000, "DBA"), "DBADept");
		map.put(new Employee(4, "Pichaih", 50, 60000, "DBA"), "DBADept");
		map.put(new Employee(1, "Raj", 25, 20000, "Testing"), "TestingDept");
		
		LinkedHashMap<Employee, String> map1 = map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName))).collect(Collectors.toMap(
			    Map.Entry::getKey, 
			    Map.Entry::getValue, 
			    (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
		System.out.println(map1);
		
//		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName))).forEach(System.out::println);
	}

}
