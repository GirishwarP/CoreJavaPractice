package com.practice;

import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Number : ");
		int num = sc.nextInt();
		int temp = num;
		int reverse = 0;
		
		while(num > 0) {
			int remainder = num%10;
			reverse = reverse*10 + remainder;
			num = num/10;
		}
		
		if(temp == reverse) 
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}
