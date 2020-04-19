package ttt;

import java.util.Scanner;

public class Position {
	
	public static String input;
	public static int row;
	public static int col;
	public static Scanner keyboard = new Scanner(System.in);
	public static int moves; 
	
	
	public Position(int rowUser, int colUser) {
		this.row = rowUser;
		this.col = colUser;
	}
	
	public int getrowUser() {
		return row;
	}
	
	public int getcolUser() {
		return col; 
	}
	
	public static String gatherInput() {
		System.out.println("Enter your row col");
		input = keyboard.next();
		System.out.println("You entered " + input);
		gatherProperInput(input);
		return input;
	}
	
	public static Position gatherProperInput(String input) {
	    String[] posInput = input.split(",");
	    if (posInput.length != 2) {
	    System.out.println("Fix Format");
	    gatherInput();
	    return null;
	    }
	    try {
	    row = Integer.parseInt(posInput[0])-1;
	    col = Integer.parseInt(posInput[1])-1;
	    if(col == 0) {
	    	col = 2;
	    }
	    else if(col == 2) {
	    	col = 0;
	    }
	    
	    }catch (NumberFormatException e) {
	       System.out.println("Fix Format");
		   return null;
	    }
		return new Position(row, col);  	
	}
	
	public static void userMove() {
	    moves++;
		TicTacToe.board[Position.col][Position.row] = 'x';
	}
	
	public static void compMove() {
	    moves++;
		TicTacToe.board[Position.col][Position.row] = 'o';
	}




}
