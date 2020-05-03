package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import arcade.CoinToss;

public class CoinTossTest {
	
	@Test
	public void winningCoinPrintTest() {
		String winResult = " ";
		if(CoinToss.randomVal == CoinToss.heads) {
			assertEquals("HEADS",winResult);
		}
		if(CoinToss.randomVal == CoinToss.tails) {
			assertEquals("TAILS",winResult);
		}
	}

	@Test void winnerCheckTest() {
		if(CoinToss.randomVal == CoinToss.playerVal){
			assertFalse(CoinToss.winnerCheck());
		}
		else {
			assertTrue(CoinToss.winnerCheck());
		}
	}
	@Test
	public void uiCheckWinStatusTest() {
		if(CoinToss.winnerCheck() == true) {
			assertTrue(CoinToss.uiCheckWinStatus());
		}
		else {
			assertFalse(CoinToss.uiCheckWinStatus());
		}
	}

}