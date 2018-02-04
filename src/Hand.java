/**
 * Represents the set of cards in the players hand
 * 
 * @author Carlos Hernandez
 *
 */
public class Hand extends SetOfCards{
	
	/**
	 * Constructs a Hand object
	 */
	public Hand(){
		super();
	}
	
	/**
	 * Draws a card from the specified deck
	 * @param deck Deck where the card will be drawn from
	 */
	public void drawCard(Deck deck){
		if(cardSet.size()<3){
			addCard(deck.drawCard());
		}else{
			System.out.println("CARD WASTED: \n" + deck.drawCard());
		}
	}
	
	/**
	 * Gets the card that will be played
	 * @param index Index of the card in the hand
	 * @return The selected card
	 */
	public Card playCard(int index){
		return cardSet.remove(index);
	}
}
