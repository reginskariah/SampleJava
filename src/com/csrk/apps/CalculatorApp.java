package com.csrk.apps;

import com.csrk.calculator.Calculator;

public class CalculatorApp {

	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		System.out.println("Sum of 2 numbers");
		System.out.println(myCal.add(5,3));
		System.out.println("Difference of 2 numbers");
		System.out.println(myCal.subtract(6,2));
		System.out.println("Multiplication of 2 numbers");
		System.out.println(myCal.multiply(3,2));
		System.out.println("Division of 2 numbers");
		System.out.println(myCal.divide(10,2));
	}

}
