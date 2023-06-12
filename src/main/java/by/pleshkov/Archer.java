package by.pleshkov;

import java.util.List;

public class Archer {

    private final String name;
    private final List<Weapon> weapons;


    public Archer(String name, List<Weapon> weapons) {
        this.name = name;
        this.weapons = weapons;
    }
}
