package model.base;

import model.weapon.base.Weapon;

import java.util.HashMap;

public abstract class Hero {
    private double health;
    private int level;
    private double damage;
    private double mana;
    private String name;
    protected String caste;

    @Override
    public String toString() {
        return "Hero{" +
                "health=" + health +
                ", level=" + level +
                ", damage=" + damage +
                ", mana=" + mana +
                ", name='" + name + '\'' +
                ", caste='" + caste + '\'' +
                '}';
    }

    public Hero(double health, int level, double damage, double mana, String name, String caste) {
        this.health = health;
        this.level = level;
        this.damage = damage;
        this.mana = mana;
        this.name = name;
        this.caste = caste;
    }

    public abstract double hit(Hero otherHero);


    public double getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public double getDamage() {
        return damage;
    }

    public double getMana() {
        return mana;
    }

    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Hero){
            obj = (Hero) obj;
            return ((Hero) obj).caste.equals(this.caste) &&
                    ((Hero) obj).name.equals(this.name);
        }else {
            return false;
        }
    }

    public abstract void takeWeapon(Weapon weapon);
}
