package com.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmpName {
	
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "Raj", 25, 20000, "Testing"));
		employeeList.add(new Employee(2, "Ram", 20, 40000, "Testing"));
		employeeList.add(new Employee(3, "Sunder", 45, 100000, "Dev"));
		employeeList.add(new Employee(4, "Techie", 35, 75000, "Dev"));
		employeeList.add(new Employee(1, "Raj", 25, 20000, "Testing"));
		
		List<String> empNamesList = employeeList.stream().filter(e-> e.getSalary()>40000).map(Employee::getName).map(String::toUpperCase).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(empNamesList);
	}

}
