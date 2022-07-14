package _06_Card_Game;

public class Card {

    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public String toString() {
        return rank + " of " + suit;
    }
    public enum suit {
    	Spades, Clubs, Hearts, Diamonds;
    }
    public enum rank {
    	Two(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Eight(8), Nine(9), Ten(10), Jack(11), Queen(12), King(13), Ace(14);
    	
    	private final int value;
    	
    	rank(int value) {
			this.value = value;
		}

		public int getValue() {
    		return this.value;
    	}
    }
}
