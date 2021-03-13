package persons;

import clothes.*;
import guns.*;

public class Policeman extends Shorty {

    private Gun gun;


    public Policeman(String name, State state, Gun gun, Location location) {
        super(name, state, location);
        this.gun = gun;
        setHat(new Hat(Condition.INTACT, Affiliation.POLICE));
        setOuterwear(new Outerwear(Condition.INTACT, Affiliation.POLICE));
        setPants(new Pants(Condition.INTACT, Affiliation.POLICE));
        setFootwear(new Footwear(Condition.INTACT, Affiliation.POLICE));
        System.out.println("Полицейский " + name + " был создан");
    }


    public void shoot(Target target) {
        if (!(gun == null)) {
            System.out.print("Бравый полицейский " + getName() + " совершил выстрел, ");
            gun.shoot(target);
        } else {
            System.out.println(getName() + " попытался выстрелить, но оружия под рукой не оказалось");
        }


    }

    @Override
    public void changeLocation(Location location) {
        System.out.print("Полицейский ");
        super.changeLocation(location);
    }

    @Override
    public void say(String phrase) {
        System.out.print("Полицейский ");
        super.say(phrase);
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }
}