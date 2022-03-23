package no.ntnu.idatx2001.oblig3.cardgame;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestHand {
    @Test
    public void testAmountofCards() {
        Hand hand = new Hand();
        DeckOfCards deck = new DeckOfCards();
        hand.setHand(deck.dealHand(5));
        assertEquals(5,hand.amountOfCardsInHand());

        hand.setHand(deck.dealHand(10));
        assertEquals(10,hand.amountOfCardsInHand());
    }

    @Test
    public void testHearts(){
        Hand hand = new Hand();

        ArrayList<PlayingCard>listOfCards = new ArrayList<PlayingCard>();

        listOfCards.add(new PlayingCard('H', 2));
        listOfCards.add(new PlayingCard('H', 3));
        listOfCards.add(new PlayingCard('C', 2));
        listOfCards.add(new PlayingCard('S', 2));

        hand.setHand(listOfCards);

        assertEquals("2H 3H ", hand.findHearts());
    }

    @Test
    public void testFlush(){
        Hand hand = new Hand();

        ArrayList<PlayingCard>listOfCards = new ArrayList<PlayingCard>();
        ArrayList<PlayingCard>listOfCards2 = new ArrayList<PlayingCard>();

        listOfCards.add(new PlayingCard('H', 1));
        listOfCards.add(new PlayingCard('H', 2));
        listOfCards.add(new PlayingCard('H', 3));
        listOfCards.add(new PlayingCard('H', 4));
        listOfCards.add(new PlayingCard('H', 5));

        hand.setHand(listOfCards);

        assertEquals(true, hand.allSuitMatch());

        listOfCards2.add(new PlayingCard('H', 1));
        listOfCards2.add(new PlayingCard('H', 2));
        listOfCards2.add(new PlayingCard('H', 3));
        listOfCards2.add(new PlayingCard('H', 4));
        listOfCards2.add(new PlayingCard('S', 5));

        hand.setHand(listOfCards2);

        assertEquals(false, hand.allSuitMatch());

    }

    @Test
    public void testSum(){
        Hand hand = new Hand();

        ArrayList<PlayingCard>listOfCards = new ArrayList<PlayingCard>();
        ArrayList<PlayingCard>listOfCards2 = new ArrayList<PlayingCard>();

        listOfCards.add(new PlayingCard('H', 1));
        listOfCards.add(new PlayingCard('H', 2));
        listOfCards.add(new PlayingCard('H', 3));
        listOfCards.add(new PlayingCard('H', 4));
        listOfCards.add(new PlayingCard('H', 5));

        hand.setHand(listOfCards);

        assertEquals(15, hand.findSumOfHand());

        listOfCards2.add(new PlayingCard('H', 5));
        listOfCards2.add(new PlayingCard('H', 6));
        listOfCards2.add(new PlayingCard('H', 7));
        listOfCards2.add(new PlayingCard('H', 8));
        listOfCards2.add(new PlayingCard('S', 9));

        hand.setHand(listOfCards2);

        assertEquals(35, hand.findSumOfHand());
    }

    @Test
    public void testQueenOfSpades(){
        Hand hand = new Hand();

        ArrayList<PlayingCard>listOfCards = new ArrayList<PlayingCard>();
        ArrayList<PlayingCard>listOfCards2 = new ArrayList<PlayingCard>();

        listOfCards.add(new PlayingCard('S', 1));
        listOfCards.add(new PlayingCard('S', 2));
        listOfCards.add(new PlayingCard('S', 3));
        listOfCards.add(new PlayingCard('S', 4));
        listOfCards.add(new PlayingCard('S', 5));

        hand.setHand(listOfCards);

        assertEquals(false, hand.checkForQueenSpades());

        listOfCards2.add(new PlayingCard('S', 5));
        listOfCards2.add(new PlayingCard('S', 6));
        listOfCards2.add(new PlayingCard('S', 7));
        listOfCards2.add(new PlayingCard('S', 8));
        listOfCards2.add(new PlayingCard('S', 12));
        listOfCards2.add(new PlayingCard('C', 12));
        listOfCards2.add(new PlayingCard('H', 12));

        hand.setHand(listOfCards2);

        assertEquals(true, hand.checkForQueenSpades());

    }

}
