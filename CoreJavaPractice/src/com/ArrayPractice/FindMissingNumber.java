package com.ArrayPractice;

public class FindMissingNumber {

	public static void main(String[] args) {
		
		int[] array = {1,5,3,6,4,7,8,9,10};
		
		
		System.out.println("Missing Number is : " + findMissingNumber(array));
	}

	private static int findMissingNumber(int[] array) {
			
		int expectedSum = 10*(10+1)/2;
		int actualSum = 0;
		
		for(int i=0; i<array.length; i++) {
			actualSum = actualSum + array[i];
		}
		
		return expectedSum-actualSum;
	}
}
