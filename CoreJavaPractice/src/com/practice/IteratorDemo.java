package com.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("yash");
		list.add("girish");
		list.add("aditya");
		list.add("wilson");
		list.add("nishant");
		list.add("sudam");
		
		/*
		 * for(String item : list) { if(item.equals("girish")) list.remove(item); }
		 */
		
		Iterator<String> iterator = list.listIterator();
		while(iterator.hasNext()) {
			
		}
		
		System.out.println(list);
	}
}
