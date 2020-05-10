package model.roles;

import model.Direction;

public class Explorer extends Role {

    /**
     * An explorer can move diagonally
     * @param d
     */
    @Override
    public void move(Direction d) {
        super.move(d);
    }

    /**
     * An explorer can shore up diagonally
     * @param d
     */
    @Override
    public void shore(Direction d) {
        super.shore(d);
    }
}
