package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctEmployeeList {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "Raj", 25, 20000, "Testing"));
		employeeList.add(new Employee(2, "Ram", 20, 40000, "Testing"));
		employeeList.add(new Employee(3, "Sunder", 45, 100000, "Dev"));
		employeeList.add(new Employee(4, "Techie", 35, 75000, "Dev"));
		employeeList.add(new Employee(1, "Raj", 25, 20000, "Testing"));

//		Set<Employee> set = new HashSet<>();
//		set.addAll(employeeList);
//		
//		System.out.println(set);

		System.out.println(employeeList.stream().distinct().collect(Collectors.toList()));

//		System.out.println(employeeList.stream().map(employee -> employee.getName()).distinct().collect(Collectors.toList()));

//		Map<String, List<Employee>> employeeMap = employeeList.stream().distinct().collect(Collectors.groupingBy(Employee::getDepartment));
//		Map<String, List<String>> map = employeeMap.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry->entry.getValue().stream().map(employee -> employee.getName()).collect(Collectors.toList())));
//		System.out.println(map);
		
//		map.entrySet().stream().forEach(entry -> {
//			System.out.println(entry.getKey() +": "+ entry.getValue());
//		});
	}

}
