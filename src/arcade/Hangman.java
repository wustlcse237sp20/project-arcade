package arcade;
import java.util.Scanner;

public class Hangman {

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
    public static char queryUserGuess(){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter a letter.");
        char letterInput = scanner.nextLine().charAt(0);  // Read user input
        return letterInput;
    }

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

    public static boolean checkForWin(int numGuessedRight, char[] solution) {
        if (numGuessedRight == solution.length) {
            System.out.print("\tYOU WON!\n\n");
            return true;
        }
        return false;
    }

    public static void playHangman() {
        boolean isWon = false;
        int numWrongGuesses = 0;
        int numGuessedRight = 0;
        String word = generateWord();
        //TEST ONLY
        //System.out.println("Selected word: " + word);

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
    }



    public static void main(String[] args) {
        playHangman();
    }
}
