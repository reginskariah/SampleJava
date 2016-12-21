package com.csrk.apps;

import com.csrk.OtherProgram.MonthFinder;
import com.csrk.OtherProgram.NotAValidInput;
import com.csrk.OtherProgram.NotAValidNumber;

public class MonthFinderApp {

	public static void main(String[] args) {
		MonthFinder monthFinder = new MonthFinder();
		try{
			String monthName = monthFinder.findMonth(args[0]);
			System.out.println("Month Name is:" +monthName);
		}catch(NotAValidInput exp){
		System.out.println("Please enter a valid input");
		}catch(NotAValidNumber exp){
			System.out.println("Enter a valid number");
		}
		
		

	}

}
