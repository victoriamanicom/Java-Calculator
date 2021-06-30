package com.qa.calculator;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(addition(2, 3));
		System.out.println(subtraction(5, 3));
		System.out.println(multiplication(3, 4));
		System.out.println(division(10, 3));

	}

	public static int addition(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static int subtraction(int a, int b) {
		int subtractResult = a - b;
		return subtractResult;
	}

	public static int multiplication(int a, int b) {
		int product = a * b;
		return product;
	}

	public static double division(double a, double b) {
		double divisionResult = a / b;
		return divisionResult;
	}
}
