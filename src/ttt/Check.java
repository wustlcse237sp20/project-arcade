package ttt;

public class Check {
	
	public static boolean gameOver() {
		while(diagonalWin()==true) {
			return true;
		}
		return false;
	}
	
	public static boolean diagonalWin() {
		if(TicTacToe.board[1][1] == TicTacToe.board[2][2] && TicTacToe.board[2][2] == TicTacToe.board[3][3]) {
			return true;
		}
//		else if (TicTacToe.board[3][1] == TicTacToe.board[2][2] && TicTacToe.board[2][2] == TicTacToe.board[1][3]) {
//			return true;
//		}
		return false;
	}
	

}
