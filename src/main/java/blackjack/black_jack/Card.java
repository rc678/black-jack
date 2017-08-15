package blackjack.black_jack;

public class Card {
	private int value; //card values range from 2 to 10, where ace is 2 or 10
	private String suite; // 4 suites
	private boolean isAce; 
	
	public Card(String suite, int value, boolean isAce) {
		setAce(false);
	}
	
	public boolean isAce() {
		return isAce;
	}

	public void setAce(boolean isAce) {
		this.isAce = isAce;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getSuite() {
		return suite;
	}

	public void setSuite(String suite) {
		this.suite = suite;
	}
	
	
}
