package com.qa.calculator;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addTwo(1, 2);
		addTwo(8, 9);
		addTwo(7, 5);
		
		subTwo(8,6);
		
		mulTwo(4,5);
		
		divTwo(8,2);
	} 
	public static void addTwo(int num1, int num2) {
	
		int result = num1 + num2;
		System.out.println(result);
	}
	public static void subTwo(int num1, int num2) {
		
		int result = num1 - num2;
		System.out.println(result);
	}
	public static void mulTwo(int num1, int num2) {
	
		int result = num1 * num2;
		System.out.println(result);
	}
	public static void divTwo(int num1, int num2) {
		
		int result = num1 / num2;
		System.out.println(result);
	}
	
}
