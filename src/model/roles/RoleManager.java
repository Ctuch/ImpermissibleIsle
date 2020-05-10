package model.roles;

import java.util.ArrayList;
import java.util.Random;

public class RoleManager {

    ArrayList<Role> roles;

    public RoleManager() {
        super();
        roles = new ArrayList<>();
        generateRoles();
    }

    private void generateRoles() {
        roles.add(new Diver());
        roles.add(new Engineer());
        roles.add(new Explorer());
        roles.add(new Messenger());
        roles.add(new Navigator());
        roles.add(new Pilot());
    }

    public Role getRandomRole() {
        Random random = new Random();
        int roleNum = random.nextInt(roles.size());
        return roles.remove(roleNum);
    }

    public void reset() {
        generateRoles();
    }
}
