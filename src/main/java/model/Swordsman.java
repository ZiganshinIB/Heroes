package model;

import model.base.Hero;
import model.weapon.base.Bow;
import model.weapon.base.Sword;
import model.weapon.base.Weapon;

public class Swordsman extends Hero {
    private Sword weapon;
    public Swordsman(double health, int level, double damage, double mana, String name, String caste) {
        super(health, level, damage, mana, name, caste);
    }

    @Override
    public double hit(Hero otherHero) {
        return 0;
    }

    @Override
    public void takeWeapon(Weapon weapon) {
        if (weapon instanceof Bow) {
            this.weapon = (Sword) weapon;
        }
    }
}
