package model.base;

import model.Magic;

public class HeroFactory {
    public Hero createHero (HeroType type) {
        Hero convert = null;

        switch (type) {
            case Mag:
                convert = new Magic();
                break;
        }
        return convert;
    }
}
