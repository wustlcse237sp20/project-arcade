package ttt;

import java.util.Scanner;

public class Position {
	
	public static String input;
	public static int rowUser;
	public static int colUser;
	public static Scanner keyboard = new Scanner(System.in);
	public static int moves; 
	
	public Position(int rowUser, int colUser) {
		this.rowUser = rowUser;
		this.colUser = colUser;
	}
	
	public int getrowUser() {
		return rowUser;
	}
	
	public int getcolUser() {
		return colUser; 
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
	    rowUser = Integer.parseInt(posInput[0])-1;
	    colUser = Integer.parseInt(posInput[1])-1;
	    if(colUser == 0) {colUser = 2;}
	    else if(colUser == 2) {colUser = 0;}
	    }catch (NumberFormatException e) {
	       System.out.println("Fix Format");
		   return null;
	    }
		return new Position(rowUser, colUser);  	
	}
	
	public static void userMove() {
		TicTacToe.board[Position.colUser][Position.rowUser] = 'x';
	    moves++;
	}




}