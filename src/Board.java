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
	
	public void check(int index){
		if(cardSet.get(index).getHpValue() <= 0){
			cardSet.remove(index);
		}
	}
	
	/**
	 * Displays board
	 */
	public void displayBoard(){
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
			displaySpaces();
		}
		displayHyphens();
		name = true;
	}
	
	/**
	 * Displays Hyphens for the board
	 */
	public void displayHyphens(){
		for(int i = 0; i < 5; i++){
			System.out.print("+-----------------------");
		}
		System.out.println("+");
	}
	
	/**
	 * Displays spaces for the board
	 */
	public void displaySpaces(){
		for(int i = 0; i < 5; i++){
			if(i < cardSet.size() && !cardSet.isEmpty()){
				if(name){
					System.out.print("+" + cardSet.get(i).getCardName());
				}else if(atk){
					System.out.print("+Attack: " + cardSet.get(i).getAtkValue() + "		");
				}else if(hp){
					System.out.print("+HP" + cardSet.get(i).getHpValue() + "			");
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
