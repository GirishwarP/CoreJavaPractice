package com.practice;

public class StringPractice {

	public static void main(String...args) {

		String s1 = new String("girish");
		s1.concat(" patil");
		
		System.out.println(s1);
		// String s2 = new String("girish");
		// String s1 = "girish";
		String s2 = "girish";
		String s3 = s2;

		String s4 = new String(s2);

		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		System.out.println("s1==s2 : " + (s1 == s2));
		System.out.println("s2==s3 : " + (s2 == s3));
		System.out.println("s1==s4 : " + (s1 == s4));
		System.out.println("s2==s4 : " + (s2 == s4));
		
		System.out.println("s1.contains(ri) : "+ s1.contains("ri"));
		
		System.out.println("s2.concat(s3) : " + s2.concat(s3));
	}
}
