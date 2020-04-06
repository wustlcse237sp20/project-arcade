package test;
import arcade.UI;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class UITests {

    @Test
    public void illegalInputChecker() {
        int illegalInput = 3;
        UI test = new UI();
        boolean testIllegal = test.validInput(illegalInput);
        assertFalse(testIllegal);
    }

    @Test
    void legalInput1Checker() {
        int legalInput1 = 1;
        UI test = new UI();
        boolean testlegalInput1 = test.validInput(legalInput1);
        assertTrue(testlegalInput1);
    }

    @Test
    void legalInput2Checker() {
        int legalInput2 = 2;
        UI test = new UI();
        boolean testlegalInput2 = test.validInput(legalInput2);
        assertTrue(testlegalInput2);
    }

    @Test
    void illegalRunFileChecker() {
        int illegalInput = 3;
        UI test = new UI();
        boolean testIllegal = test.runfile(illegalInput);
        assertFalse(testIllegal);
    }

    @Test
    void runHangmanChecker() {
        int runHangman = 1;
        UI test = new UI();
        boolean testRunHangman = test.runfile(runHangman);
        assertTrue(testRunHangman);
    }

    @Test
    void runRockPaperScissorsChecker() {
        int runRPS = 2;
        UI test = new UI();
        boolean testRunRPS = test.runfile(runRPS);
        assertTrue(testRunRPS);
    }
}