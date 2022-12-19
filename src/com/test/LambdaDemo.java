package com.test;

public class LambdaDemo {

	public static void main(String[] args) {
//		FunctionalInterfaceDemo demo = () -> "Hello from FI";
//		System.out.println(demo.testHello());

		FunctionalInterfaceMultiplicationDemo multiplyDemo = (a, b) -> {
			int c = a * b;
			return c;
		};
		int result = multiplyDemo.multiplyTwoNumbers(3, 4);
		System.out.println(result);
	}

}
