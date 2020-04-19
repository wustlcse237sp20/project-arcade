package ttt;

public class Check {
	
	public static boolean gameOver() {
		while(Position.moves>9 && diagonalWin()==false) {
			return false;
		}
		return true;
	}
	
	public static boolean diagonalWin() {
		if(TicTacToe.board[1][1] == TicTacToe.board[2][2] && TicTacToe.board[2][2] == TicTacToe.board[3][3]) {
			return true;
		}
		else if (TicTacToe.board[3][1] == TicTacToe.board[2][2] && TicTacToe.board[2][2] == TicTacToe.board[1][3]) {
			return true;
		}
		return false;
	}
	

}
