import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args){
		String fileName = "testDeck.txt";
		Deck testDeck = new Deck();
		Deck testDeck2 = new Deck();
		testDeck.makeDeck(fileName);
		testDeck2.makeDeck(fileName);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the name of player 1...");
		String name = scan.next();
		Player player1 = new Player(name, testDeck);
		System.out.println("Please enter the name of player 2...");
		name = scan.next();
		Player player2 = new Player(name, testDeck2);
		player1.setUpOpponent(player2);
		player2.setUpOpponent(player1);
		Game game = new Game(player1, player2);
		
		game.start();
		
	}
}