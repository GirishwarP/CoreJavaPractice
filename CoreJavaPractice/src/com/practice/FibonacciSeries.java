package com.practice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Number : ");
		int num = sc.nextInt();
		
		int first = 1;
		int second = 0;
		int sum = 0;
		
		while(num > 0) {
			sum = first + second;
			first = second;
			second = sum;
			System.out.print(sum + " ");
			num--;
		}		
	}
}
