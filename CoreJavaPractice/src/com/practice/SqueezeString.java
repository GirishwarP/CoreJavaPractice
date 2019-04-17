package com.practice;

import java.util.Scanner;

public class SqueezeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Line : ");
		String s = sc.nextLine();
		
		System.out.println("Original line : " + s);
		System.out.println("Squeezed line : " + squeezeString(s));

	}

	private static String squeezeString(String s) {
		
		String squeezed = "";
		
		for(int i=0; i<s.length(); i++) {
			if(!(s.charAt(i)==' ')) {
				squeezed = squeezed + s.charAt(i);
			}
		}
		return squeezed;
	}
}
