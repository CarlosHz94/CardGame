import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Represents a Deck that has multiple cards
 * 
 * @author Carlos Hernandez
 *
 */
public class Deck {
	/**
	 * List of cards
	 */
	private ArrayList<Card> deck;
	
	/**
	 * Constructs a Deck object
	 */
	public Deck(){
		deck = new ArrayList<Card>();
	}
	
	/**
	 * Adds a card to the deck
	 * @param card Card to be added to the deck
	 */
	public void addCard(Card card){
		deck.add(card);
	}
		
	/**
	 * Populates the deck given a deck file
	 * @param fileName deck file
	 */
	public void makeDeck(String fileName){
		String cardInfo;
		try{
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while((cardInfo = bufferedReader.readLine()) != null){
				Card card= Parser.cardParser(cardInfo);
				addCard(card);
			}
			bufferedReader.close();
		}catch(FileNotFoundException e){
			System.out.println("Unable to open file '"+fileName+"'");
		}catch(IOException e){
			System.out.println("Error reading file '"+"'");
		}
	}
	
	/**
	 * Shuffles the deck
	 */
	public void shuffleDeck(){
		Collections.shuffle(deck);
	}
	
	/**
	 * Draws a card from the top of the deck
	 * @return Card drawn
	 */
	public Card drawCard(){
		return deck.remove(0);
	}
		
	/**
	 * Prints the deck
	 */
	public String toString(){
		String deck = "";
		for(int i = 0; i < this.deck.size(); i++){
			deck += this.deck.get(i);
		}
		return deck;
	}
}
	

		
		
		
		
		
		
		
	
	
