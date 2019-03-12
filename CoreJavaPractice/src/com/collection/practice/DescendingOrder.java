package com.collection.practice;

import java.util.Comparator;

public class DescendingOrder implements Comparator<Integer>{

	@Override
	public int compare(Integer num1, Integer num2) {
		
		if(num1 > num2) {
			return -1;
		}else if(num1 < num2)
			return 1;
		else 
			return 0;
	}
}
