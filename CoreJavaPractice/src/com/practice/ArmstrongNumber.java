package com.practice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
	
		System.out.println("Number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int temp = number;
		int aNum = 0;
		
		while(number > 0) {
			int remainder = (int) (number%10);
			aNum = (int) (Math.pow(remainder, 3) + aNum);
			number = number/10;
		}
		
		System.out.println("Number : " + temp);
		System.out.println("Armstrong Number : " + aNum);

		if(temp == aNum)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
	}
}
