package com.ArrayPractice;

public class ArrayIntersection {

	public static void main(String[] args) {
		
		int[] arr1 = {1,4,5,8,9};
		int[] arr2 = {1,2,5,0,9};
		int[] arr3 = new int[arr1.length+arr2.length];
		int count=0;
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					arr3[count] = arr1[i];
					count++;
				}
				else
					continue;
			}
		}
		
		System.out.print("Intersection is : ");
		for(int i=0; i<count; i++) {
			System.out.print(arr3[i] + " ");
		}
	}
}
