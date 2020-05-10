package model.roles;

import model.Direction;

public class Engineer extends Role {

    public Engineer() {
        super();
        name = "Engineer";
    }

    /**
     * An engineer can shore up 2 tiles for one action
     * @param d
     */
    @Override
    public void shore(Direction d) {
        super.shore(d);
        //TODO
    }
}
