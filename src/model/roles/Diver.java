package model.roles;

import model.Direction;

public class Diver extends Role {

    /**
     * move through 1 or more adjacent flooded and/or missing tiles for 1 action
     * @param d
     */
    @Override
    public void move(Direction d) {
        super.move(d);
        //TODO: may need to override the directional checking AND the move
    }
}
