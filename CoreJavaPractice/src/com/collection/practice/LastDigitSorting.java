package com.collection.practice;

import java.util.Comparator;

public class LastDigitSorting implements Comparator<Integer>{

	@Override
	public int compare(Integer num1, Integer num2) {
		int i = num1%10;
		int j = num2%10;
		
		if(i > j) {
			return 1;
		}else if(i < j) {
			return -1;
		}else
			return 0;
	}
}
