package com.practice;

import java.util.Scanner;

public class ReverseDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Sentence : ");
		String s = sc.next();
		String[] sArray = s.split(s, ' ');
		
		for(String item : sArray) {
			System.out.println(item);
		}

	}
}
