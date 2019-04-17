package com.VendingMachine;

import java.util.HashMap;
import java.util.Map;

public class Inventory<T> {
	private Map<T, Integer> inventory = new HashMap<T, Integer>();
	
	public int getQuantity(T item) {
		Integer value = inventory.get(item);
		if(value == null)
			return 0;
		else
			return value;
	}
	
	public void add(T item) {
		int count = inventory.get(item);
		inventory.put(item, count++);
	}
	
	public void deduct(T item) {
		if(hasItem(item)) {
			int count = inventory.get(item);
			inventory.put(item, count--);
		}
	}
	
	public boolean hasItem(T item) {
		return getQuantity(item) > 0;
	}
	
	public void clear() {
		inventory.clear();
	}
	
	public void put(T item, int quantity) {
		inventory.put(item, quantity);
	}
}
