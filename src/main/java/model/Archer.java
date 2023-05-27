package model;

import model.base.Hero;

import java.util.HashMap;

public class Archer extends Hero {
    public Archer(String name) {
        super(250, 1, 17, 57, name, "Archer");
    }

    @Override
    public double hit(Hero otherHero) {
        return 0;
    }
}
