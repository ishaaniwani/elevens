/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 * 
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("Ace", "Hearts", 11);
		Card card2 = new Card("Three", "Spades", 3);
		Card card3 = new Card("Three", "Diamonds", 3);

		card1.rank();
		card1.suit();
		card1.pointValue();
		card1.matches(card2);
		card1.matches(card3);
		card1.toString();

		card2.rank();
		card2.suit();
		card2.pointValue();
		card2.matches(card1);
		card2.matches(card3);
		card2.toString();

		card3.rank();
		card3.suit();
		card3.pointValue();
		card3.matches(card1);
		card3.matches(card2);
		card3.toString();

		System.out.println("Test finished");
	}
}