package arcade;

import java.util.Scanner;

public class TicTacToe {

	public static Scanner keyboard = new Scanner(System.in);
	public static char[][] board;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Welcome to the game of Tic Tac Toe");
		 System.out.println("You are player x, and the computer is player o ");
		 board = new char[3][3];
		 initializeBoard();
		 printBoard();
	}
	
	public static void initializeBoard() {
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				board[i][j] = '-';
			}
		}
		
	}
	public static void printBoard() {
		
	      
	}
	
	

}
