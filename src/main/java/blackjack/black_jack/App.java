package blackjack.black_jack;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	//do I/O to get player and dealer name
        initiateGame("a", "b"); 
    }
    
    public static void initiateGame(String playerName, String dealerName) {
    	if(playerName == null || dealerName == null) {
    		System.out.println("names shouldn't be null");
    	}
    	
    	Player player1 = new Player(playerName);
    	Dealer dealer1 = new Dealer(dealerName); 
    	Game newGame = new Game(player1, dealer1);
    	
    	while(newGame.getState()) {    	
    		int player1Sum = player1.getHand().getCardSum(); 
    		if(player1Sum == 21) {
    			System.out.println("Player 1 wins");
    			break;
    		}else if(player1Sum > 21) {
    			System.out.println("Player 1 loses");
    			break; 
    		}
    		System.out.println("Your sum: " + player1Sum);
    		System.out.println("Deal card? y/n");
    		Scanner sc = new Scanner(System.in); 
    		
    		if(sc.next().equals("y")) {
        		Card playerCard = dealer1.dealCard();
    			player1.getHand().addCardToHand(playerCard);
    			
    		}
    		
    		
    	}
    	
    	
    }
}
