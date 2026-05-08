public class Card {

    int value;
    String name;
    String suit;

    public Card(int pValue, int pName , String pSuit){
    value = pValue;
    if(pName ==0){
        name = "ace";
        value = 11;
    } else if (pName ==1){
        name = "two";
        value = 2;
    }

    suit = pSuit;
    }

    public void print(){
        System.out.println("The "+name+" of "+suit+" is worth "+ value+" points ");

    }

}
