package model.base;

import model.Archer;
import model.Magic;

import java.util.*;

public class HeroFactory extends AbstractFabricModel {
    public HeroFactory(){
        super();
    }
    public Hero createModel(String type, String name) {
        if (heroes.isEmpty() || !content(type, name))
                return create(HeroType.valueOf(type),name);
        return null;
    }

    private Hero create(HeroType type, String name){
        switch (type) {
            case Mag:
                return new Magic(name);
            case Archer:
                return new Archer(name);
            default:
                System.out.println("Таких персоножей нет");
                return null;
        }
    }


    @Override
    public List<String> getAllType() {
        List<String> nameType = new ArrayList<>();
        for (HeroType type: HeroType.values()) {
            nameType.add(type.toString());
        }
        return nameType;
    }

    @Override
    public Boolean content(String type) {
        try {HeroType.valueOf(type);}
        catch (IllegalArgumentException ex){return false;}
        return true;
    }

    @Override
    public Boolean content(String type, String name) {
        return heroes.contains(create(HeroType.valueOf(type), name));
    }
}
