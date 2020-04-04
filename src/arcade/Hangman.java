package arcade;

public class Hangman {

    public static void main(String [] args){
        int numWrong = 0;
        for(int i = 0; i <= 6; i++){
            drawNumWrongGuesses(i);
            System.out.println(" ");
        }
    }

    public static void drawNumWrongGuesses(int numWrong){
        String printable = "";
        if(numWrong == 1){
            printable = "|====|\n|\t @\t\n|\n|\n|\n|_________";
        }else if(numWrong ==2){
            printable = "|====|\n|\t @\t\n|\t |\n|\n|\n|_________";
        }else if(numWrong ==3 ){
            printable = "|====|\n|\t @\t\n|\t/|\n|\n|\n|_________";
        }else if(numWrong ==4){
            printable = "|====|\n|\t @\t\n|\t/|\\\n|\n|\n|_________";
        }else if(numWrong ==5){
            printable = "|====|\n|\t @\t\n|\t/|\\\n|\t/ \n|\n|_________";
        }else if(numWrong ==6){
            printable = "|====|\n|\t @\t\n|\t/|\\\n|\t/ \\\n|\n|_________\n\n  YOU LOST\n";
        }
        System.out.print(printable);
    }
}
