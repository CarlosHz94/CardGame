import java.util.ArrayList;
/**
 * Represents the player's board
 * 
 * @author Carlos Hernandez
 *
 */
public class Board extends SetOfCards{
	
	/**
	 * Constructs a board 
	 */
	public Board(){
		super();
	}
	
	/**
	 * Checks if the board is full
	 * @return True if the board is full, false otherwise
	 */
	public boolean isFull(){
		if(size() <= 5){
			return false;
		}
		return true;
	}
	
	/**
	 * Places a card on the board
	 * @param card Card to be placed on the board
	 */
	public void placeCard(Card card){
		if(!isFull()){
			addCard(card);
		}else{
			System.out.println("THE BOARD IS FULL, YOU CAN'T DO THAT");
		}
	}
	
	/**
	 * Displays board
	 */
	public void displayBoard(){
		/*for(int j = 0; j < 2; j++){
			displayHyphens();
			for(int i = 0; i < 10; i++){
				displaySpaces();
			}
		}
		displayHyphens();*/
	}
	
	/**
	 * Displays Hyphens for the board
	 */
	public void displayHyphens(){
		for(int i = 0; i < 5; i++){
			System.out.print("+----------------");
		}
		System.out.println("+");
	}
	
	/**
	 * Displays spaces for the board
	 */
	public void displaySpaces(){
		for(int i = 0; i < 5; i++){
			System.out.print("+                ");
		}
		System.out.println("+");
	}
}
