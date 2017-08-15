package blackjack.black_jack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	private List<Card> hand;
	private int cardSum;
	
	public Hand() {
		this.hand = new ArrayList<Card>(); 
		this.cardSum = 0; 
	}

	public void addCardToHand(Card c) {
		hand.add(c); 
		
		/* implement later */
		/*
		if(c.isAce()) {
			// ask user if they want to pick 1 or 11
			
			return; 
		}
		*/
		
		cardSum += c.getValue(); 
	}
	
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getCardSum() {
		return cardSum;
	}

	public void setCardSum(int cardSum) {
		this.cardSum = cardSum;
	}
	
}
