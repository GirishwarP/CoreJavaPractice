package com.practice;

import java.util.Calendar;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Year : ");
		int year = sc.nextInt();
		
		System.out.println(year + " is " + isLeap1(year) + " Year");
		System.out.println(year + " is " + isLeap2(year) + " Year");
	}

	private static String isLeap1(int year) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		int days = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		
		if(days > 365)
			return "leap";
		return "not leap";
	}
	
	private static String isLeap2(int year) {
		
		if((year%400 == 0) || ((year%100) != 0 && (year%4 == 0)))
			return "leap";
		return "not leap";
	}
	
}
