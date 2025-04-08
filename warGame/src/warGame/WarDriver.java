package warGame;

public class WarDriver {

	public static void main(String[] args) {
		
		// create an array to hold 52 card objects.
		Card[] cards = new Card[52];
		
		// populate the deck of cards with all 52 cards.
		makeDeck(cards); 
		
		// print the contents of the generated deck
		printDeck(cards);

		//create a target card object to search for ()
		Card target = new Card(0, 0);
		
		//print the target card to the console
		System.out.println(target);
		
		//perform a linear search for the target card and print results
		System.out.println("\nLinear\n");
		System.out.println(search(cards, target));
		
		// perform a binary search for the target cards and print results
		System.out.println("\nBinary\n");
		System.out.println(binarySearch(cards, target));
	}

	//performs a linear search for a target card in an array of cards
	public static int search(Card[] cards, Card target) {
		//iterate through each card in the array
		for (int i = 0; i < cards.length; i++) {
			//print the card being examined
			System.out.println(cards[i]);
			
			//check if the current card is equal to target card
			if (cards[i].equals(target)) {
				//if found return the index of the card
				return i;
			}
		}
		// if not found return -1
		return -1;
	} // end of search

	
	public static int binarySearch(Card[] cards, Card target) {
		//initialize the low and high indices for the search range
		int low = 0;
		int high = cards.length - 1;
		
		//continue searching as long as the low index is less than or equal to the high index
		while (low <= high) {
			//print the current low and high indices for debugging purposes
			System.out.println(low + " , " + high);
			
			//calculate the middle index
			int mid = (low + high) / 2;
			
			//compare the card at the middle index with the target card
			int comp = cards[mid].compareTo(target);

			//if the card at the middle index is equal to target card, return the middle index
			if (comp == 0) {
				return mid;
				
			} 
			//if the card at the middle index is less than the target card, update the low index
			else if (comp < 0) {
				low = mid + 1;

			}
			//if the card at the middle index is greater than the target card, update the high index
			else {
				high = mid - 1;
			}
		}
		
		//if not found return -1
		return -1;

	}

	//prints the contents of an array of cards
	public static void printDeck(Card[] cards) {
		//check if array is empty, first card is null
		if (cards[0] == null) {

			System.out.println("There are no cards yet!");
		}
		//iterate through each card in the array and print
		for (Card card : cards) {

			System.out.println(card);
		}
	} // end of printdeck

	//creates a standard deck of 52 cards and populates the given array
	public static void makeDeck(Card[] cards) {

		//initialize the index of the populating array
		int index = 0;
		
		//iterate through each suit (0,3)
		for (int suit = 0; suit < 4; suit++) {
			//iterate through each rank(1,13)
			for (int rank = 1; rank <= 13; rank++)

			{
				//create a new card object and store it in the array
				cards[index] = new Card(rank, suit);
				//increment the index
				index++;
			}
		}

	}// end of make deck
} // end of class
