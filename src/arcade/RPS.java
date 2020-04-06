package arcade;

import java.util.Scanner;
import java.lang.Math;

public class RPS {

    public static Scanner keyboard = new Scanner(System.in);
    public static int comp= 0;
    public static String valueRetun = " ";
    public static int computerObj = 0;
    public static int rock = 1;
    public static int paper = 2;
    public static int scissors = 3;

    public static void main(){
        System.out.println("Welcome to the game of rock paper scissors");
        System.out.println("Please choose your object (Rock-r, Paper-s, Scissors-s)");
        check();
    }

    public static void check(){
        comp = (int)(Math.random() * ((3 - 1) + 1)) + 1;
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
        return valueRetun;
    }

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

        return valueRetun;
    }

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
        return valueRetun;
    }



}