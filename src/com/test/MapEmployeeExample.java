package com.test;

import java.util.HashMap;
import java.util.Map;

public class MapEmployeeExample {
	
	public static void main(String[] args) {
		Map<Employee, String> map = new HashMap<>();
		map.put(new Employee(1, "Raj", 25, 20000, "Testing"), "TestingDept");
		map.put(new Employee(2, "Venkat", 20, 40000, "Devops"), "DevopsDept");
		map.put(new Employee(3, "Sunder", 40, 100000, "Dev"), "DevlopmentDept");
		map.put(new Employee(4, "Pichaih", 50, 60000, "DBA"), "DBADept");
		map.put(new Employee(4, "Pichaih", 50, 60000, "DBA"), "DBADept");
		map.put(new Employee(1, "Raj", 25, 20000, "Testing"), "TestingDept");
		System.out.println(map);
	}

}
