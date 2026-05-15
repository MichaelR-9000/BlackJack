import java.util.Scanner;

public class BasicGameApp {
    Card[] deck;
    Player p1;
    Dealer d1;
    Boolean gameon;

    public static void main(String[] args) {
        new BasicGameApp();
    }

    public BasicGameApp() {
        System.out.println("Welcome to Blackjack!");
        deck = new Card[52];
        p1 = new Player();
        d1 = new Dealer();

        int cardIndex = 0;
        for (int i = 0; i<4;i++) {
            for (int x = 0; x < 13; x = x + 1) {
                deck[cardIndex] = new Card(10, x, i);
                cardIndex++;
                //deck[x].print();
            }
        }
        Shuffle();
        PrintDeck();

        p1.hand[0] = deck[0];
        p1.hand[1]=deck[1];
//ask the user questions
        Scanner s = new Scanner(System.in);
        System.out.println("what is your name?");
        String aName = s.nextLine();
        System.out.println(aName);
        p1.name = aName;
        p1.calculatetotal();
        p1.printInfo();
    }


    public void PrintDeck() {
for (int i =0; i < deck.length; i++){
    if(deck[i] !=null){
        deck[i].print();
    }
        }
    }

    public void Shuffle(){
        for (int y=0;y<deck.length;y++){
            int randy = (int)(Math.random()*52 );
            Card helper = deck[randy];
            deck[randy] = deck[y];
            deck[y] = helper;
        }

    }


    }

