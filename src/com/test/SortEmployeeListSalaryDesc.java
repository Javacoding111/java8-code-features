package com.test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.test.dao.EmployeeDao;

public class SortEmployeeListSalaryDesc {
	
	public static void main(String[] args) {
		List<Employee> empList = EmployeeDao.getEmployees();
//		List<Employee> sorted = empList.stream().sorted(Comparator.comparing(Employee :: getSalary).reversed()).collect(Collectors.toList());
//		sorted.stream().forEach(System.out :: println);
		
		//Using comparator
//		List<Employee> empCompList = empList.stream().sorted((o1,o2) -> (int)(o2.getSalary() - o1.getSalary())).collect(Collectors.toList());
//		System.out.println(empCompList);
		
		//Based on name sort
//		List<Employee> empCompNameList = empList.stream().sorted((o1,o2) -> o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
//		System.out.println(empCompNameList);
		
		//Fetch top3 salarid employees
//		List<Employee> sorted = empList.stream().sorted(Comparator.comparing(Employee :: getSalary).reversed()).limit(3).collect(Collectors.toList());
//		sorted.stream().forEach(System.out :: println);
		
		//Fetch all employees whose salary is lessthan 3rd highest salary
		List<Employee> sorted = empList.stream().sorted(Comparator.comparing(Employee :: getSalary).reversed()).skip(3).collect(Collectors.toList());
		sorted.stream().forEach(System.out :: println);
		
	}
}
