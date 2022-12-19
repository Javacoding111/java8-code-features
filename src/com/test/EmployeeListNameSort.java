package com.test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.test.dao.EmployeeDao;

public class EmployeeListNameSort {

	public static void main(String[] args) {
		List<Employee> empList = EmployeeDao.getEmployees();
		List<Employee> empListSort = empList.stream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
		System.out.println(empListSort);
	}

}
