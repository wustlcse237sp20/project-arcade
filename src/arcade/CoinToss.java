package arcade;
import java.util.Scanner;


public class CoinToss {

public static int playerVal;
public static int randomVal; 
public static int heads = 1;
public static int tails = 2; 

public static Scanner keyboard = new Scanner(System.in);
	
/**
 * Prints welcome messages 
 * @param args
 */
public static void main(String args[]){
	System.out.println("Welcome to the game of Coin Toss");
	System.out.println("Please enter either heads (h) or tails (t)!");
	check();
}

/**
 * Checks for correct input (h, t) and loops until correct input is provided
 */
public static void check(){
	String object= keyboard.next();	
	if(object.equals("h")) {
		System.out.println("You choose Heads, Computer is Tails");
		playerVal = heads;
		winnerCheck();
	}
	else if(object.equals("t")) {
		System.out.println("You choose Tails, Computer is Heads");
		playerVal = tails;
		winnerCheck();
	}
	else {
		System.out.println("Oops! Please enter either heads (h) or tails (t)!");
		check();
	}
}

/**
 * Imitates a coin flip and returns the winning coin face 
 * @return String message, either "HEADS" or "TAILS" 
 */
public static String winningCoinPrint(){
	randomVal = (int)(Math.random() * ((2 - 1) + 1)) + 1;	
	String win = "";
	System.out.println("Lets Toss...");
	try {
		Thread.sleep(500);
		System.out.println("3");
		Thread.sleep(500);
		System.out.println("2");
		Thread.sleep(500);
		System.out.println("1");
		Thread.sleep(500);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("The winning coin face is...");
	if(randomVal == heads) {
		win = "HEADS";
	}
	if(randomVal == tails) {
		win = "TAILS";
	}
	System.out.println("\n   * * *  \n *       *\n*  "+ win +"  *\n *       *\n   * * *  \n");
	return win;
}

/**
 * Checks if randomVal == playerValue (h or t)
 * @return true if the random coin face is equal to what the player chose 
 */
public static boolean winnerCheck() {
	winningCoinPrint(); 
	if(randomVal == playerVal) {
		System.out.println("YOU WIN");
		return true;
	}
	else{
		System.out.println("You lose");
		return false;
	}
}

/**
 * Checks for wins for UI implementation (inside "ui" class)
 * @return true if the user has won the game
 */
public static boolean uiCheckWinStatus(){
	if(winnerCheck() == true) {
		return true;
	}
	else {
		return false;
	}
}

}
