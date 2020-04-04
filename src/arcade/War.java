package arcade;
import java.util.Scanner;

public class War {
	public static void main(String args[]){
		System.out.println("Welcome to the game of War");
		System.out.println("Type 1 to begin or 0 to exit");
		Scanner keyboard = new Scanner(System.in);
		int enterorExit = keyboard.nextInt();

		if(enterorExit == 1) {
			System.out.println("Ok! Let's begin");
		}

		int cardDeck[] = new int[52]; //create the deck
		
		cardDeck[0] = 2; //0-12 = hearts
		cardDeck[1] = 3;
		cardDeck[2] = 4;
		cardDeck[3] = 5;
		cardDeck[4] = 6;
		cardDeck[5] = 7;
		cardDeck[6] = 8;
		cardDeck[7] = 9;
		cardDeck[8] = 10;
		cardDeck[9] = 11; //jack of hearts
		cardDeck[10] = 12; //queen of hearts 
		cardDeck[11] = 13; //king of hearts
		cardDeck[12] = 14; //ace of hearts
		cardDeck[13] = 2; //13-25 = spades
		cardDeck[14] = 3;
		cardDeck[15] = 4;
		cardDeck[16] = 5;
		cardDeck[17] = 6;
		cardDeck[18] = 7;
		cardDeck[19] = 8;
		cardDeck[20] = 9;
		cardDeck[21] = 10;
		cardDeck[22] = 11; //jack of spades
		cardDeck[23] = 12; //queen of spades 
		cardDeck[24] = 13; //king of spades
		cardDeck[25] = 14; //ace of spades
		cardDeck[26] = 2; //0-12 = diamonds
		cardDeck[27] = 3;
		cardDeck[28] = 4;
		cardDeck[29] = 5;
		cardDeck[30] = 6;
		cardDeck[31] = 7;
		cardDeck[32] = 8;
		cardDeck[33] = 9;
		cardDeck[34] = 10;
		cardDeck[35] = 11; //jack of diamonds
		cardDeck[36] = 12; //queen of diamonds 
		cardDeck[37] = 13; //king of diamonds
		cardDeck[38] = 14; //ace of diamonds
		cardDeck[39] = 2; //39-51 = clubs
		cardDeck[40] = 3;
		cardDeck[41] = 4;
		cardDeck[42] = 5;
		cardDeck[43] = 6;
		cardDeck[44] = 7;
		cardDeck[45] = 8;
		cardDeck[46] = 9;
		cardDeck[47] = 10;
		cardDeck[48] = 11; //jack of clubs
		cardDeck[49] = 12; //queen of clubs 
		cardDeck[50] = 13; //king of clubs
		cardDeck[51] = 14; //ace of clubs
		
		shuffleArray(cardDeck);
		
	}
	
	public static int[]shuffleArray(int[]originalCardDeck) {
		System.out.print("Cards are being shuffled...");
		int shuffledDeck[] = new int[52];
		
		return shuffledDeck;
		
	}


}


