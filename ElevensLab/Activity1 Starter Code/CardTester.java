/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card aceOfSpades = new Card("Ace", "Spades", 13);
		Card bearOfTigers = new Card("Bear" , "Tigers" , 11);
		Card lol = new Card("2323", "23234" , 22);
		System.out.println( aceOfSpades.toString() );
		System.out.println( bearOfTigers.toString() );
		System.out.println( lol.toString() );
	}
}
