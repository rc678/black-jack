package blackjack.black_jack;

public class Dealer {
	
	private String name;
	private Deck deck;
	private Hand hand; 
	
	public Dealer(String name) {
		this.name = name; 
		this.deck = new Deck(); 
		this.hand = new Hand(); 
	}

	public Card dealCard() {
		return deck.removeCard();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}
	
}
