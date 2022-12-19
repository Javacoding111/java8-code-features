package com.test;

public class NotNullNotBlank {
	
	public static void main(String[] args) {
		String str = null;
		if(str == null || str.isEmpty()) {
		} else {
			System.out.println(str);
		}
		
	}

}
