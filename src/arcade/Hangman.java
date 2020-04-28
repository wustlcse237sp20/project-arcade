package arcade;
import java.util.Scanner;

public class Hangman {
	
	public static boolean uiWinStatus = false;
	
    /**
     * The function asks the user for the difficulty (easy, hard) 
     * @return boolean false if user entered easy, boolean true if user entered hard
     */

    public static boolean queryDifficulty(){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Would you like to play an easy or hard game? (Enter easy or hard to make selection)");
        String difficultySelection = scanner.nextLine();  // Read user input
        if (difficultySelection.equals("easy")) { //if user entered easy
            return false;
        } else {
            return true;
        }
    }
    
    /**
     * Generates words array for easy and hard words 
     * @return a work from a selection of easy or hard words based on selected difficulty 
     */
    public static String generateWord(){
        Boolean hardDifficulty = queryDifficulty();
        String[] easyWords = {"apple", "pear", "cherry", "noodle", "bread", "pasta", "chip", "salsa", "milk", "cookie"};
        String[] hardWords = {"avocado", "sandwich", "carrots", "cucumber", "strawberry", "artichoke", "watermelon", "croissant", "chicken", "ravioli"};
        if(hardDifficulty){
            int randomIndex = (int)(Math.random()*hardWords.length);
            return hardWords[randomIndex];
        }else{
            int randomIndex = (int)(Math.random()*easyWords.length);
            return easyWords[randomIndex];
        }
    }
    
    /**
     * User enters a letter
     * @return a char for the first char in user input
     */
    public static char queryUserGuess(){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter a letter.");
        char letterInput = scanner.nextLine().charAt(0);  // Picks the first char in user input
        return letterInput;
    }

    
    /**
     * Prints the current state of guesses, any unguessed letters are represented by an underscore 
     * @param takes in a char array which stores the correctly guessed letters 
     */
    public static void printProgress(char[] progress){
        for(int i = 0; i < progress.length;i++){
            if(progress[i]!='\u0000'){
                System.out.print(progress[i]+" ");
            }else{
                System.out.print("_ ");
            }
        }
        System.out.println();
        System.out.println();

    }
    
    
    /**
     * Draws the hangman based on the number of wrong guesses 
     * @param and int value for number of wrong guesses 
     */
    public static void drawNumWrongGuesses(int numWrong){
        String printable = "";
        if(numWrong == 0) {
            printable = "\n|====|\n|\n|\n|\n|\n|________\n\n";
        }else if(numWrong == 1){
            printable = "\n|====|\n|\t @\t\n|\n|\n|\n|_________\n\n";
        }else if(numWrong == 2){
            printable = "\n|====|\n|\t @\t\n|\t |\n|\n|\n|_________\n\n";
        }else if(numWrong == 3 ){
            printable = "\n|====|\n|\t @\t\n|\t/|\n|\n|\n|_________\n\n";
        }else if(numWrong == 4){
            printable = "\n|====|\n|\t @\t\n|\t/|\\\n|\n|\n|_________\n\n";
        }else if(numWrong == 5){
            printable = "\n|====|\n|\t @\t\n|\t/|\\\n|\t/ \n|\n|_________\n\n";
        }else if(numWrong == 6){
            printable = "\n|====|\n|\t @\t\n|\t/|\\\n|\t/ \\\n|\n|_________\n\n  YOU LOST\n\n";
        }
        System.out.print(printable);
    }

    
    /**
     * Checks for win
     * @param int of numbers guessed right 
     * @param char array of the target word
     * @return returns true if number guessed right integer equals the char array solution length 
     */
    public static boolean checkForWin(int numGuessedRight, char[] solution) {
        if (numGuessedRight == solution.length) {
            System.out.print("\tYOU WON!\n\n");
            return true;
        }
        return false;
    }


    
    /**
     * Main game functionality 
     */
    public static void playHangman() {
    	uiWinStatus = false;
        boolean isWon = false;
        int numWrongGuesses = 0;
        int numGuessedRight = 0;
        String word = generateWord();
  
        char[] solution = word.toCharArray();
        char[] progress = new char[solution.length];
        drawNumWrongGuesses(numWrongGuesses);
        System.out.print("Guess: ");
        for (int i = 0; i < solution.length; i++) {
            System.out.print("_ ");
        }
        System.out.println();
        while(numWrongGuesses < 6 && !isWon) {
            boolean goodGuess = false;
            char guess = queryUserGuess();
            // check to see if the user already guessed the letter.
            for(int i = 0; i < progress.length;i++){
                if(guess == progress[i]){
                    System.out.println("You already used this letter.");
                    continue;
                }
            }
            //check to see if the user guessed a correct letter
            for (int i = 0; i < solution.length; i++) {
                if (guess == solution[i]) {
                    goodGuess = true;
                    numGuessedRight++;
                    progress[i] = solution[i];
                }
            }
            //if the user's guess was not correct, increment the wrong guess counter
            if (!goodGuess) {
                numWrongGuesses++;
            }
            drawNumWrongGuesses(numWrongGuesses);
            printProgress(progress);
            //check if the user won
            isWon = checkForWin(numGuessedRight, solution);
        }
        uiWinStatus=isWon;
    }

    public static void main(String[] args) {
        playHangman();
    }
    
    public static boolean uiCheckWinStatus() {
		return uiWinStatus;
    }
}
