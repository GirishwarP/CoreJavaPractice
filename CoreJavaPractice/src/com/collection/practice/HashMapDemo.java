package com.collection.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		SortedMap<String, Integer> treeMap = new TreeMap<>();
		
		map.put(1, "ONE");
		map.put(4, "FOUR");
		map.put(5, "FIVE");
		map.put(2, "TWO");
		map.put(8, "EIGHT");
		map.put(9, "NINE");
		
		treeMap.put("ONE", 1);
		treeMap.put("FOUR", 4);
		treeMap.put("FIVE", 5);
		treeMap.put("TWO", 2);
		treeMap.put("EIGHT", 8);
		treeMap.put("NINE", 9);
		
		System.out.println(map.get(4));
		
		System.out.println(map.containsKey(8));
		System.out.println(map.containsKey(10));
	
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		
		Collection<String> values = map.values();
		System.out.println(values);
		
		System.out.println("---------------HashMap------------------");
		for(Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "--" + entry.getValue());
		}
		
		System.out.println("-------------After Sorting-----------------");
		
		List<Map.Entry<Integer, String>> entryList = new ArrayList<Map.Entry<Integer, String>>(map.entrySet());
		//Collections.sort(entryList, new ReverseOrderKeys());
		
		Collections.sort(entryList, new ReverseOrderValues());
		
		for(Map.Entry<Integer, String> entry : entryList) {
			System.out.println(entry.getKey() + "--" + entry.getValue());
		}
		
		
		System.out.println("---------------TreeMap------------------");
		for(Entry<String, Integer> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + "--" + entry.getValue());
		}
		
	}
}

class ReverseOrderKeys implements Comparator<Map.Entry<Integer, String>>{

	@Override
	public int compare(Entry<Integer, String> entry1, Entry<Integer, String> entry2) {
		
		int key1 = entry1.getKey();
		int key2 = entry2.getKey();
		
		if(key1 > key2) {
			return -1;
		}else if(key1 < key2) {
			return 1;
		}else
			return 0;
	}
}

class ReverseOrderValues implements Comparator<Map.Entry<Integer, String>>{

	@Override
	public int compare(Entry<Integer, String> entry1, Entry<Integer, String> entry2) {
		
		String value1 = entry1.getValue();
		String value2 = entry2.getValue();
		
		return -value1.compareTo(value2);
	}
}

