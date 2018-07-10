import java.util.Scanner;

public class Game {
	Player player1, player2;
	int manaCount;
	
	public Game(Player p1, Player p2){
		player1 = p1;
		player2 = p2;
		manaCount = 0;
	}
	
	
	public void start(){
		player1.myDeck.shuffleDeck();
		player2.myDeck.shuffleDeck();
		for(int i = 0; i < 2; i++){
			player1.drawCard();
			player2.drawCard();
		}
		while(!playerTwoWins()){
			manaCount++;
			player1.turn(manaCount);
			if(playerOneWins()){
				break;
			}
			player2.turn(manaCount);
		}
	}
	
	public boolean playerOneWins(){
		if(player2.getLifePoints() <= 0){
			System.out.println(player1.getName() + " WINS!!!");
			return true; 
		}
		return false;
	}
	
	public boolean playerTwoWins(){
		if(player1.getLifePoints() <= 0){
			System.out.println(player2.getName() + " WINS!!!");
			return true;
		}
		return false;
	}
}