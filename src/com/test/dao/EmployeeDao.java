package com.test.dao;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.test.Employee;
import com.test.EmployeeDept;

public class EmployeeDao {

	public static List<Employee> getEmployees() {
		List<Employee> empList = Stream
				.of(new Employee(1, "Raj", 25, 20000, "Testing"), new Employee(2, "Ram", 20, 40000, "Devops"),
						new Employee(3, "Sunder", 40, 100000, "Dev"), new Employee(4, "Pichaih", 50, 60000, "DBA"))
				.collect(Collectors.toList());
		return empList;
	}

	public static List<EmployeeDept> getEmployeeDept() {
		List<EmployeeDept> list = Stream.of(new EmployeeDept(1, "Swarupa", "Development", 40000),
				new EmployeeDept(2, "Naveen", "Development", 60000), new EmployeeDept(3, "Pavan", "UI", 50000),
				new EmployeeDept(4, "Praveen", "UI", 30000)).collect(Collectors.toList());
		return list;
	}

}
