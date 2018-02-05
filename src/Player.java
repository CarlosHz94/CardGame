import java.util.ArrayList;
import java.util.Scanner;
/**
 * Represents a player
 * 
 * @author Carlos Hernandez
 *
 */
public class Player {
	String name;
	int lifePoints;
	Deck myDeck;
	Hand hand;
	Board myBoard;
	Player opponent;
	
	/**
	 * Constructs a Player object with a deck
	 * @param deck The player's deck
	 */
	public Player(String n, Deck deck){
		name = n;
		lifePoints = 10;
		myDeck = deck;
		hand = new Hand();
		myBoard = new Board();
	}
	
	/**
	 * Sets up the opponents board
	 * @param opponent Board of the opponent
	 */
	public void setUpOpponent(Player op){
		opponent = op;	
	}
	
	/**
	 * Draws a card from the deck to the players hand
	 */
	public void drawCard(){
		if(!myDeck.isEmpty()){
			hand.drawCard(myDeck);
		}else{
			System.out.println("You do not have any cards left in your deck. Lose 1 life point");
			lifePoints--;
		}
	}
	
	/**
	 * Plays a selected card from the players hand on the board
	 * @param index
	 */
	public void playCard(int index){
		myBoard.placeCard(hand.playCard(index));
	}
	
	public void attack(int attackerIndex, int targetIndex){
		myBoard.getCard(attackerIndex).attack(opponent.getBoard().getCard(targetIndex));
		myBoard.check(attackerIndex);
		opponent.getBoard().check(targetIndex);
	}
	
	public void directAttack(int attackerIndex){
		
	}
	
	public void turn(){
		drawCard();
		opponent.getBoard().displayBoard();
		myBoard.displayBoard();
		hand.displayHand();
		System.out.println("Please choose a card to play, enter 'a' to attack this turn or 'q' to end your turn");
		String input;
		Scanner scan = new Scanner(System.in);
		input = scan.next();
		System.out.println("The input is '" + input+"'");
		if(input.equals("q")){
			return;
		}else if(input.equals("a")){
			System.out.println("Choose the attacker card, then the target card");
			int atk = scan.nextInt();
			int trgt = scan.nextInt();
			attack(atk,trgt);
		}else{
			playCard(Integer.parseInt(input));
		}
		opponent.getBoard().displayBoard();
		myBoard.displayBoard();
		input = scan.next();
		if(input == "q"){
			return;
		}
	}
	
	public Board getBoard(){
		return myBoard;
	}
	
	public int getLifePoints(){
		return lifePoints;
	}
	
	public void updateLifePoints(int attack){
		lifePoints -= attack;
	}
}
