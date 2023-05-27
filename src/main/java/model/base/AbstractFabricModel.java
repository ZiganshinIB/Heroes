package model.base;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class AbstractFabricModel {
    protected Set<Hero> heroes;

    public AbstractFabricModel(){
        heroes = new HashSet<>();
    }

    public abstract List<String> getAllType();

    public abstract Hero createModel (String type, String name);

    public abstract Boolean content(String type);

    public abstract Boolean content(String type, String name);

    public void addModel(Hero hero) {
        heroes.add(hero);
    }

}
