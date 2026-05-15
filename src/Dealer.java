public class Dealer {

    Boolean Isover16;
    int CardTotal;
    Card[]hand;
    Boolean isbust;

    public Dealer(){

        Isover16 = false;
        CardTotal = 0;
        hand = new Card[10];
        isbust = false;

    }

    public void printInfo(){
        System.out.println("Over 16: " + Isover16);
        System.out.println("Card Total: " + CardTotal);
        System.out.println("Bust: " + isbust);
        for(int i = 0; i < hand.length; i = i + 1){

            if(hand[i] == null){

            }
            else{
                hand[i].print();
            }
        }
    }

}



