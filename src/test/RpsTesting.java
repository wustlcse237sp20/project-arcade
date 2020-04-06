package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import arcade.RPS;

public class RpsTesting {
	
	@Test
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
	
	@Test
	public void choicePTest() {
		String result = RPS.choiceP("p");
		if(RPS.paper==RPS.comp) {
			assertEquals("Computer entered paper \nTie \nPlease choose your object again (Rock-r, Paper-s, Scissors-s)",result);
		}
		else if(RPS.comp==1) {
			assertEquals("Computer entered Rock \nYou Win",result);
		}
		else {
			assertEquals("Computer entered scissors \nYou loose",result);
		}
	}
	
	@Test
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

}
