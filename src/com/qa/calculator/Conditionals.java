package com.qa.calculator;

public class Conditionals {

    public static void main(String[] args) {
        int number = 15;

        if(number <= 20) {
            System.out.println("Number is less than or equal to 20");
        } else if(number < 20) {
            System.out.println("Number is between 0 and 20");
        } else if(number < 40) {
            System.out.println("number is between 20 and 40"); 
        } else {
            System.out.println("Number is greater than or equal 40");
        }
    }
}