package test;
import arcade.Hangman;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;


public class HangmanTests {
    @Test
    public void selectingEasyGameShouldReturnFalse(){
        Hangman tester = new Hangman();
        String input = "easy";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        boolean easyGame = false;
        boolean returnDifficulty = tester.queryDifficulty();
        assertTrue((returnDifficulty == easyGame), "entering EASY game difficulty should return false");
    }
    @Test
    public void queryingUserInputShouldReturnCharacter(){

        Hangman tester = new Hangman();

        // legal and illegal characters
        String badInput = "3";
        String goodInput = "a";
        char[] legalChars = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        //test to see if a legal character gives us the right input (GOODINPUT)
        InputStream goodIn = new ByteArrayInputStream(goodInput.getBytes());
        System.setIn(goodIn);
        char goodUserGuess = tester.queryUserGuess();
        boolean legalChar = false;
        for(int i = 0; i < legalChars.length; i++){
            if(goodUserGuess == legalChars[i]){
                legalChar = true;
            }
        }
        assertTrue(legalChar);

        //we can't handle an illegal character (BADINPUT)
        InputStream badIn = new ByteArrayInputStream(badInput.getBytes());
        System.setIn(badIn);
        char badUserGuess = tester.queryUserGuess();
        boolean illegalCharacter = true;
        for(int i = 0; i < legalChars.length; i++){
            if(badUserGuess == legalChars[i]){
                illegalCharacter = false;
            }
        }
        assertTrue(illegalCharacter);
    }
    @Test
    public void allCorrectGuessesShouldSatisfyWinCondition(){
        Hangman tester = new Hangman();
        int threeChars = 3;
        int fourChars = 4;
        int fiveChars = 5;
        char [] threeLetterWord = {'c','a','r'};
        char [] fiveLetterWord = {'a','p','p','l','e'};
        assertTrue(tester.checkForWin(threeChars,threeLetterWord), "guessing 3/3 letters correctly should yield a win.");
        assertTrue(tester.checkForWin(fiveChars,fiveLetterWord), "guessing 5/5 letters correctly should yield a win.");
        assertFalse(tester.checkForWin(threeChars,fiveLetterWord),"guessing 3/5 letters correctly should not yield a win");
        assertFalse(tester.checkForWin(fourChars,fiveLetterWord),"guessing 4/5 letters correctly should not yield a win");
    }
    @Test
    public void easyDifficultyShouldReturnFalse(){
        Hangman tester = new Hangman();
        String easyInput = "easy";
        InputStream userIn = new ByteArrayInputStream(easyInput.getBytes());
        System.setIn(userIn);
        boolean difficulty = tester.queryDifficulty();
        assertFalse(difficulty);
    }
    @Test
    public void hardDifficultyShouldReturnTrue(){
        Hangman tester = new Hangman();
        String hardInput = "hard";
        InputStream userIn = new ByteArrayInputStream(hardInput.getBytes());
        System.setIn(userIn);
        boolean difficulty = tester.queryDifficulty();
        assertTrue(difficulty);
    }
}
