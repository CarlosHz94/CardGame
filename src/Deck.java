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
public class Deck extends SetOfCards{
	
	/**
	 * Constructs a Deck object
	 */
	public Deck(){
		super();
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
		Collections.shuffle(cardSet);
	}
	
	/**
	 * Draws a card from the top of the deck
	 * @return Card drawn
	 */
	public Card drawCard(){
		return cardSet.remove(0);
	}
	
	public boolean isEmpty(){
		return cardSet.isEmpty();
	}
}