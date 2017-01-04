package com.csrk.apps;

import java.util.Scanner;

public class BinarySearch {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("Enter Number of Elements");
		int n = in.nextInt();
		System.out.println("Number of Elements Entered: " +n);
		
		int []array = new int[n];
		System.out.println("Enter " +n+ " Integers" );
		for (int i = 0; i < n; i++) {
			array[i]=in.nextInt();
		}
		System.out.println("Array of Elements");
		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}
		System.out.println("Enter Element to Find");
		int search = in.nextInt();
		System.out.println("Element to find : " +search);
		
		int first = 0;
		int last = n-1;
		int middle  = (first+last)/2;
		
		while(first<=last){
			
			if (array[middle]>search) {
				last = middle - 1;
			} else 
			if (array[middle]<search) {
				first = middle + 1;
			}else
			if (array[middle]==search){
				System.out.println("Number " +search+ " is found at location " +middle+ ".");
				break;
			}
			middle = (first+last)/2;
		}
		if(first>last){
			System.out.println("Number " +search+ " is not present in the list.");
		}
			
	}

}
