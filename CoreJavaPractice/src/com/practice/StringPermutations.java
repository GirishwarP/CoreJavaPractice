package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StringPermutations {

	static Set<String> permutations = null;
	
	public StringPermutations() {
		permutations = new HashSet<String>();
	}
	
	public static void main(String[] args) {
	
		StringPermutations obj = new StringPermutations();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("String : ");
		String s = sc.nextLine();
	
		obj.permute(s, 0, s.length()-1);
		
		System.out.println("No. of permutations : " + permutations.size());
		System.out.println(permutations);
		
	}

	private void permute(String s, int start, int end) {
		if(start == end)
			permutations.add(s);			
		else 
			for(int i=start; i<=end; i++) {
				s = swap(s, start, i);
				permute(s, start+1, end);
				s = swap(s, start, i);
			}
	}

	private static String swap(String s, int i, int j) {
		char[] cArr = s.toCharArray();
		char temp = cArr[i];
		cArr[i] = cArr[j];
		cArr[j] = temp;
		
		return String.valueOf(cArr);
	}
}
