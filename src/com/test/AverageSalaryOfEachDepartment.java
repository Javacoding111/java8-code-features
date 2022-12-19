package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.test.dao.EmployeeDao;

public class AverageSalaryOfEachDepartment {

	public static void main(String[] args) {

		List<EmployeeDept> empList = EmployeeDao.getEmployeeDept();

//		Map<String, List<EmployeeDept>> empMap = empList.stream().collect(Collectors.groupingBy(EmployeeDept::getDepartment));
//		Map<Object, Object> averageSalary = empMap.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().stream().mapToDouble(EmployeeDept::getSalary).average()));
//		System.out.println(averageSalary);

		List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5);
//		double average = numbersList.stream().mapToDouble(Double::valueOf).average().getAsDouble();
//		System.out.println("Average of Numbers : " + average);

//		int multipliedNumber = numbersList.stream().reduce((a, b) -> a * b).get();
//		System.out.println("Multiplied Number : " + multipliedNumber);
		
		//convert list to map
		Map<Integer, Integer> map = numbersList.stream().collect(Collectors.toMap(Function.identity(), Function.identity()));
		System.out.println(map);
	}

}
