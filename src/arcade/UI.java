package arcade;
import arcade.Hangman;
import arcade.RPS;
import arcade.CoinToss;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UI {

    public static Scanner scanner = new Scanner(System.in);
    public static Map<Integer, String> games = new HashMap<Integer, String>();
    public static int currentGame = 0;
    public static int gamesPlayed = 0;
    public static int gamesWon = 0;

    //still to do: exit game functionality

    public static void main(String[] args) {
        populateMap();
        System.out.println("Welcome to the Java Arcade!");
        runArcade();
        scanner.close();
    }

    public static void populateMap() {
        games.put(1, "Hangman");
        games.put(2, "Rock, Paper, Scissors");
        games.put(3, "Coin Toss");
    }

    /**
     * prompts the user for which game they want to play
     */
    private static void runArcade() {
        drawArcadeVisual();
        System.out.println("Select 1, 2, or 3, and press enter to play!" + "\n");
        boolean badInput = true;
        while(badInput) {
            if(scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if(checkForValidInput(input)) {
                    badInput=false;
                    updateCurrentGame(input);
                    runFile(input);
                }
                else { //if not 1, 2 or 3
                    System.out.println("Invalid input. Please select 1, 2, or 3");
                    scanner.nextLine();
                }
            }
            else { //if not an int
                System.out.println("Invalid input. Please select 1, 2, or 3");
                scanner.nextLine();
            }
        }
    }

    /**
     * returns true once the input is 1, 2, or 3
     * @param input
     * @return
     */
    public static boolean checkForValidInput(int input) {
        if(input == 1 || input == 2 || input == 3) {
            return true;
        }
        return false;
    }

    /**
     * changes the value of currentGame to reflect most recently selected game
     * @param input
     */
    public static void updateCurrentGame(int input) {
        currentGame = input;
    }

    /**
     * runs the selected game, should always return true
     * @param input
     * @return
     */
    public static boolean runFile(int input) {
        boolean currentGameWasWon = false;
        if (input == 1) {
            System.out.println("Entering Hangman...");
            Hangman.playHangman();
            if(Hangman.uiCheckWinStatus()) {currentGameWasWon = true;}
            updateGameStats(currentGameWasWon);
            playAgain();
            return true;
        }
        else if (input == 2) {
            System.out.println("Entering Rock, Paper, Scissors...");
            RPS.main();
            if(RPS.uiCheckWinStatus()) {currentGameWasWon = true;}
            updateGameStats(currentGameWasWon);
            playAgain();
            return true;
        }
        else if(input == 3) {
            System.out.println("Entering Coin Toss...");

                if(CoinToss.coinToss()) {currentGameWasWon = true;}
            updateGameStats(currentGameWasWon);
            playAgain();
            return true;
        }
        return false;
    }

    //after the game plays, it prints out the stats
    public static void updateGameStats(boolean currentGameWasWon) {
        gamesPlayed = gamesPlayed+1;
        if(currentGameWasWon) {
            gamesWon = gamesWon + 1;
        }
        System.out.println("\nGames won: " + gamesWon);
        System.out.println("Games played: " + gamesPlayed);
        double winRate = Math.round(gamesWon/(double)gamesPlayed*100);
        System.out.println("Win rate: " + winRate + "%\n");
    }


    /**
     * allows the user to continue playing
     */
    public static void playAgain() {
        System.out.println("Press 1 to play " + games.get(currentGame) + " again\nPress 2 to exit to main menu\nPress 3 to exit the arcade");
        boolean badInput = true;
        while(badInput) {
            if(scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if(input == 1) {
                    badInput=false;
                    runFile(currentGame);
                    return;
                }
                if(input == 2) {
                    badInput=false;
                    System.out.println("Exiting to main menu...\n");
                    runArcade();
                    return;
                }
                if(input ==3) {
                    badInput=false;
                    System.out.println("Exiting the arcade... Thanks for playing!");
                    System.exit(0);
                    return;
                }
                else { //if not 1 or 2 or 3
                    System.out.println("Invalid input. Please select 1 or 2");
                    scanner.nextLine();
                }
            }
            else { //if not an int
                System.out.println("Invalid input. Please select 1 or 2");
                scanner.nextLine();
            }
        }
    }

    public static void drawArcadeVisual(){
        System.out.println("===================================================================================");
        System.out.println("");
        System.out.println("      __         _______        ______         __        ________      _________  ");
        System.out.println("     /  \\       |_   __ \\     .' ___  |       /  \\      |_   ___ `.   |_   ___  | ");
        System.out.println("    / /\\ \\       | |__) |    / .'   \\_|      / /\\ \\       | |   `. \\    | |_  \\_| ");
        System.out.println("   / ____ \\      |  __ /     | |            / ____ \\      | |    | |    |  _|  _  ");
        System.out.println(" _/ /    \\ \\_   _| |  \\ \\_   \\ `.___.'\\   _/ /    \\ \\_   _| |___.' /   _| |___/ |");
        System.out.println("|____|  |____| |____| |___|   `._____.'  |____|  |____| |________.'   |_________|  ");
        System.out.println("                                                                                    ");
        System.out.println("");
        System.out.println("");
        System.out.println("                                   ,~~~,                                                                 ");
        System.out.println("                                   `~~~`                                                  ");
        System.out.println("     |----+                                               /``  /``\\  |  |\\ |   ");
        System.out.println("     |    |                        +---+                  \\..  \\__/  |  | \\|        ");
        System.out.println("     |  {X_X}                      |   |                                    ");
        System.out.println("     |   /|\\                       +---+                 __.__             ");
        System.out.println("     |   / \\                                               |   /``\\  <`` <``        ");
        System.out.println("     |                              Q O                    |   \\../  _`> _`>  ");
        System.out.println("     |_______                        X                                    ");
        System.out.println("                                    / \\                                                    ");
        System.out.println("") ;
        System.out.println("        __                         _____                      ______              ");
        System.out.println("       /  |                       / ___ `.                   / ____ `.        ");
        System.out.println("       `| |                      |_/___) |                   `'  __) |            ");
        System.out.println("        | |                       .'____.'                   _  |__ '.         ");
        System.out.println("        | |                      / /_____                   | \\____) |          ");
        System.out.println("      |_____|                    |_______|                   \\______.'             ");
        System.out.println("            ");
        System.out.println("=================================================================================");
    }
}