
package ttt;

public class Check {

	public static boolean checkforwin() {
		return (diagonalWin()|| checkColandRowWin()); //checks row, diagonal, col for wins
	}

	public static boolean diagonalWin() {
		if (compareChars(TicTacToe.board[0][0], TicTacToe.board[1][1], TicTacToe.board[2][2])) {
			return true;
		}
		if (compareChars(TicTacToe.board[0][2], TicTacToe.board[1][1], TicTacToe.board[2][0])) {
			return true;
		}
		else {
			return false;
		}
	}

	public static boolean checkColandRowWin() {
		for (int i = 0; i < 3; i++) { 
			if (compareChars(TicTacToe.board[0][i], TicTacToe.board[1][i], TicTacToe.board[2][i])) { //checks columns
				return true;
			}
			if (compareChars(TicTacToe.board[i][0], TicTacToe.board[i][1], TicTacToe.board[i][2])) { //checks rows
				return true;
			}
		}
		return false;
	}
	
	private static boolean compareChars(char char1, char char2, char char3) { //compares the characters in the 3 places
		if ((char1 != '-') && (char1 == char2) && (char2 == char3)) {
			return true;
		}
		return false;
	}


}