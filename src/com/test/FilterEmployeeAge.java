package com.test;

import java.util.*;
import java.util.stream.Collectors;

public class FilterEmployeeAge {
	
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "Raj", 25, 20000));
		employeeList.add(new Employee(2, "Ram", 20, 40000));
		employeeList.add(new Employee(3, "Sunder", 40, 100000));
		employeeList.add(new Employee(4, "Techie", 35, 75000));
		
		List <Employee> empList = employeeList.stream().filter(employee -> employee.getAge() > 25).collect(Collectors.toList());
		System.out.println("Employees age greaterthan 25 list is " +empList);
	}

}
