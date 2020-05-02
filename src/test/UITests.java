package test;
import arcade.UI;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class UITests {

    @Test
    public void illegalInputShouldReturnFalse() {
        int illegalInput = 4;
        UI test = new UI();
        boolean testIllegal = test.checkForValidInput(illegalInput);
        assertFalse(testIllegal);
    }

    @Test
    void legalInput1ShouldReturnTrue() {
        int legalInput1 = 1;
        UI test = new UI();
        boolean testlegalInput1 = test.checkForValidInput(legalInput1);
        assertTrue(testlegalInput1);
    }

    @Test
    void legalInput2ShouldReturnTrue() {
        int legalInput2 = 2;
        UI test = new UI();
        boolean testlegalInput2 = test.checkForValidInput(legalInput2);
        assertTrue(testlegalInput2);
    }
    
    @Test
    void legalInput3ShouldReturnTrue() {
        int legalInput3 = 3;
        UI test = new UI();
        boolean testlegalInput3 = test.checkForValidInput(legalInput3);
        assertTrue(testlegalInput3);
    }    

    @Test
    void illegalRunFileShouldReturnFalse() {
        int illegalInput = 4;
        UI test = new UI();
        boolean testIllegal = test.runFile(illegalInput);
        assertFalse(testIllegal);
    }
    @Test
    void populateMapShouldPopulateThreeGames(){
        UI test = new UI();
        test.populateMap();
        int mapSize = test.games.size();
        assertEquals(3,mapSize);
        assertNotEquals(4,mapSize);

    }




    /**
     * Testing loss of game multiple times increment gamesPlayed but not gamesWon
     *
     */

    @Test
    void losingAndWinningGameShouldIncrementGamesPlayedAndGamesWonAppropriately(){
        UI test = new UI();
        assertEquals(0,test.gamesPlayed);
        assertEquals(0,test.gamesWon);
        test.updateGameStats(false);
        assertEquals(1,test.gamesPlayed);
        assertEquals(0,test.gamesWon);
        test.updateGameStats(false);
        assertEquals(2,test.gamesPlayed);
        assertEquals(0,test.gamesWon);
        test.updateGameStats(true);
        assertEquals(3,test.gamesPlayed);
        assertEquals(1,test.gamesWon);
    }

    /**
     * Testing population of game map and proper handing of input selection renders the following tests obsolete. Successful run of
     * respective games is tested within the specific game test classes.
     */

//    @Test
//    void runHangmanChecker() {
//        int runHangman = 1;
//        UI test = new UI();
//        boolean testRunHangman = test.runFile(runHangman);
//        assertTrue(testRunHangman);
//    }
//
//    @Test
//    void runRockPaperScissorsChecker() {
//        int runRPS = 2;
//        UI test = new UI();
//        boolean testRunRPS = test.runFile(runRPS);
//    }
//
//    @Test
//    void runConnect4Checker() {
//        int runConnect4 = 3;
//        UI test = new UI();
//        boolean testRunConnect4 = test.runFile(runConnect4);
//        assertTrue(testRunConnect4);
//    }

}