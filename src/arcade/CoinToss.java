package arcade;
import java.util.Scanner;


public class CoinToss {

    public static String playerVal;
    public static int randomVal;
    public static boolean hasWon = false;
    public static int heads = 1;
    public static int tails = 2;


    /**
     * Prints welcome messages
     * runs instance of coin toss
     */
    public static boolean coinToss(){
        System.out.println("Welcome to the game of Coin Toss");
        System.out.println("Please enter either heads (h) or tails (t)!");
        flipCoin();
        if(hasWon){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Checks for correct input (h, t) and loops until correct input is provided
     */
    public static void flipCoin(){
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();
        if (userChoice.equals("h")) { //if user entered easy
            System.out.println("You choose Heads, Computer is Tails");
            playerVal = "HEADS";
            if(playerVal == winningCoinPrint()){
                hasWon = true;
            }else{
                hasWon = false;
            }
        } else if (userChoice.equals("t")) {
            System.out.println("You choose Tails, Computer is Heads");
            playerVal = "TAILS";
            if(playerVal == winningCoinPrint()) {
                hasWon = true;
            }else{
                hasWon = false;
            }
        } else {
            System.out.println("Oops! Please enter either heads (h) or tails (t)!");
            flipCoin();
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


}
