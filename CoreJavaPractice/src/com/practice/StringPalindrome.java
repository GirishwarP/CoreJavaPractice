package com.practice;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Word : ");
		String s = sc.next();
		String reverse = "";
		
		char[] sArray = s.toCharArray();
		for(int i=sArray.length-1; i>=0; i--) {
			reverse = reverse + sArray[i];
		}
		
		if(s.equals(reverse))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}
