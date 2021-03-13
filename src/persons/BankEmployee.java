package persons;

import clothes.*;

public class BankEmployee extends Shorty {

    public BankEmployee(String name, State state, Location location) {
        super(name, state, location);
        setHat(new Hat(Condition.INTACT, Affiliation.BANK));
        setOuterwear(new Outerwear(Condition.INTACT, Affiliation.BANK));
        setPants(new Pants(Condition.INTACT, Affiliation.BANK));
        setFootwear(new Footwear(Condition.INTACT, Affiliation.BANK));
        System.out.println("Банковский работник " + name + " был создан");
    }

    @Override
    public void say(String phrase) {
        System.out.print("Банковский работник ");
        super.say(phrase);
    }

    public void reportARobbery() {
        System.out.println("Банковский работник " + getName() + " сообщает об ограблении");
    }
}
