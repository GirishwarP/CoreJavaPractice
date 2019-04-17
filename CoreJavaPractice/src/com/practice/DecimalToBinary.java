package com.practice;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		System.out.println("Decimal Number : ");
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int quotient = number;
		int[] binaryNumber = new int[100];
		int i=0;
		
		while(quotient != 0) {
			binaryNumber[i++] = quotient%2;
			quotient = quotient/2;
		}
		
		System.out.print("Binary Number : ");
		for(int j=i-1; j>=0; j--) {
			System.out.print(binaryNumber[j]);
		}
	}
}
