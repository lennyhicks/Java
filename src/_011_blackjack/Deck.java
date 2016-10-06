package _011_blackjack;


import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by lennyhicks on 10/5/16.
 */
public class Deck {

    private ArrayList<Card> cards = new ArrayList<>();


    public Deck() {
        addCards();

        shuffle();
    }

    public void addCards() {
            for (Value value : Value.values()) {

                for (Suit suit : Suit.values()) {
            }
        }
    }


    private void shuffle() {
        Collections.shuffle(cards);
    }


    public ArrayList<Card> getCards() {
        return cards;
    }


    //Return total value of cards in a deck.
    public int cardsValue(String card) {
        if (card != null) {
            switch (card) {
                case "TWO":
                    return 2;
                case "THREE":
                    return 3;
                case "FOUR":
                    return 4;
                case "FIVE":
                    return 5;
                case "SIX":
                    return 6;
                case "SEVEN":
                    return 7;
                case "EIGHT":
                    return 8;
                case "NINE":
                    return 9;
                case "TEN":
                    return 10;
                case "ACE":
                    return 11;
                default:
                    break;
            }
        }
            return 0;
        }
    }




