package com.ArrayPractice;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Give Number and Press Enter..." );
		int flag = 0;
		int[] array = new int[10];

		while(flag < 10) {
			int number = sc.nextInt();
			array[flag] = number;
			flag++;
		}
		
		System.out.print("\nGiven Array : ");
		printArray(array);
		
		System.out.print("\nAfter Sorting : ");
		sortArray(array);
		
		printArray(array);
		
		System.out.println("\nNumber that u want to search : ");
		int number = sc.nextInt();
		int search = binarySearch(array, 0, array.length-1, number);
		if(search == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at : " + search + " index");
	}

	private static int binarySearch(int[] array, int start, int end, int number) {
		
		if(end >= start) {
			int mid = start + (end-1)/2;
			if(array[mid] == number)
				return mid;
			
			if(array[mid] > number)
				return binarySearch(array, start, mid-1, number);
			else 
				return binarySearch(array, mid+1, end, number);
		}
		
		return -1;
	}

	private static void sortArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length-1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}

	private static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
