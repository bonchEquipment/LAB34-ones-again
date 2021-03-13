package persons;

import clothes.*;
import guns.*;
import organisations.Bank;

import static java.lang.StrictMath.abs;


public class Robber extends Shorty {

    private Gun gun;
    private float stolenMoney;

    public Robber(String name, State state, Gun gun, Location location) {
        super(name, state, location);
        this.gun = gun;
        setHat(new Hat(Condition.INTACT, Affiliation.BANDIT));
        setOuterwear(new Outerwear(Condition.INTACT, Affiliation.BANDIT));
        setPants(new Pants(Condition.INTACT, Affiliation.BANDIT));
        setFootwear(new Footwear(Condition.INTACT, Affiliation.BANDIT));
        System.out.println("Грабитель " + name + " был создан");
    }

    public void shoot(Target target) {
        System.out.print("Бандит " + getName() + " совершил подлый выстрел, ");
        gun.shoot(target);
    }

    public void changeClothesToPolice() {
        setHat(new Hat(Condition.INTACT, Affiliation.POLICE));
        setOuterwear(new Outerwear(Condition.INTACT, Affiliation.POLICE));
        setPants(new Pants(Condition.INTACT, Affiliation.POLICE));
        setFootwear(new Footwear(Condition.INTACT, Affiliation.POLICE));
        System.out.println("Бандит " + getName() + " переоделся в полицейского ");
    }

    public void robABank(Bank bank, float lootAmount) {
        try {
            stolenMoney = bank.beRobbed(lootAmount);
        } catch (NegativeArraySizeException e) {
            System.out.println("Бандит " + getName() + " хотел \"украст\" у банка " + lootAmount +
                    "фертингов, но потом подумал получше и решил украсть " + abs(lootAmount));
            stolenMoney = bank.beRobbed(abs(lootAmount));
        }

    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    @Override
    public void changeLocation(Location location) {
        System.out.print("Грабитель ");
        super.changeLocation(location);
    }

    @Override
    public void say(String phrase) {
        System.out.print("Грабитель ");
        super.say(phrase);
    }

}
