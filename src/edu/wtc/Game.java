package edu.wtc;

import java.util.Arrays;

/** This class tests the current hand in play, taken from the Card class.
 * In a game, this would serve to see which player the winning hand based on Texas Hold'em Rules.
 * @author David
 * @version 1.0
 */
public class Game {
    /**
     *
     * @param hand An array of cards
     * @return True if there are two of a kind and false if not
     */
    public static boolean twoOfAKind(Card[] hand){
        Arrays.sort(hand, (a, b) -> a.getFace().compareTo(b.getFace()));
        int numberOfMatches = 0;
        for(int i=0;i < hand.length-1; i++) {
            if (hand[i].getFace().equals(hand[i+1].getFace())) return true;
        }
        return false;
    }

    public static boolean threeOfAKind(Card[] hand){
        Arrays.sort(hand, (a, b) -> a.getFace().compareTo(b.getFace()));
        int numberOfMatches = 0;
        for(int i=0;i < hand.length-1; i++) {
            if (hand[i].getFace().equals(hand[i+1].getFace())
                    && hand[i].getFace().equals(hand[i+2].getFace())) return true;
        }
        return false;
    }

    public static boolean fourOfAKind(Card[] hand){
        Arrays.sort(hand, (a, b) -> a.getFace().compareTo(b.getFace()));
        int numberOfMatches = 0;
        for(int i=0;i < hand.length-1; i++) {
            if (hand[i].getFace().equals(hand[i+1].getFace())
                    && hand[i].getFace().equals(hand[i+2].getFace())
                    && hand[i].getFace().equals(hand[i+3].getFace())) return true;
        }
        return false;
    }

}
