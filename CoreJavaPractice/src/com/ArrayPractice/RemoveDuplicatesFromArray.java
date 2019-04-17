package com.ArrayPractice;

//with sorting and using Extra space(extra array)

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {

		int[] array = { 12, 10, 15, 20, 56, 10, 20, 89, 89 };

		sort(array);
		print(array);

		System.out.println();

		removeDuplicates(array);
	}

	private static void removeDuplicates(int[] array) {
		int[] nArray = new int[array.length];
		int i = 0;
		for (int j = 0; j < array.length - 1; j++) {
			if (array[j] == array[j + 1]) {
				nArray[i++] = array[j + 1];
				j++;
			} else {
				nArray[i++] = array[j];
			}
		}
		if (array[array.length - 1] != array[array.length - 2])
			nArray[i] = array[array.length - 1];
		print(nArray);
	}

	private static void print(int[] array) {

		for (int i : array) {
			System.out.print(i + " ");
		}
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
	}
}
