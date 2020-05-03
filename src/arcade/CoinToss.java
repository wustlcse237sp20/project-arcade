package arcade;
import java.util.Scanner;


public class CoinToss {
	
public static int playerVal = 0; 
public static int compVal = 0; 
public static int heads = 1;
public static int tails = 2; 

public static Scanner keyboard = new Scanner(System.in);
	
public static void main(String args[]){
	System.out.println("Welcome to the game of Coin Toss");
	System.out.println("Please enter either heads (h) or tails (t)!");
	check();
}

//comp = (int)(Math.random() * ((2 - 1) + 1)) + 1;	

public static void check(){
	String object= keyboard.next();	
	if(object.equals("h")) {
		playerVal = heads;
		System.out.println("You choose Heads!");
		System.out.println("Computer is Tails!");
	}
	else if(object.equals("t")) {
		playerVal = tails;
		System.out.println("You choose Tails!");
		System.out.println("Computer is Heads!");
	}
	else {
		System.out.println("Oops! Please enter either heads (h) or tails (t)!");
		check();
	}
	System.out.println("Lets Toss!/n...");
}

	


}
