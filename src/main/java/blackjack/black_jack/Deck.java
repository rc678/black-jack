package blackjack.black_jack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> allCards; 
	
	public Deck() {
		allCards = new ArrayList<Card>(); 
		initializeDeck(); 
	}

	private void initializeDeck() {
		Card c; 
		for(int i=0; i < 4; i++) {
			String suite = ""; 
			if(i == 0) {
				suite = "heart";
			}
			if(i == 1) {
				suite = "spade";
			}
			if(i == 2) {
				suite = "diamond";
			}
			
			if(i == 3) {
				suite = "clover"; 
			}
			
			for(int j=1; j <= 10; j++) {
				c = new Card(suite, j, false);
				addCard(c); 
			} // end of inner for
			
			for(int j=1; j<= 3; j++) {
				c = new Card(suite, 10, false);
				addCard(c); 
			}
			//adding ace
			//c = new Card(suite, 1, true); 
			//addCard(c); 
		}
	}
	
	public void shuffleDeck() {
		Collections.shuffle(allCards); 
	}
	
	public boolean addCard(Card c) {
		if(c == null) {
			return false;
		}
		
		return allCards.add(c);
	}
	
	public Card removeCard() {
		if(allCards.size() <= 0) {
			System.out.println("deck is empty");
			return null; 
		}
		return allCards.remove(0);
		
	}

	public List<Card> getAllCards() {
		return allCards;
	}

	public void setAllCards(List<Card> allCards) {
		this.allCards = allCards;
	}
	
}
