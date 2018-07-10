/**
* commentary
*/


import java.io.*;
/**
 * Represents a playing card with a name, mana cost, hp value, 
 * and an attack value. A card is able to attack other cards, both cards 
 * will be affected by the attack value of the other card.
 * 
 * @author Carlos Hernandez
 *
 */
public class Card {
	
	/**
	 * Name of the card
	 */
	private String cardName;
	
	/**
	 * Mana cost
	 */
	private int manaCost;
	
	/**
	 * Hp value
	 */
	private int hpValue;
	
	/**
	 * Attack Value
	 */
	private int atkValue;
	
	private boolean attack;
	
	
	/**
	 * Constructs a card object given a name, mana cost, hp value, and 
	 * attack value
	 * @param name Name of the Card
	 * @param mana Mana cost
	 * @param hp Hp value
	 * @param atk Attack value
	 */
	public Card(String name, int mana, int hp, int atk){
		cardName = name;
		manaCost = mana;
		hpValue = hp;
		atkValue = atk;
		attack = false;
	}
	
	/**
	 * Attack a targeted card, both cards will be affected by their attack values
	 * @param target Target card
	 */
	public void attack(Card target){
		int newHp = getHpValue()-target.getAtkValue();
		int targetHp = target.getHpValue() - getAtkValue();
		setHpValue(newHp);
		target.setHpValue(targetHp);
		
	}
	
	/**
	 * Attack the opponent player's life points
	 * @param opponent Opponent Player
	 */
	public void directAttack(Player opponent){
		opponent.updateLifePoints(getAtkValue());
	}
	
	/**
	 * Name getter
	 * @return Name of Card
	 */
	public String getCardName() {
		return cardName;
	}
	
	/**
	 * Mana Cost getter
	 * @return Mana Cost
	 */
	public int getManaCost() {
		return manaCost;
	}
	
	/**
	 * Hp getter
	 * @return Hp value
	 */
	public int getHpValue() {
		return hpValue;
	}
	
	/**
	 * Attack getter
	 * @return Attack Value
	 */
	public int getAtkValue() {
		return atkValue;
	}
	
	/**
	 * Sets a new Hp value
	 * @param newHp new Hp value
	 */
	public void setHpValue(int newHp){
		hpValue = newHp;
	}
	
	/**
	 * Prints card
	 */
	public String toString(){
		String card = "";
		card += getCardName() + "\n";
		card += "Mana cost: " + getManaCost() + "\n";
		card += "Attack: " + getAtkValue() + "\n";
		card += "Hp: " + getHpValue() + "\n\n";
		return card;
	}
	
	public void canAttack(){
		
	}
}