package com.polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Car obj1 = new I20();
		I20 obj2 = new I20();
		
		Car.drive();
		
		obj2.drive();
		
	}

}
