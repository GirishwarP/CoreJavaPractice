package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Word : ");
		String s = sc.next();

		System.out.println("First Non-repeated Character : " + firstNonRepeatedcharacter(s));
	}

	public static Character firstNonRepeatedcharacter(String s) {
		char[] cArr = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : cArr) {
			if (map.containsKey(c))
				map.put(c, map.get(c) + 1);
			else
				map.put(c, 1);
		}

		for(int i=0; i<s.length(); i++) {
			char key = s.charAt(i);
			
			if(map.get(key)==1) {
				return key;
			}
		}
		return null;
	}
}
