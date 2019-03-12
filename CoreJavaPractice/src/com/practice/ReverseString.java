package com.practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Word/Line : ");
		Scanner sc = new Scanner(System.in);
		String string = sc.next();

		System.out.println("Reverse is : " + reverseString(string) );
	}

	private static String reverseString(String string) {
		String reverse = "";
		for(int i=string.length()-1; i>=0; i--) {
			reverse = reverse + string.charAt(i);
		}
		return reverse;
	}
}
