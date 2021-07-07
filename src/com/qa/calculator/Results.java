package com.qa.calculator;

public class Results {

	static double Physics = 80;
	static double Chemistry = 90;
	static double Biology = 100;
	static double Total = Physics + Biology + Chemistry; 
	//the line above is the variable
	static double Percentage = (Total*100)/450;
	
	public static void main(String[] args) {
		
		findTotal();
		findPercentage();
		}
	
	public static void findTotal() {
		
		System.out.println(Total);
	}
		
	public static void findPercentage() {
		
		System.out.println(Percentage + "%");
		//You don't need to put find in as you have already named the method
	}
	}	
