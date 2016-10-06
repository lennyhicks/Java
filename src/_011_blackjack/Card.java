package _011_blackjack;

/**
 * Created by lennyhicks on 10/5/16.
 */
public class Card {

    public Suit suit;
    public Value value;


    public Card(Suit s, Value v){
        value = v;
        suit = s;
    }

    public Value getValue(){
            return value;
    }


    public String toString() {
        return suit.toString() +" - "+ value.toString();
    }

    public Suit getSuit() {
        return suit;
    }


}
