package model;

import model.base.Hero;

public class Magic extends Hero {
    public Magic(String name) {
        super(100., 1, 15, 250, name, "Magic");
    }

    @Override
    public double hit(Hero otherHero) {
        return 0;
    }
}
