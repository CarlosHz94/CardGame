import java.util.Scanner;

public class Game {
	Player player1, player2;
	
	public Game(Player p1, Player p2){
		player1 = p1;
		player2 = p2;
	}
	
	
	public void start(){
		for(int i = 0; i < 2; i++){
			player1.drawCard();
			player2.drawCard();
		}
		while(!player1.myDeck.isEmpty() || !player2.myDeck.isEmpty()){
			player1.turn();
			player2.turn();
		}
	}
}
