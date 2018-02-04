/**
 * Parser class
 * @author Carlos Hernandez
 *
 */
public class Parser {

	/**
	 * Parses a card
	 * @param line Card info
	 * @return Card object
	 */
	public static Card cardParser(String line){
		String[] card = line.split(";");
		return new Card(card[0],Integer.parseInt(card[1]),Integer.parseInt(card[2]),Integer.parseInt(card[3]));
	}
}
