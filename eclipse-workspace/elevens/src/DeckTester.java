/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 * 
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = new String[] { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
				"Jack", "Queen", "King" };
		String[] suits = new String[] { "Spades", "Clubs", "Hearts", "Diamonds" };
		int[] values = new int[] { 11, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10 };

		Deck deck1 = new Deck(ranks, suits, values);
		deck1.isEmpty();
		deck1.size();
		deck1.shuffle();
		deck1.deal();
		deck1.toString();

		Deck deck2 = new Deck(ranks, suits, values);
		deck2.isEmpty();
		deck2.size();
		deck2.shuffle();
		deck2.deal();
		deck2.toString();

		Deck deck3 = new Deck(ranks, suits, values);
		deck3.isEmpty();
		deck3.size();
		deck3.shuffle();
		deck3.deal();
		deck3.toString();
	}
}