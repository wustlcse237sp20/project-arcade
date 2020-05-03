package arcade;
import java.util.Scanner;


public class CoinToss {

public static int playerVal = 0;
public static int randomVal = 0; 
public static int heads = 1;
public static int tails = 2; 

public static Scanner keyboard = new Scanner(System.in);
	
public static void main(String args[]){
	System.out.println("Welcome to the game of Coin Toss");
	System.out.println("Please enter either heads (h) or tails (t)!");
	check();
}

public static void check(){
	randomVal = (int)(Math.random() * ((2 - 1) + 1)) + 1;	
	String object= keyboard.next();	
	if(object.equals("h")) {
		System.out.println("You choose Heads\nComputer is Tails");
		playerVal = heads;
		winnerPrint(object);
	}
	else if(object.equals("t")) {
		System.out.println("You choose Tails\nComputer is Heads");
		playerVal = tails;
		winnerPrint(object);
	}
	else {
		System.out.println("Oops! Please enter either heads (h) or tails (t)!");
		check();
	}
}

public static void winningCoinPrint(){
	System.out.println("Lets Toss...\n");
	System.out.println("The winning coin face is...");
	if(randomVal == heads) {
		System.out.println("HEADS");
	}
	if(randomVal == tails) {
		System.out.println("TAILS");
	}
}

public static void winnerPrint(String object) {
	winningCoinPrint(); 
	if(randomVal == playerVal) {
		System.out.println("YOU WIN");
	}
	else if(randomVal != playerVal) {
		System.out.println("You lose");
	}
}



	


}
