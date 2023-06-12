package by.pleshkov;

public class Dagger implements Weapon{

    private final String name;
    private final Integer damage;
    private final String material;

    public static Dagger steelDagger(String name, Integer damage){
        return new Dagger(name, damage,"steel");
    }

    private Dagger(String name, Integer damage, String material) {
        this.name = name;
        this.damage = damage;
        this.material = material;
    }

    @Override
    public String getName() {
        return name;
    }
}
