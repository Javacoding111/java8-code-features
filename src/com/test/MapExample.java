package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
	
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "Raj", 25, 20000, "Testing"));
		employeeList.add(new Employee(2, "Ram", 20, 40000, "Testing"));
		employeeList.add(new Employee(3, "Sunder", 40, 100000, "Dev"));
		employeeList.add(new Employee(4, "Techie", 35, 75000, "Dev"));
		
		List <String> empNamesList = employeeList.stream().filter(employee -> employee.getAge() > 25).map(employee -> employee.getName()).toList();
		System.out.println("Employee names whose age greaterthan 25 is " +empNamesList);
	}

}
