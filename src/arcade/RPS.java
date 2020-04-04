package arcade;

import java.util.Scanner;
import java.lang.Math; 

public class RPS {

	public static void main(String args[]){

		System.out.println("Welcome to the game of rock paper scissors");
		System.out.println("Please choose your object (Rock-r, Paper-s, Scissors-s)");
		Game();
		
	}

	public static void Game() {
		Scanner keyboard = new Scanner(System.in);
		//char start =  keyboard.nextChar;
		String object= keyboard.next();		//USER CHOICE

		int comp=(int)(Math.random() * ((3 - 1) + 1)) + 1;

		if(object.equals("r")) {
			int rock=1;
			if(rock==comp) {
				System.out.println("Computer entered Rock \nTie \nplease choose your object again (Rock-r, Paper-s, Scissors-s)"); 
				Game(); }
			else if(comp==2)
				System.out.println("Computer entered Paper \nYou loose");
			else if(comp==3)
				System.out.println("Computer entered scissors \nYou win");
		}
		if(object.equals("p")) {
			int paper=2;
			if(paper==comp) {
				System.out.println("Computer entered paper \nTie \nplease choose your object again (Rock-r, Paper-s, Scissors-s)");
				Game(); }
			else if(comp==1)
				System.out.println("Computer entered Rock \nYou Win");
			else if(comp==3)
				System.out.println("Computer entered scissors \nYou loose");
		}
		if(object.equals("s")) {
			int scissors=3;
			if(scissors==comp) {
				System.out.println("Computer entered scissors \nTie \nplease choose your object again (Rock-r, Paper-s, Scissors-s)");
				Game();}
			else if(comp==1)
				System.out.println("Computer entered Rock \nYou loose");
			else if(comp==2)
				System.out.println("Computer entered paper \nYou win");
		}
	}

}