package com.csrk.apps;

import com.csrk.OtherProgram.Fibonacci;

public class FibonacciApp {

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		int fiboSeries = fibonacci.FiboSeries(args[0]);
		System.out.println("Fibonacci of numbers" +fiboSeries);

	}

}
