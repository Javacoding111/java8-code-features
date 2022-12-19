package com.test;

import java.util.Comparator;
import java.util.List;

import com.test.dao.EmployeeDao;

public class SortEmployeeList {

	public static void main(String[] args) {
		List<Employee> empList = EmployeeDao.getEmployees();
		empList.stream().sorted(Comparator.comparing(Employee::getName)).map(Employee::getName)
				.forEach(System.out::println);
	}

}
