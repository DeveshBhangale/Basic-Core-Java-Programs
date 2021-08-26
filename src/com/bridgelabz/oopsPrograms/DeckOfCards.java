package com.bridgelabz.oopsPrograms;

public class DeckOfCards {
	public static final String suits[] = {"Hearts", "Diamonds", "Spade", "Club"};
	public static String ranks[] = new String[13];
    public static String cards[] = new String[52];
    public static final int noOfPlayers=4;
    public static final int playerCardDistribution=9;
    public static int cn=0;
    public static String player1[] = new String[playerCardDistribution];
    public static String player2[] = new String[playerCardDistribution];
    public static String player3[] = new String[playerCardDistribution];
    public static String player4[] = new String[playerCardDistribution];
    
    
	public DeckOfCards() {
	}
	
	public static void arrangeDeck() {
		ranks[0] = "ace";
		ranks[10]="Joker";
        ranks[11]="Queen";
        ranks[12]="King";
		for (int i=1; i<10; i++ ){
            ranks[i] =Integer.toString(i+1);
            //System.out.println(ranks[i]);
        }
		for (int i=0;i<suits.length;i++){
            for (int j=0;j<ranks.length;j++){
                cards[cn] = ranks[j] + " of " + suits[i];
                //System.out.println(cards[cn]);
                cn++;                
            }
        }
		
	}
	
	public static void shuffleCards(){
        String shuffle;
        for (int i=0 ; i<cards.length ; i++){
            int random = (int) (Math.random() * (i));
            shuffle = cards[i];
            cards[i]=cards[random];
            cards[random]=shuffle;
        }
    }
	
	public static void printDeck(){
		cn=0;
        for (int i=0; i< suits.length; i++){
            for (int j=0; j< ranks.length; j++){
                System.out.println("Card number "+ (cn+1) + " has " + cards[cn]);
                cn++;
            }
        }
    }
	
	public static void distributeCards() {
		int p1=1,p2=10,p3=19,p4=27;
		for(int i=0;i<9;i++) {
			player1[i] = cards[p1];
			player2[i] = cards[p2];
			player3[i] = cards[p3];
			player4[i] = cards[p4];
			p1++;p2++;p3++;p4++;
		}
	}
	
	public static void playerCards(String arr[],String playerName) {
		System.out.println("\n\n"+playerName + " has Cards: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		arrangeDeck();
		shuffleCards();
		// printDeck();
		distributeCards();
		playerCards(player1,"player1");
		playerCards(player2,"player2");
		playerCards(player3,"player3");
		playerCards(player4,"player4");

	}

}
