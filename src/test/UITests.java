package test;
import arcade.UI;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class UITests {

    @Test
    public void illegalInputChecker() {
        int illegalInput = 4;
        UI test = new UI();
        boolean testIllegal = test.checkForValidInput(illegalInput);
        assertFalse(testIllegal);
    }

    @Test
    void legalInput1Checker() {
        int legalInput1 = 1;
        UI test = new UI();
        boolean testlegalInput1 = test.checkForValidInput(legalInput1);
        assertTrue(testlegalInput1);
    }

    @Test
    void legalInput2Checker() {
        int legalInput2 = 2;
        UI test = new UI();
        boolean testlegalInput2 = test.checkForValidInput(legalInput2);
        assertTrue(testlegalInput2);
    }
    
    @Test
    void legalInput3Checker() {
        int legalInput3 = 3;
        UI test = new UI();
        boolean testlegalInput3 = test.checkForValidInput(legalInput3);
        assertTrue(testlegalInput3);
    }    

    @Test
    void illegalRunFileChecker() {
        int illegalInput = 4;
        UI test = new UI();
        boolean testIllegal = test.runFile(illegalInput);
        assertFalse(testIllegal);
    }

    @Test
    void runHangmanChecker() {
        int runHangman = 1;
        UI test = new UI();
        boolean testRunHangman = test.runFile(runHangman);
        assertTrue(testRunHangman);
    }

    @Test
    void runRockPaperScissorsChecker() {
        int runRPS = 2;
        UI test = new UI();
        boolean testRunRPS = test.runFile(runRPS);
        assertTrue(testRunRPS);
    }
    
    @Test
    void runConnect4Checker() {
        int runConnect4 = 3;
        UI test = new UI();
        boolean testRunConnect4 = test.runFile(runConnect4);
        assertTrue(testRunConnect4);
    }
}