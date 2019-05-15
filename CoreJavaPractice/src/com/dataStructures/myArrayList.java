package com.dataStructures;

public class myArrayList<T> {

	int initialCap = 10;
	int newCap = 0;
	Object[] list = new Object[initialCap];
	
 	public static void main(String[] args) {
		
 		myArrayList<Object> list = new myArrayList<Object>();
 		list.add("girish");
 		list.display(list);
	}

	private void display(myArrayList<Object> list) {
		
		
	}

	private boolean add(Object o) {
		
		if(initialCap > 0) {
			list[initialCap--] = o;
			return true;
		}else
			newCap = growCap();
		return false;
	}

	private int growCap() {
		return (initialCap*3)/2+1;
	}
}
