package warGame;

public class Card {
	private int rank;
	private int suit;

	private static final String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };
	private static final String[] RANKS = { null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
			"King" };

	public Card(int rank, int suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	} // end of card

	public boolean equals(Card that) {
		return this.rank == that.rank & this.suit == that.suit;
	} // end of boolean return

	public int compareTo(Card that) {

		if (this.suit < that.suit)
			return -1;
		if (this.suit > that.suit)
			return 1;
		if (this.rank < that.rank)
			return -1;
		if (this.rank > that.rank)
			return 1;
		return 0;

	} // end of compareTo

	
	public int getRank() {
		return this.rank;
	}

	public int getSuit() {
		return this.suit;
	}
	
	@Override
	public String toString() {

		return RANKS[this.rank] + " of " + SUITS[this.suit];

	} // end of tostring

} // end of class
