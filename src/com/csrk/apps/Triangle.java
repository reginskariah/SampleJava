package com.csrk.apps;

public class Triangle {

	public static void main(String[] args) {
		int noOfLines = Integer.parseInt(args[0]);
		
		try{
			for (int lnCounter = 1; lnCounter <= noOfLines; lnCounter++) {
				for (int starCounter = 1; starCounter <= lnCounter; starCounter++) {
					System.out.print("*");
				}
				
				System.out.println();
			}
			
		}catch(NumberFormatException exp){
			System.out.println("Please Enter a Valid Number");
		}
		
		
	}
	
}