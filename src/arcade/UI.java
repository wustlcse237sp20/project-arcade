package arcade;
import arcade.Hangman;
import arcade.RPS;
import java.util.Scanner;
public class UI {
    public static void main(String[] args) {
        System.out.println("Welcome to the Java Arcade!" + "\n" +
                "Select 1 or 2, and then press enter to play!" + "\n" +
                "Press 1 for Hangman" + "\n" + "Press 2 for Rock, Paper, Scissors");

        Scanner scanner = new Scanner(System.in);

        boolean badInput = true;
        while(badInput) {
            if(scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if(validInput(input)) {
                    badInput = false;
                    if(input == 1) {
                        System.out.println("Entering Hangman...");
                        runfile(input);
                    }
                    else if(input == 2) {
                        System.out.println("Entering Rock, Paper, Scissors...");
                        runfile(input);
                    }
                }
                else {
                    System.out.println("Invalid input. Please select 1 or 2");
                    scanner.nextLine();
                }
            }
            else {
                System.out.println("Invalid input. Please select 1 or 2");
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    /**
     * returns true once the input is 1 or 2
     * @param input
     * @return
     */
    public static boolean validInput(int input) {
        if(input == 1 || input == 2) {
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean runfile(int input) {
        if (input == 1) {
            Hangman.playHangman();
            return true;
        }
        else if (input == 2 ) {
            RPS.main();
            return true;
        }
        return false;
    }
}