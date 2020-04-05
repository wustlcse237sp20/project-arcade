package arcade;

import java.util.Scanner;
import java.lang.Math; 

public class RPS {
	
	static Scanner keyboard = new Scanner(System.in);
	static int comp=(int)(Math.random() * ((3 - 1) + 1)) + 1;
	static String valueRetun = "";
	static int computerObj = 0;

	public static void main(String args[]){
		System.out.println("Welcome to the game of rock paper scissors");
		System.out.println("Please choose your object (Rock-r, Paper-s, Scissors-s)");
		check();
	}
	
	public static void check(){
		String object= keyboard.next();	
		if(object.equals("r")) {
			choiceR(object);
		}
		else if(object.equals("p")) {
			choiceP(object);
		}
		else if(object.equals("s")) {
			choiceS(object);
		}
		else {
			System.out.println("Please choose your object (Rock-r, Paper-s, Scissors-s)");
			check();
		}
	}

	public static String choiceR(String object) {
		if(object.equals("r")) {
			int rock=1;
			if(rock==comp) {
				valueRetun = "Computer entered Rock \nTie \nplease choose your object again (Rock-r, Paper-s, Scissors-s)"; 
			}
			else if(comp==2) {
				valueRetun = "Computer entered Paper \nYou loose";
				}
			else if(comp==3) {
				valueRetun = "Computer entered scissors \nYou win";
				}
		}
		System.out.println(valueRetun);
		return valueRetun;
	}
	
	public static String choiceP(String object) {
	if(object.equals("p")) {
		int paper=2;
		if(paper==comp) {
			valueRetun = "Computer entered paper \nTie \nplease choose your object again (Rock-r, Paper-s, Scissors-s)";
			 }
		else if(comp==1)
			valueRetun="Computer entered Rock \nYou Win";
		else if(comp==3)
			valueRetun="Computer entered scissors \nYou loose";
	}
	System.out.println(valueRetun);
	return valueRetun;
	}
	
	public static String choiceS(String object) {
	if(object.equals("s")) {
		int scissors=3;
		if(scissors==comp) {
			valueRetun="Computer entered scissors \nTie \nplease choose your object again (Rock-r, Paper-s, Scissors-s)";
			}
		else if(comp==1)
			valueRetun="Computer entered Rock \nYou loose";
		else if(comp==2)
			valueRetun="Computer entered paper \nYou win";
	}
	System.out.println(valueRetun);
	return valueRetun;
	}

}