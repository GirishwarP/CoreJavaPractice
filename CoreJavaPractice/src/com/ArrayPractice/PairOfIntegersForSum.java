package com.ArrayPractice;

import java.util.Scanner;

public class PairOfIntegersForSum {

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
		
		System.out.println("\nGive Number : ");
		int sum = sc.nextInt();
		System.out.println("Possible Pairs are ;");
		pairsOfIntegers(array, sum);
	}

	private static void pairsOfIntegers(int[] array, int sum) {
			for(int i=0; i<array.length; i++) {
				for(int j=i+1; j<array.length; j++) {
					if(array[i] + array[j] == sum) {
						System.out.println(array[i] + ", " + array[j]);
						
					}
					else
						System.out.println("No Pairs");
				}
			}
		}

	private static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}
