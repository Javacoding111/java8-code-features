package com.test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.test.dao.EmployeeDao;

public class EmployeeNamesSalaryDescening {
	
	public static void main(String[] args) {
		List<Employee> empList = EmployeeDao.getEmployees();
		List<String> namesList = empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).map(emp-> emp.getName()).collect(Collectors.toList());
		System.out.println(namesList);
	}
}