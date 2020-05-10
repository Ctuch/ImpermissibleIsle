package model.roles;

import model.Direction;

public class Pilot extends Role{

    private boolean hasFlownThisTurn;

    public Pilot() {
        super();
        hasFlownThisTurn = false;
    }
    /**
     * Once per turn, a pilot can fly to any tile for one action
     * @param d
     */
    @Override
    public void move(Direction d) {
        super.move(d);
    }
}
