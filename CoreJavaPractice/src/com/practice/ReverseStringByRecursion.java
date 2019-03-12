package com.practice;

import java.util.Scanner;

public class ReverseStringByRecursion {

	public static void main(String[] args) {
		System.out.println("Word/Line : ");
		Scanner sc = new Scanner(System.in);
		String string = sc.next();

		System.out.println("Reverse is : " + reverseString(string) );
	}

	private static String reverseString(String string) {
		if(string.isEmpty())
			return string;
		return reverseString(string.substring(1)) + string.charAt(0);
	}
}
