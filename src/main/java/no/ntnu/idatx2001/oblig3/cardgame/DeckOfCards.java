package no.ntnu.idatx2001.oblig3.cardgame;

import java.util.ArrayList;
import java.util.Random;

public class DeckOfCards {

  private ArrayList<PlayingCard> deck = new ArrayList<PlayingCard>();
  private final char[] suit = {'S', 'H', 'D', 'C'};


  public DeckOfCards(){
    for (char c : suit) {
      for (int j = 1; j <= 13; j++)
       this.deck.add(new PlayingCard(c, j));
   }
  }

  public void printCards(){
    for(PlayingCard card : deck){
        System.out.println(card.getFace() + "" + card.getSuit());
    }
  }

  public int cardsInDeck(){
    int amount = 0;
    for(PlayingCard card : deck){
      amount++;
    }
    return amount;
  }

  private Random random = new Random();

  public ArrayList dealHand(int n) {
    ArrayList<PlayingCard> randomCards = new ArrayList<PlayingCard>();
    if (n > 0 && n < 52)
      for (int i = 0; i < n; ++i){
        int a = random.nextInt(deck.size());
        if (!randomCards.contains(deck.get(a))){
          randomCards.add(deck.get(a));
        }
        else{
          --i;
        }
      }
    return randomCards;
  }
}
