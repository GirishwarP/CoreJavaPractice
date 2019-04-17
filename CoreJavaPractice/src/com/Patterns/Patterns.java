package com.Patterns;

public class Patterns {

	public static void main(String[] args) {

		downwardRightAngleTriangle();
		upwardRightAngleTrianlge();
		StarPyramidPattern();
		NumberPyramidPattern();
		diamondPattern();
		rightAngledTriangle();
		downwardRightAngleTriangleNumbers();
	}

	private static void rightAngledTriangle() {
		System.out.println("-----------Right Angled Trianlge-----------");
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int k=i; k>=0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void diamondPattern() {
		System.out.println("-----------Diamond-----------");
		for (int i = 0; i < 5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = 5; i >=0; i--) {
			for(int j=0; j<5-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void upwardRightAngleTrianlge() {
		System.out.println("-----------Upward Right Angle Triangle-----------");
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void downwardRightAngleTriangle() {
		System.out.println("-----------Downward Right Angle Triangle-----------");
		for(int i=5; i>=0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void downwardRightAngleTriangleNumbers() {
		System.out.println("-----------Downward Right Angle Triangle of Numbers-----------");
		for(int i=5; i>=1; i--) {
			for(int j=1; j<i; j++) {
				System.out.print(i-j);
			}
			System.out.println();
		}
	}
	
	private static void StarPyramidPattern() {
		System.out.println("-----------Pyramid-----------");
		for (int i = 0; i < 5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	private static void NumberPyramidPattern() {
		System.out.println("-----------Number Pyramid-----------");
		for (int i = 0; i < 5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print(k+1 + " ");
			}
			System.out.println();
		}
	}
}
