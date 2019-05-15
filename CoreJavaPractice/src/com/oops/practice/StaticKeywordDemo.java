package com.oops.practice;

public class StaticKeywordDemo {
	
	
	public static void main(String[] args) {
		
		Samsung s1 = new Samsung("Galaxy Note 7", 2207);
		System.out.println(s1);
		
		Apple a1 = new Apple("IPhone X", 1123);
		System.out.println(a1);

	}

}

class Samsung {
	
	String name;
	int model;
	static String company;		//Static variable; common variable for each instance of Samsumg
	
	//static block to initialize static variable
	static {			
		company = "Samsung";
	}
	
	public Samsung(String name, int model) {
		this.name = name;
		this.model = model;
	}
	
	public String toString() {
		return company + " : " + name + " : " + model;	//we can use static variable in instance method
	}
}


class Apple {
	
	String name;
	int model;
	static String company;		//Static variable; common variable for each instance of Samsumg
	
	//static block to initialize static variable
	static {			
		company = "Apple";
	}
	
	public Apple(String name, int model) {
		this.name = name;
		this.model = model;
	}
	
	public String toString() {
		return company + " : " + name + " : " + model;
	}
}
