package com.practice;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Number : ");
		int number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			if(isPrime(i))
				System.out.println(i+ " ");
		}
	}

	private static boolean isPrime(int i) {
		for(int j=2; j<i; j++) {
			if(i%j == 0)
				return false;
		}
		return true;
	}
}
