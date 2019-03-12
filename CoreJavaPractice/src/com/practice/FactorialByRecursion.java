package com.practice;

import java.util.Scanner;

public class FactorialByRecursion {

	public static void main(String[] args) {
		System.out.println("Number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.println("Factorial is : " + factorial(number));
	}

	private static int factorial(int number) {
		if(number == 0 || number == 1) {
			return 1;
		}
		return number*factorial(number-1);
	}
}
