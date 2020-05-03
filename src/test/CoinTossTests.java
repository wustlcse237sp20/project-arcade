package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import arcade.CoinToss;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class CoinTossTests {
    /**
     * if user enters heads, then instance variable for checking win condition should be set to heads.
     */
    @Test
    public void userSelectingHeadsShouldSetInstanceVariableToHeads() {
        CoinToss test = new CoinToss();
        String headInput = "h";
        InputStream headIn = new ByteArrayInputStream(headInput.getBytes());
        System.setIn(headIn);
        test.flipCoin();
        assertEquals("HEADS",test.playerVal);
    }
    /**
     * If user enters Tails, then instance variable for checking win condition should be set to tails.
     */
    @Test
    public void userSelectingTailsShouldSetInstanceVariableToTails() {
        CoinToss test = new CoinToss();
        String tailInput = "t";
        InputStream tailIn = new ByteArrayInputStream(tailInput.getBytes());
        System.setIn(tailIn);
        test.flipCoin();
        assertEquals("TAILS",test.playerVal);
    }

    /**
     * Ensure that flipping a coin produces either heads or tails and nothing else
     */
    @Test void flippingCoinShouldProduceEitherHeadsOrTails() {
        CoinToss test = new CoinToss();
        boolean coinFlipProducedEitherHeadsOrTails = false;
        String coinFlipResult = test.winningCoinPrint();
        if(coinFlipResult == "HEADS"){
            coinFlipProducedEitherHeadsOrTails = true;
        }else if(coinFlipResult == "TAILS"){
            coinFlipProducedEitherHeadsOrTails = true;
        }
        assertTrue(coinFlipProducedEitherHeadsOrTails);

    }


}