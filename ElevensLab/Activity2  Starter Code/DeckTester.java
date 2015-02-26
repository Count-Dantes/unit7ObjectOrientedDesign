/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args){
	    String[] faces = ["Ace","King","Queen"];
	    String[] suits = String["Spade", "Club", "Heart", "Diamond"];
	    int[] values = int[13,12,11];
		Deck deckard = new Deck(faces, suits, values);
		System.out.print(deckard.toString());
	}
}
