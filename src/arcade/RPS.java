package arcade;

import java.util.Scanner;
import java.lang.Math;

public class RPS {

    public static Scanner keyboard = new Scanner(System.in);
    public static int comp= 0;
    public static String valueRetun = " "; //updated depending on user choice 
    public static int computerObj = 0;
    public static int rock = 1;
    public static int paper = 2;
    public static int scissors = 3;

    public static void main(){
        System.out.println("Welcome to the game of rock paper scissors"); //initial print messages 
        System.out.println("Please choose your object (Rock-r, Paper-s, Scissors-s)");
        check(); 
    }

    
    /**
     * Checks the user input as a string value for corectness  
     */
    public static void check(){
        comp = (int)(Math.random() * ((3 - 1) + 1)) + 1; //generates a random value from the range 1-3 as an int
        String object= keyboard.next(); //captures the user's string input 
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

    
    /**
     * Game options if the user inputs rock 
     * @param enteres a string with the string value of the user input
     * returns a string of a win/loose/tie message 
     */
    public static String choiceR(String object) {
        if(object.equals("r")) {
            if(rock==comp) {
                valueRetun = "Computer entered Rock \nTie \nPlease choose your object again (Rock-r, Paper-s, Scissors-s)";
                System.out.println(valueRetun);
                check();
            }
            else if(comp==2) {
                valueRetun = "Computer entered Paper \nYou lose";
                System.out.println(valueRetun);
            }
            else{
                valueRetun = "Computer entered scissors \nYou win";
                System.out.println(valueRetun);
            }
        }
        return valueRetun; //print message 
    }

    /**
     * Game options if the user inputs paper 
     * @param enteres a string with the string value of the user input
     * returns a string of a win/loose/tie message 
     */
    
    public static String choiceP(String object) {
        if(object.equals("p")) {
            if(paper==comp) {
                valueRetun = "Computer entered paper \nTie \nPlease choose your object again (Rock-r, Paper-s, Scissors-s)";
                System.out.println(valueRetun);
                check();
            }
            else if(comp==1) {
                valueRetun="Computer entered Rock \nYou Win";
                System.out.println(valueRetun);
            }
            else{
                valueRetun="Computer entered scissors \nYou lose";
                System.out.println(valueRetun);
            }
        }

        return valueRetun; //print message 
    }
    
    /**
     * Game options if the user inputs scissors 
     * @param enteres a string with the string value of the user input
     * returns a string of a win/loose/tie message 
     */

    public static String choiceS(String object) {
        if(object.equals("s")) {
            if(scissors==comp) {
                valueRetun="Computer entered scissors \nTie \nPlease choose your object again (Rock-r, Paper-s, Scissors-s)";
                System.out.println(valueRetun);
                check();
            }
            else if(comp==1) {
                valueRetun="Computer entered Rock \nYou lose";
                System.out.println(valueRetun);
            }
            else {
                valueRetun="Computer entered paper \nYou win";
                System.out.println(valueRetun);
            }
        }
        return valueRetun; //print message 
    }



}