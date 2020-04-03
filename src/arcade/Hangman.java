package arcade;

public class Hangman {

    public static void main(String [] args){
        int numWrong = 0;
        for(int i = 0; i <= 6; i++){
            draw(i);
            System.out.println("_________");
        }
    }

    public static void draw(int numWrong){
        String printable = "";
        if(numWrong == 1){
            printable = "\t O\t\n";
        }else if(numWrong ==2){
            printable = "\t O\t\n\t |\n";
        }else if(numWrong ==3 ){
            printable = "\t O\t\n\t/|\n";
        }else if(numWrong ==4){
            printable = "\t O\t\n\t/|\\\n";
        }else if(numWrong ==5){
            printable = "\t O\t\n\t/|\\\n\t/\n";
        }else if(numWrong ==6){
            printable = "\t O\t\n\t/|\\\n\t/ \\\n YOU LOST\n";
        }
        System.out.print(printable);
    }

}
