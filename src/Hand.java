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
		if(cardSet.size()<4){
			addCard(deck.drawCard());
		}else{
			System.out.println("CARD WASTED: \n\n" + deck.drawCard());
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
	
	/**
	 * Displays board
	 */
	public void displayHand(){
		if(!cardSet.isEmpty()){
			displayHyphens();
			for(int i = 0; i < 10; i++){
				if(i == 1){
					name = false;
					atk = true;
				}
				if(i == 2){
					atk = false;
					hp = true;
				}else{
					hp=false;
				}
				if(i == 9){
					mana = true;
				}
				displaySpaces();
			}
			displayHyphens();
			name = true;
			mana = false;
		}else{
			System.out.println("You do not have any cards in your hard");
		}
	}
	
	/**
	 * Displays Hyphens for the hand
	 */
	public void displayHyphens(){
		for(int i = 0; i < cardSet.size(); i++){
			System.out.print("+-----------------------");
		}
		System.out.println("+");
	}
	
	/**
	 * Displays spaces for the hand
	 */
	public void displaySpaces(){
		for(int i = 0; i < cardSet.size(); i++){
			if(i < cardSet.size() && !cardSet.isEmpty()){
				if(name){
					System.out.print("+" + cardSet.get(i).getCardName());
				}else if(atk){
					System.out.print("+Attack: " + cardSet.get(i).getAtkValue() + "		");
				}else if(hp){
					System.out.print("+HP" + cardSet.get(i).getHpValue() + "			");
				}else if(mana){
					System.out.print("+		     (" + cardSet.get(i).getManaCost() + ")");
				}else{
					System.out.print("+			");
				}
			}
			else{
				System.out.print("+			");
			}
		}
		System.out.println("+");
	}
}