package com.practice;

import java.util.Scanner;

public class ReverseSentenceOnPlace {

	public static void main(String[] args) {
		
		System.out.println("Sentence : ");
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		
		String[] sArray = string.split(" ");
		String[] reverseArray = new String[sArray.length];
		
		
		for(int i=0; i<sArray.length; i++) {
			reverseArray[i] = reverse(sArray[i]);
		}
		
		for(int i=0; i<reverseArray.length; i++) {
			System.out.print(reverseArray[i] + " ");
		}
	}

	private static String reverse(String string) {
		String reverse = "";
		for(int i=string.length()-1; i>=0; i--) {
			reverse = reverse + string.charAt(i);
		}
		return reverse;
	}
}
