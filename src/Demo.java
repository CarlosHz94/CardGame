import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo {
	public static void main(String[] args){
		String fileName = "testDeck.txt";
		String card = null;
		
		Deck myDeck = new Deck();
		myDeck.makeDeck(fileName);
		System.out.println(myDeck);
		myDeck.shuffleDeck();
		System.out.println("*****************************************");
		System.out.println(myDeck);
		
		Card testCard1 = new Card("test", 3,3,3);
		Card testCard2 = new Card("test2",1,2,3);
		System.out.println(testCard1 + "" + testCard2);
		testCard1.attack(testCard2);
		System.out.println(testCard1 + "" + testCard2);
		
	}
}
