package com.practice;

import java.util.Scanner;

public class PrimeNumbers2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Number : ");
		int number = sc.nextInt();
		boolean isPrime = false;

		for (int i = 1; i <= number; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}else
					isPrime = true;
			}
			if(isPrime) {
				System.out.println(i);
			}
		}
	}
}
