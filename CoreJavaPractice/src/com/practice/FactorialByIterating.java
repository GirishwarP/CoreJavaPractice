package com.practice;

import java.util.Scanner;

public class FactorialByIterating {

	public static void main(String[] args) {
		System.out.println("Number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.println("Factorial is : " + factorial(number));
	}

	private static int factorial(int number) {
		int factorial = 1;
		if(number == 0 || number == 1) {
			return 1;
		}else {
			for(int i=1; i<=number; i++) {
				factorial = factorial * i;
			}
			return factorial;
		}
	}
}
