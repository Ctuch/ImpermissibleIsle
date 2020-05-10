package model.decks;

import model.Card;

import java.util.ArrayList;
import java.util.Random;

public abstract class Deck {

    protected ArrayList<Card> cards;
    protected ArrayList<Card> discardPile;

    protected Deck() {
        cards = new ArrayList<>();
        discardPile = new ArrayList<>();
    }

    public void shuffle() {
        ArrayList<Card> shuffledCards = new ArrayList<>();
        Random random = new Random();
        while (cards.size() > 0) {
            int nextCard = random.nextInt(cards.size());
            shuffledCards.add(cards.remove(nextCard));
        }
        cards = shuffledCards;
    }

    public void reshuffleDiscardPile() {
        cards.addAll(discardPile);
        shuffle();
    }
}
