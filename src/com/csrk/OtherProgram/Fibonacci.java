package com.csrk.OtherProgram;

public class Fibonacci {
	
	public int FiboSeries(String num) {
		try{// should try catch block be in the main class or the child class?
		int series = Integer.parseInt(num);
		int firstNum = 0;
		int secondNum = 1;
		if(series == 0)
		{
			return firstNum;
		}
		else
		if(series == 1)
		{
			return secondNum;
		}
		else{
		for (int i = 2; i < series; i++) {
		int nextNum = firstNum + secondNum;
		firstNum = secondNum;
		secondNum = nextNum;
		//return nextNum;
		}
		}
		}catch(NumberFormatException exp){
		System.out.println("Enter a valid number");
		}
		return 0;
		
	}

}
