package edu.wtc;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertTrue;

public class GameTest {
    private Card[] hand;

    @Before
    public void setUp() {
        hand = new Card[]{new Card(Suit.CLUBS, Face.JACK), new Card(Suit.CLUBS, Face.QUEEN), new Card(Suit.SPADE, Face.JACK)};
    }

    @Test
    public void twoOfAKindTest(){
        assertTrue(Game.twoOfAKind(hand));
    }
}
