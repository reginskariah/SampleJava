package com.csrk.apps;

public class ArrayPrint {

	public static void main(String[] args) {
		int []integerArray = {2,4,5,6,7,8,9};
		System.out.println("Using For Loop");
		for (int arrayCounter = 0; arrayCounter < integerArray.length; arrayCounter++) {
			System.out.println(integerArray[arrayCounter]);
		}
		System.out.println("Using While Loop");
		int arrayCounter=0;
		while (arrayCounter<integerArray.length) {
			System.out.println(integerArray[arrayCounter]);
			arrayCounter++;
		}
		System.out.println("Using DO-While Loop");
		int arrayCounter1=0;
		do{
			System.out.println(integerArray[arrayCounter1]);
			arrayCounter1++;
		}while(arrayCounter1<integerArray.length);

	}

}
