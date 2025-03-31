package warGame;

public class Card {
	private int rank;
	private int suit;
	
	
	public Card(int rank, int suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	} // end of card


	@Override
	public String toString() {
		String [] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String [] ranks = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		return ranks[this.rank] + " of " + suits[this.suit]; 
		
		
		
		
	} // end of tostring

} // end of class
