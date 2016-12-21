package com.csrk.OtherProgram;

public class MonthFinder {

	public String findMonth(String MonthNo)
		throws NotAValidInput, NotAValidNumber
		{
		String MonthName = " "; //When i use this line in try block it gives an error?
		try{
		
		int MonthId = Integer.parseInt(MonthNo);
	
		if(MonthId<=0 || MonthId>12){
			throw new NotAValidNumber();
		}
		if (MonthId>0 && MonthId<=12) {
		switch(MonthId){
				case 1: MonthName = "January";
				break;
				case 2: MonthName = "February";
				break;
				case 3: MonthName = "March";
				break;
				case 4: MonthName = "April";
				break;
				case 5: MonthName = "May";
				break;
				case 6: MonthName = "June";
				break;
				case 7: MonthName = "July";
				break;
				case 8: MonthName = "August";
				break;
				case 9: MonthName = "September";
				break;
				case 10: MonthName = "October";
				break;
				case 11: MonthName = "November";
				break;
				case 12: MonthName = "December";
				break;
		}
		}
		}catch(NumberFormatException exp){
				throw new NotAValidInput();
		}
//error when throwing NotAValidNumber Exception.
//if we give a number not between 0 and 12 how does the code understand it should thrown valid number exception?		
		return MonthName;
	} //method ends here
}//  class ends here
