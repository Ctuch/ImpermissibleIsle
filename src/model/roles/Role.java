package model.roles;

import model.Card;
import model.Direction;

import java.util.ArrayList;

public abstract class Role {

    private int position;
    private int movesRemaining;
    private ArrayList<Card> hand;

    protected String name;

    protected Role() {
        hand = new ArrayList<>();
        movesRemaining = 3;
    }

    public void move(Direction d) {
        //TODO
    }

    public void shore(Direction d) {
        //TODO
    }

    public void trade(Card c, Role r) {
        //TODO
    }

    public String getName() {
        return name;
    }

    public void addCard(Card c) {
        hand.add(c);
    }
}
