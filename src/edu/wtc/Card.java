package edu.wtc;

import java.util.List;

/**
 * This class represents the cards in play, and has a list to track individual cards in a player's hand
 * @Author David
 */

public class Card {
    private Suit suit;
    private Face face;

    public Suit getSuit() {
        return suit;
    }

    public Face getFace() {
        return face;
    }


    /** Card object constructor
     * @param suit The suit of the card
     * @param face The numeric value of the card. A Face Value, such as a King, would be represented as a number greater than 10.
     */
    public Card(Suit suit, Face face){
        this.suit = suit;
        this.face = face;
    }


}
