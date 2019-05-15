package com.TicTacToe;

import java.util.Scanner;

public class Tictactoe {

	public static char[][] board = new char[3][3];
	public static Scanner sc = new Scanner(System.in);
	public static int gameCounter = 0;
	
	public static void main(String[] args) {

		board();
		char f =  sc.next().charAt(0);
		char s =  sc.next().charAt(0);
		boolean flag = true;
		char pName = f;
		
		while(true) {
			if(flag) {
				flag = false;
				pName = f;
			}else {
				flag = true;
				pName = s;
			}
			System.out.println("Enter Value For "+ pName);
			int firstIndex = sc.nextInt();
			int secondIndex = sc.nextInt();
			
			if(!fill(pName, firstIndex,secondIndex)) {
				System.out.println("Try Again...");
			}
			
			if(isGameOver()) {
				System.out.println(pName + " Is winner");
				displayBoard();
				break;
			}else
				gameCounter++;
			
			if(gameCounter == 9) {
				System.out.println("It's Draw!!!");
				displayBoard();
				break;
			}
			displayBoard();
		}
	}

	public static boolean checkRow(int rowId) {
		char c =  board[rowId][0];
		for (int i = 0; i < board.length; i++) {
			if(board[rowId][i] != c || c == '_') {
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkColumn(int columnId) {
		char c =  board[0][columnId];
		for (int i = 0; i < board.length; i++) {
			if(board[i][columnId] != c || c == '_') {
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkDigonal(int index) {
		char c =  board[index][index];
		for (int i=0,j = 0; i < board.length; j++,i++) {
			if(board[i][j] != c || c == '_') {
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkDigonalBack(int index) {
		char c =  board[0][index];
		for (int i=0,j = index; i < board.length; j--,i++) {
			if(board[i][j] != c || c == '_') {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isGameOver() {
		for (int i = 0; i < board.length; i++) {
			if(checkRow(i)) {
				return true;
			}
		}

		for (int i = 0; i < board.length; i++) {
			if(checkColumn(i)) {
				return true;
			}
		}
		
		if(checkDigonal(0)) {
			return true;
		}
		
		if(checkDigonalBack(2)) {
			return true;
		}
		
		return false;
	}

	private static boolean fill(char c, int l, int m) {
		
		char present = board[l][m];
		if(present == '_') {
			board[l][m] = c;
			return true;
		}

		return false;
	}

	private static void displayBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void board() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = '_';
			}
		}
	}
}
