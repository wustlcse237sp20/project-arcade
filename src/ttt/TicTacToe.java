package ttt;

import java.util.Scanner;

public class TicTacToe {
	
	public static char[][] board;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		board = new char[3][3];
		 System.out.println("Welcome to the game of Tic Tac Toe");
		 System.out.println("You are player x, and the computer is player o ");
		 System.out.println("You are first! ");
		 
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				board[i][j] = '-';
			}
		}
		 run();
	}
	
	public static void run() {
		 while(Check.gameOver()) {
			 GameBoard.printBoard();
			 Position.gatherInput();
			 Position.userMove();
		 }
	}


}