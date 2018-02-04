import java.util.ArrayList;
/**
 * Represents a player
 * 
 * @author Carlos Hernandez
 *
 */
public class Player {
	Deck myDeck;
	Hand hand;
	Board myBoard;
	Board opponentBoard;
	
	/**
	 * Constructs a Player object with a deck
	 * @param deck The player's deck
	 */
	public Player(Deck deck){
		myDeck = deck;
		hand = new Hand();
		myBoard = new Board();
	}
	
	/**
	 * Sets up the opponents board
	 * @param opponent Board of the opponent
	 */
	public void setUpOpponentBoard(Board opponent){
		opponentBoard = opponent;	
	}
	
	/**
	 * Draws a card from the deck to the players hand
	 */
	public void drawCard(){
		hand.drawCard(myDeck);
	}
	
	/**
	 * Plays a selected card from the players hand on the board
	 * @param index
	 */
	public void playCard(int index){
		myBoard.placeCard(hand.playCard(index));
	}
}
