package test;

import arcade.Hangman;
import arcade.RPS;
import arcade.UI;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArcadeTestsComprehensive {
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
    @org.junit.jupiter.api.Test
    public void choiceRTest() {
        String result = RPS.choiceR("r");
        if(RPS.rock==RPS.comp) {
            assertEquals("Computer entered Rock \nTie \nPlease choose your object again (Rock-r, Paper-s, Scissors-s)",result);
        }
        else if(RPS.comp==2) {
            assertEquals("Computer entered Paper \nYou loose",result);
        }
        else {
            assertEquals("Computer entered scissors \nYou win",result);
        }
    }

    @org.junit.jupiter.api.Test
    public void choicePTest() {
        String result = RPS.choiceP("p");
        if(RPS.paper==RPS.comp) {
            assertEquals("Computer entered paper \nTie \nPlease choose your object again (Rock-r, Paper-s, Scissors-s)",result);
        }
        else if(RPS.comp==1) {
            assertEquals("Computer entered Rock \nYou Win",result);
        }
        else {
            assertEquals("Computer entered scissors \nYou lose",result);
        }
    }

    @org.junit.jupiter.api.Test
    public void choicSTest() {
        String result = RPS.choiceS("s");
        if(RPS.scissors==RPS.comp) {
            assertEquals("Computer entered scissors \nTie \nPlease choose your object again (Rock-r, Paper-s, Scissors-s)",result);
        }
        else if(RPS.comp==1) {
            assertEquals("Computer entered Rock \nYou loose",result);
        }
        else {
            assertEquals("Computer entered paper \nYou win",result);
        }
    }
    @org.junit.jupiter.api.Test
    public void illegalInputShouldReturnFalse() {
        int illegalInput = 4;
        UI test = new UI();
        boolean testIllegal = test.checkForValidInput(illegalInput);
        assertFalse(testIllegal);
    }

    @org.junit.jupiter.api.Test
    void legalInput1ShouldReturnTrue() {
        int legalInput1 = 1;
        UI test = new UI();
        boolean testlegalInput1 = test.checkForValidInput(legalInput1);
        assertTrue(testlegalInput1);
    }

    @org.junit.jupiter.api.Test
    void legalInput2ShouldReturnTrue() {
        int legalInput2 = 2;
        UI test = new UI();
        boolean testlegalInput2 = test.checkForValidInput(legalInput2);
        assertTrue(testlegalInput2);
    }

    @org.junit.jupiter.api.Test
    void legalInput3ShouldReturnTrue() {
        int legalInput3 = 3;
        UI test = new UI();
        boolean testlegalInput3 = test.checkForValidInput(legalInput3);
        assertTrue(testlegalInput3);
    }

    @org.junit.jupiter.api.Test
    void illegalRunFileShouldReturnFalse() {
        int illegalInput = 4;
        UI test = new UI();
        boolean testIllegal = test.runFile(illegalInput);
        assertFalse(testIllegal);
    }
    @org.junit.jupiter.api.Test
    void populateMapShouldPopulateThreeGames(){
        UI test = new UI();
        test.populateMap();
        int mapSize = test.games.size();
        assertEquals(3,mapSize);
        assertNotEquals(4,mapSize);

    }

}
