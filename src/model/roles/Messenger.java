package model.roles;

import model.Card;

public class Messenger extends Role {

    /**
     * give treasure cards to a player anywhere on the island for one action per card
     * @param c
     * @param r
     */
    @Override
    public void trade(Card c, Role r) {
        super.trade(c, r);
        //TODO: may just need to override a check that sees if messenger on same tile as player
    }
}
