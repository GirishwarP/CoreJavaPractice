package com.ArrayPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatedNumbersInArray {

	public static void main(String[] args) {
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		System.out.println("Numbers : ");
		
		while(flag < 10) {
			array[flag] = sc.nextInt();
			flag++;
		}

		System.out.print("\nGiven Array : ");
		print(array);
		
		System.out.print("\nRepeated Numbers are : ");
		findRepeatedNumbers(array);
	}

	private static void findRepeatedNumbers(int[] array) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<array.length; i++) {
			if(!map.containsKey(array[i]))
				map.put(array[i], 1);
			else
				map.put(array[i], map.get(array[i])+1);
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.print(entry.getKey()+ " ");
			}
			else
				System.out.println("No Repeated Numbers");
		}
	}

	private static void print(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}	
	}
}
