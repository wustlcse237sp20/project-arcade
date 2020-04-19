package ttt;

public class Check {
	
	public static boolean gameOver() {
		while(Position.moves>9) {
			return false;
		}
		return true;
	}

}
