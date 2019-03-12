package com.practice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		
		int num = sc.nextInt();
		int reverse = 0;
		int remainder;
		
		while(num > 0) {
			remainder = num%10;
			reverse = reverse*10 + remainder;
			num = num/10;
		}
		
		System.out.println("Reverse is : "+ reverse);
	}
}
