  
package ttt;//edit

import java.util.Scanner;

public class GameBoard {
	
	public static void printBoard() {
			System.out.println("— — — — — — -");
			for (int i = 0; i < 3; i++) {
				System.out.print("| ");
			for (int j = 0; j < 3; j++) {
				System.out.print(TicTacToe.board[i][j] + " | ");
			}
			System.out.println();
			System.out.println("— — — — — — -");
			}
			}
	
} 
		//printing tic tac toe board code from : https://medium.com/@ojusmilindsave/tutorial-to-implement-tic-tac-toe-in-java-ad639661a9b
	