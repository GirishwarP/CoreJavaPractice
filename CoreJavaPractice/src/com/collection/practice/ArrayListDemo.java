package com.collection.practice;

import java.util.*;

public class ArrayListDemo {
	
	static List<Integer> arrList1 = new ArrayList<Integer>();
	static List<Car> arrList2 = new ArrayList<Car>();
	
	public static void main(String[] args) {
		
		initialize(arrList1);
		Collections.sort(arrList1, new DescendingOrder());
		Collections.sort(arrList1, new LastDigitSorting());
		//arrList.sort(new LastDigitSorting());
		print(arrList1);
		
		arrList2 = addCar(arrList2);
		Collections.sort(arrList2);
		print(arrList2);
	}

	private static void print(List<Car> list) {
		for(Car c : list) {
			System.out.println(c);
		}
	}

	private static List<Car> addCar(List<Car> list) {
		
		Car c1 = new Car("i10", new Random().nextInt(200), new Random().nextLong());
		Car c2 = new Car("i20", new Random().nextInt(200), new Random().nextLong());
		Car c3 = new Car("Accent", new Random().nextInt(200), new Random().nextLong());
		Car c4 = new Car("Creta", new Random().nextInt(200), new Random().nextLong());
		Car c5 = new Car("Verna", new Random().nextInt(200), new Random().nextLong());
		
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		
		return list;
	}

	private static void print(Collection<Integer> list) {
		System.out.print(list.getClass().getName() + " : " );
		for(int i : list) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}

	private static void initialize(Collection<Integer> list) {
		for(int i=100; i<=110; i++) {
			list.add(i + new Random().nextInt(10));
		}
	}
}
