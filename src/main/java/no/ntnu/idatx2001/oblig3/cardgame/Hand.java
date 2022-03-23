package no.ntnu.idatx2001.oblig3.cardgame;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<PlayingCard> hand;

    public Hand(){
        this.hand = new ArrayList<>();
    }

    public void setHand(List<PlayingCard> hand) {
        this.hand = hand;
    }

    /**
     * Prints all the cards in the hand as Face + Suit
     * Example of Ace of Spades = 1S
     */
    public String printHand(){
        String handOfCards = "";
        for(PlayingCard card : hand){
            handOfCards = handOfCards + card.getFace() + "" + card.getSuit()+ "\n";
        }
        return handOfCards;
    }

    public String findHearts(){
        String hearts = "";
        char h = 'H';
        for(PlayingCard card : hand){
            if (card.getSuit() == h){
                hearts = hearts + card.getFace() + "" + card.getSuit() + " ";
            }
        }
        if(hearts == ""){
            hearts = "No Hearts";
        }
        return hearts;
    }

    public int findSumOfHand() {
        int sumofHand = 0;
        for (PlayingCard card : hand) {
            sumofHand = sumofHand + card.getFace();
        }
        return sumofHand;
    }

    public boolean checkForQueenSpades(){
        boolean check = false;
        for (PlayingCard card : hand) {
            if(card.getSuit() == 'S' && card.getFace() == 12){
                check = true;
            }
        }
        return check;
    }



    /**
     * Takes the suit of the first card then compares the suit of the rest of the hand to see if they all match.
     * @return returns true if all suits match
     */

    public boolean allSuitMatch(){
        char firstSuit = hand.get(0).getSuit();
        boolean match = hand.stream().allMatch(PlayingCard -> PlayingCard.getSuit() == firstSuit);
        return match;
        }

    public int amountOfCardsInHand(){
        int amount = 0;
        for (PlayingCard card : hand){
            amount = amount + 1;
        }
        return amount;
    }
}

