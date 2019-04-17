package com.ArrayPractice;

import java.util.Scanner;

public class SumOfMinAndMax {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Array Limit : ");
		int limit = sc.nextInt();

		System.out.print("\nNumbers : ");
		int[] array = new int[limit];
		int flag = 0;

		while (flag < limit) {
			array[flag] = sc.nextInt();
			flag++;
		}

		System.out.print("\nGiven Array : ");
		print(array);

		System.out.print("\nAfter Sorting : ");
		sort(array);

		System.out.print("\nSums of Minimums and Maximums are : ");
		findSumForMinAndMax(array);
	}

	private static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		print(array);
	}

	private static void findSumForMinAndMax(int[] array) {
		if (array.length % 2 == 0) {
			for (int i = 0; i < array.length / 2; i++) {
				System.out.print(array[i] + array[array.length - 1 - i] + " ");
			}
		} else {
			for (int i = 0; i < array.length / 2; i++) {
				System.out.print(array[i] + array[array.length - 1 - i] + " ");
			}
			System.out.print(array[(array.length / 2)]);
		}
	}

	private static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
