package com.practice;

import java.util.Scanner;

public class WordCounting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Line : ");
		String s = sc.nextLine();
		
		System.out.println("Total word count : " + wordCount2(s));
		System.out.println("Total word count : " + s.trim().split(" ").length);
	}

	private static int wordCount1(String s) {
		int count = 0;
		char[] cArr = new char[s.length()];
		for(int i=0; i<s.length(); i++) {
			cArr[i] = s.charAt(i);
			if((i>0) && (cArr[i]!=' ') && (cArr[i-1]==' ') || ((cArr[0]!=' ') && (i==0)))
				count++;
		}
		return count;
	}
	
	private static int wordCount2(String s) {
		String s1 = s.trim();
		int count = 0;
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)==' ') {
				count++;
			}
		}
		return count+1;
	}
}
