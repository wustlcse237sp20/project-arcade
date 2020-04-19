package ttt;

import java.util.Scanner;

public class Position {
	
	public static String input;
	public static int rowUser;
	public static int colUser;
	public static Scanner keyboard = new Scanner(System.in);
	public static int moves; 
	
	public Position(int rowUser, int colUser) { //create a Position object (row,col)
		Position.rowUser = rowUser;
		Position.colUser = colUser;
	}
	
	public int getrowUser() {
		return rowUser;
	}
	
	public int getcolUser() {
		return colUser; 
	}
	
	public static String gatherInput() {  //gathering String input
		System.out.println("Enter your row col");
		input = keyboard.next();
		System.out.println("You entered " + input);
		gatherProperInput(input);
		return input;
	}
	
	public static Position gatherProperInput(String input) { //form input into Position objec
	    String[] positionInput = input.split(",");  //remove comma and feed into string array - pos input 
	    if (positionInput.length != 2) {
	    	System.out.println("Fix Format");
	    	gatherInput();
	    	return null;
	    }
	    
	    try {
	    rowUser = Integer.parseInt(positionInput[0])-1;
	    colUser = Integer.parseInt(positionInput[1])-1;
	
	    if(colUser == 0) {colUser = 2;} //prints for ease of viewer
	    else if(colUser == 2) {colUser = 0;}
	    }
	    catch (NumberFormatException e) { //possible error from converting the string into an int
	       System.out.println("Fix Format");
		   return null;
	    }
		return new Position(rowUser, colUser); 	//returning new object
	}
	
	public static void userMove() {
		TicTacToe.board[Position.colUser][Position.rowUser] = 'x';  //stores x in the position the user chose
	    moves++;
	}
	
}