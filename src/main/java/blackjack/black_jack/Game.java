package blackjack.black_jack;

public class Game {
	
	private Player player;
	private Dealer dealer; 
	private boolean state;
	
	public Game(Player player, Dealer dealer) {
		this.player = player;
		this.dealer = dealer;
		setState(true);
	}
	
	
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	public boolean getState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

}
