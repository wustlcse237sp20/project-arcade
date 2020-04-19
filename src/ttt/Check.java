  
package ttt;

public class Check {
	
	public static boolean checkforwin() {
		return diagonalWin();
	}
	
	public static boolean diagonalWin() {
		 return ((checkRowCol(TicTacToe.board[0][0], TicTacToe.board[1][1], TicTacToe.board[2][2]) == true) || (checkRowCol(TicTacToe.board[0][2], TicTacToe.board[1][1], TicTacToe.board[2][0]) == true));
	}
	
	 private static boolean checkRowCol(char c1, char c2, char c3) {
		    return ((c1 != '-') && (c1 == c2) && (c2 == c3)); 
	 }
		      

}