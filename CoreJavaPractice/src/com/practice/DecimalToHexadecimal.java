package com.practice;

import java.util.Scanner;

public class DecimalToHexadecimal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Decimal Number : ");
		int decNumber = sc.nextInt();
		int temp = decNumber;
		String hexDecNumber = "";
		
		char[] hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		while(decNumber > 0) {
			int remainder = decNumber%16;
			hexDecNumber = hex[remainder] + hexDecNumber;
			decNumber = decNumber/16;
		}
		
		System.out.print("Hexadecimal Number : " + hexDecNumber + "\n");
		
		System.out.println("By Integer API : " + usingApi(temp));
	}

	private static String usingApi(int decNumber) {
		return Integer.toHexString(decNumber).toUpperCase();
	}
}
