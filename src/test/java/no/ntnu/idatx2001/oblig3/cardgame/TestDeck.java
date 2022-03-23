package no.ntnu.idatx2001.oblig3.cardgame;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestDeck {

    @Test
    public void testFullDeck(){
        DeckOfCards deck = new DeckOfCards();
        assertEquals(52, deck.cardsInDeck());
    }

    @Test
    public void testDrawCards(){
        DeckOfCards deck = new DeckOfCards();
        ArrayList<PlayingCard> test = new ArrayList();
        test = deck.dealHand(1);
        assertEquals(test.get(0).getClass(), PlayingCard.class);
    }

}
