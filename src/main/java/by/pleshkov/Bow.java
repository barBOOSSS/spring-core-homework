package by.pleshkov;

import java.util.List;

public class Bow implements Weapon {

    private final String name;

    private final List<Arrow> arrows;

    public Bow(String name, List<Arrow> arrows) {
        this.name = name;
        this.arrows = arrows;
    }

    @Override
    public String getName() {
        return name;
    }
}
