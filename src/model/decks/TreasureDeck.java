package model.decks;

import model.Card;
import model.CardType;
import model.roles.Role;

import java.util.ArrayList;

public class TreasureDeck extends Deck {

    public TreasureDeck() {
        super();
        initialDeck();
        shuffle();
    }

    /**
     * deck without water's rise cards for initial deal
     */
    private void initialDeck() {
        for (int i = 0; i < 5; i++) {
            if (i < 2) {
                cards.add(new Card(CardType.SANDBAG));
            }
            if (i < 3) {
                cards.add(new Card(CardType.LIFT));
            }
            cards.add(new Card(CardType.LION));
            cards.add(new Card(CardType.CUP));
            cards.add(new Card(CardType.STATUE));
            cards.add(new Card(CardType.FIRE));
        }
    }

    public void deal(Role r) {
        if (cards.size() == 0) {
            reshuffleDiscardPile();
            draw(2, r);
        } else if (cards.size() == 1) {
            draw(1, r);
            reshuffleDiscardPile();
            draw(1, r);
        } else {
            draw(2, r);
        }
    }

    private void draw(int amount, Role r) {
        for (int i = 0; i < amount; i++) {
            r.addCard(cards.remove(i));
        }
    }

    public void addInWaterRise() {
        for (int i = 0; i < 3; i++) {
            cards.add(new Card(CardType.WATER_RISE));
        }
    }
}
