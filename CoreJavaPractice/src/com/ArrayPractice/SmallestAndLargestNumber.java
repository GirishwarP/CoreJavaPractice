package com.ArrayPractice;

import java.util.Scanner;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Give Number and Press Enter...");
		int flag = 0;
		int[] array = new int[10];

		while (flag < 10) {
			int number = sc.nextInt();
			array[flag] = number;
			flag++;
		}

		System.out.print("\nGiven Array : ");
		printArray(array);
		
		System.out.print("\nSmallest number : " + smallestNumber(array));
		System.out.print("\nLargest number : " + largestNumber(array));
	}

	private static int largestNumber(int[] array) {
		int max = array[0];
		for(int i=0; i<array.length; i++) {
			if(max < array[i])
				max = array[i];
		}
		return max;
	}

	private static int smallestNumber(int[] array) {
		int min = array[0];
		for(int i=0; i<array.length; i++) {
			if(min > array[i])
				min = array[i];
		}
		return min;
	}

	private static void printArray(int[] array) {

		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}
