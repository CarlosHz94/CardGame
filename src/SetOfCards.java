import java.util.ArrayList;

/**
 * Represents a general set of cards
 * 
 * @author Carlos Hernandez
 *
 */
public class SetOfCards {
	/**
	 * The card set
	 */
	protected ArrayList<Card> cardSet;
	
	/**
	 * Constructs a SetOfCards object
	 */
	public SetOfCards(){
		cardSet = new ArrayList<Card>();
	}
	
	/**
	 * Adds a card to the set
	 * @param card Card to be added
	 */
	public void addCard(Card card){
		cardSet.add(card);
	}
	
	/**
	 * Gets the size of the set
	 * @return size of the set
	 */
	public int size(){
		return cardSet.size();
	}
	
	/**
	 * Prints the set of cards
	 */
	public String toString(){
		String cards = "";
		for(int i = 0; i < cardSet.size(); i++){
			cards += cardSet.get(i);
		}
		return cards;
	}
}
