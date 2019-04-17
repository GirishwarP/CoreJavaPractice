package com.practice;

import java.util.Scanner;

public class FibonacciSeriesRecursive {
	
	static int first = 0;
	static int second = 1;
	static int sum = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number : ");
		int num = sc.nextInt();
		
		fibonacci(num);
	}

	private static void fibonacci(int num) {
		if (num > 0) {
			sum = first + second;
			first = second;
			second = sum;
			System.out.print(sum + " ");
			fibonacci(num-1);
		}
	}
}
