package com.practice;

import java.util.Scanner;

public class ReverseString1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		String rs = reverse(s);
		
		System.out.println("Given : " + s);
		System.out.println("Reverse : " + rs);
		
		if(s.equals(rs)) {
			System.out.println("Proceed");
		}else
			System.out.println("Try Again...");

	}

	private static String reverse(String s) {
		String reverse = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			reverse = reverse + s.charAt(i);
		}
		
		return reverse;
	}

}
