package com.csrk.apps;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int i;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number of elements");
		int noElements = in.nextInt();
		System.out.println("Number of Elements " +noElements);
		int []arrayElements = new int[noElements];
		System.out.println("Enter elements of array");
		for (i = 0; i < noElements; i++) {
			arrayElements[i] = in.nextInt();
			}
		System.out.println("Array Elements are ");
		for (i = 0; i < noElements; i++) {
			System.out.println(arrayElements[i]);
		}
		
		System.out.println("Enter Element to search");
		int search = in.nextInt();
		System.out.println("Element to search " +search);
		
		for (i = 0; i < noElements; i++) {
			if (arrayElements[i]==search) {
				System.out.println("Element " +search+ " found at location " +i);
				break;
			}
			
		}
		if(i == noElements){
			System.out.println("Number " +search+ " not present in the list");
	}

	}
	}
