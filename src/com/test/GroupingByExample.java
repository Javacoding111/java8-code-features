package com.test;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import com.test.dao.EmployeeDao;

public class GroupingByExample {
	public static void main(String[] args) {
		List<EmployeeDept> list = EmployeeDao.getEmployeeDept();
		Map<String, Optional<EmployeeDept>> groupingByMap = list.stream().collect(Collectors.groupingBy(EmployeeDept::getDepartment,
				Collectors.reducing(BinaryOperator.maxBy(Comparator.comparingInt(EmployeeDept::getSalary)))));
		groupingByMap.entrySet().stream().forEach(System.out::println);
//		Map<String, EmployeeDept> collectMap = list.stream()
//				.collect(Collectors.groupingBy(EmployeeDept::getDepartment, Collectors.collectingAndThen(
//						Collectors.maxBy(Comparator.comparingInt(EmployeeDept::getSalary)), Optional::get)));
//		collectMap.entrySet().stream().forEach(System.out::println);
	}
	
}
