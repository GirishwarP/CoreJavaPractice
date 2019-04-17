package com.collection.practice;

import java.util.ArrayList;
import java.util.List;

public class SpacesTest {
	
	static String s;
	static boolean b;
	static double d;
	static float f;
	static long l;
	static char c;
	static int i;

	public static void main(String[] args) {

		System.out.println("String Default : " + s);
		System.out.println("boolean Default : " + b);
		System.out.println("double Default : " + d);
		System.out.println("float Default : " + f);
		System.out.println("long Default : " + l);
		System.out.println("char Default : " + c);
		System.out.println("int Default : " + i);
		
		List<String> list = new ArrayList<String>();
		list.add("Girish");
		list.add(new String());
		list.add("Yash");
		list.add(new String());
		list.add(new String());
		list.add("Tech");
		
		for(String s : list) {
			System.out.println(s);
		}
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).contentEquals("")) {
				System.out.println(i);
			}
		}
		
		System.out.println("-------------");
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).equals("")) {
				System.out.println(i);
			}
		}
	}
}
