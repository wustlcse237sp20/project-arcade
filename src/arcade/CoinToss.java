package arcade;
import java.util.Scanner;


public class CoinToss {
	 
public static int comp = 0; 
public static int heads = 1;
public static int tails = 2; 

public static Scanner keyboard = new Scanner(System.in);
	
public static void main(String args[]){
	System.out.println("Welcome to the game of Coin Toss");
	System.out.println("Please enter either heads (h) or tails (t)!");
	check();
}

public static void check(){
	comp = (int)(Math.random() * ((2 - 1) + 1)) + 1;	
	String object= keyboard.next();	
	if(object.equals("h")) {
		choiceH(object);
		System.out.println("You choose Heads! \nComputer is Tails!");
		System.out.println("Lets Toss!\n...");
	}
	else if(object.equals("t")) {
		choiceT(object);
		System.out.println("You choose Tails! \nComputer is Heads!");
		System.out.println("Lets Toss!\n...");
	}
	else {
		System.out.println("Oops! Please enter either heads (h) or tails (t)!");
		check();
	}
}

public static void choiceH(String object) {
	
}
public static void choiceT(String object) {
	
}

	


}
