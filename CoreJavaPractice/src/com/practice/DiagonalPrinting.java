package com.practice;

import java.util.Arrays;

public class DiagonalPrinting {

	public static void main(String[] args) {
		
		int[][] arr = new int[4][4];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		arr[1][0] = 5;
		arr[1][1] = 6;
		arr[1][2] = 7;
		arr[1][3] = 8;
		arr[2][0] = 9;
		arr[2][1] = 10;
		arr[2][2] = 11;
		arr[2][3] = 12;
		arr[3][0] = 13;
		arr[3][1] = 14;
		arr[3][2] = 15;
		arr[3][3] = 16;
		
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		System.out.println(Arrays.toString(arr[3]));
		
		int max = 7; //n*n-(n-1)(n-1)
		int count=max-1;
		
		
		for(int i=0; i<max; i++) {
			int k = i;
			if(i < max/2 + 1) {
				for(int j=0; j<=i; j++) {
					System.out.println(arr[k][j]);
					k--;
				}
			}else {
				int l = max-count;
				int m=max/2;
				for(int j=0; j<max-i; j++) {
					System.out.println(arr[m][l]);
					l++;
					m--;
				}
				count--;
			}//else		
		}
	}
}
