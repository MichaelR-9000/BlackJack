public class Player {

    int Cardtotal;
    Boolean isBust;
    Card[] hand;
    Boolean Ishit;
    String name;

    //todo: make constructor with no parameters that sets the defaults for ten instance variavles
    //todo: make a print that prints a;; the instanmce cariables

    public Player() {
        Cardtotal = 0;
        isBust = false;
        Ishit = false;
        hand = new Card[2];
        name = "Mike";
    }

    public void printInfo() {
        System.out.println("Card Total: " + Cardtotal);
        System.out.println("Bust: " + isBust);
        System.out.println("Hit: " + Ishit);
        System.out.println("name: " + name);

        for (int i = 0; i < hand.length; i = i + 1) {
                hand[i].print();
            }
        }
    public void calculatetotal(){
        int addedValue = 0;
        for(int d = 0;d<hand.length;d++){
            addedValue = addedValue + hand[d].value;
        }
        Cardtotal = addedValue;

    }

    }

