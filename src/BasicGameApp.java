public class BasicGameApp {
    Card[] deck;
    Player p1;
    Dealer d1;
    Boolean gameon;

    public static void main(String[] args) {
        new BasicGameApp();
    }

    public BasicGameApp(){
        System.out.println("Welcome to Blackjack!");
        deck = new Card[52];

        for(int x = 0; x<13;x=x+1){
            deck[x] = new Card(10,x,"hearts");
            deck[x].print();
        }
    }


}
