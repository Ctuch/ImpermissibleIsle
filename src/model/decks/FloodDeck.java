package model.decks;

import model.Card;
import model.CardType;

import java.awt.*;
import java.util.ArrayList;

public class FloodDeck extends Deck {

    ArrayList<Card> floodedTiles;
    ArrayList<Card> sunkTiles;
    public FloodDeck() {
        super();
        floodedTiles = new ArrayList<>();
        sunkTiles = new ArrayList<>();
        initialDeck();
        shuffle();
        floodInitialTiles();
        shuffle();
    }

    private void floodInitialTiles() {
        for (int i = 0; i < 6; i++) {
            cards.get(i).setBackground(new Color(28, 131, 158));
            floodedTiles.add(cards.get(i));
            discardPile.add(cards.get(i));

        }
    }

    private void initialDeck() {
        cards.add(new Card("Tidal Palace", CardType.CUP));
        cards.add(new Card("Coral Palace", CardType.CUP));
        cards.add(new Card("Cave of Embers", CardType.FIRE));
        cards.add(new Card("Cave of Shadows", CardType.FIRE));
        cards.add(new Card("Whispering Garden", CardType.LION));
        cards.add(new Card("Howling Garden", CardType.LION));
        cards.add(new Card("Temple of the Sun", CardType.STATUE));
        cards.add(new Card("Temple of the Moon", CardType.STATUE));
        cards.add(new Card("Bronze Gate", CardType.RED));
        cards.add(new Card("Gold Gate", CardType.YELLOW));
        cards.add(new Card("Silver Gate", CardType.GREY));
        cards.add(new Card("Copper Gate", CardType.GREEN));
        cards.add(new Card("Iron Gate", CardType.BLACK));
        cards.add(new Card("Fool's Landing", CardType.BLUE));
        cards.add(new Card("Twilight Hollow", CardType.EMPTY));
        cards.add(new Card("Observatory", CardType.EMPTY));
        cards.add(new Card("Crimson Forest", CardType.EMPTY));
        cards.add(new Card("Cliffs of Abandon", CardType.EMPTY));
        cards.add(new Card("Breakers Bridge", CardType.EMPTY));
        cards.add(new Card("Dunes of Deception", CardType.EMPTY));
        cards.add(new Card("Lost Lagoon", CardType.EMPTY));
        cards.add(new Card("Watchtower", CardType.EMPTY));
        cards.add(new Card("Misty Marsh", CardType.EMPTY));
        cards.add(new Card("Phantom Rock", CardType.EMPTY));
    }
}
