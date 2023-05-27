package model;

import model.base.Hero;
import model.weapon.base.Bow;
import model.weapon.base.Weapon;

import java.util.HashMap;
import java.util.List;

public class Archer extends Hero {
    private Bow weapon;
    public Archer(String name) {
        super(250, 1, 17, 57, name, "Archer");
    }

    @Override
    public double hit(Hero otherHero) {
        return 0;
    }

    @Override
    public void takeWeapon(Weapon weapon) {
        if (weapon instanceof Bow){
            this.weapon = (Bow) weapon;
        }

    }
}
