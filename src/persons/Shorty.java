package persons;

import clothes.*;

public abstract class Shorty extends Human {

    private Hat hat;
    private Outerwear outerwear;
    private Pants pants;
    private Footwear footwear;

    public Shorty() {
        super();
        System.out.println("Безликий человек был создан ");
    }

    public Shorty(String name) {
        super(name);
        System.out.println(name + " был создан ");
    }

    public Shorty(String name, State state, Location location) {
        super(name, state, location);
    }


    public void say(String phrase) {
        System.out.println(getName() + " сказал: \"" + phrase + "\"");
    }

    public Hat takeOfHat() {
        Hat fakeHat = hat;
        hat = null;
        System.out.println(getName() + " остался без головного убора ");
        return fakeHat;
    }

    public Outerwear takeOfOuterwear() {
        Outerwear fakeOuterwear = outerwear;
        outerwear = null;
        System.out.println(getName() + " остался без кофты");
        return fakeOuterwear;
    }

    public Pants takeOfPants() {
        Pants fakePants = pants;
        pants = null;
        System.out.println(getName() + " остался без штанов");
        return fakePants;
    }

    public Footwear takeOfFootwear() {
        Footwear fakeFootwear = footwear;
        footwear = null;
        System.out.println(getName() + " остался без обуви");
        return fakeFootwear;
    }

    public void setHat(Hat hat) {
        this.hat = hat;
    }

    public void setOuterwear(Outerwear outerwear) {
        this.outerwear = outerwear;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public void setFootwear(Footwear footwear) {
        this.footwear = footwear;
    }

    public Hat getHat() {
        return hat;
    }

    public Outerwear getOuterwear() {
        return outerwear;
    }

    public Pants getPants() {
        return pants;
    }

    public Footwear getFootwear() {
        return footwear;
    }

    public void toHaveHatDamaged() {
        if (hat == null) {
            System.out.println(getName() + " повредил бы свою шляпу... если бы она была на нем");
        } else {
            System.out.println("принадлежащая " + getName() + hat.takeDamage());
        }

    }


    public void toHaveOuterwearDamaged() {
        if (outerwear == null) {
            System.out.println(getName() + " повредил бы свою кофту... если бы она была на нем");
        } else {
            System.out.println("принадлежащая " + getName() + outerwear.takeDamage());
        }
    }

    public void toHavePantsDamaged() {
        if (pants == null) {
            System.out.println(getName() + " повредил бы свои штаны... если бы они были на нем");
        } else {
            System.out.println("Принадлежащие " + getName() + " " + pants.takeDamage());
        }
    }

    public void toHaveFootwearDamaged() {
        if (footwear == null) {
            System.out.println(getName() + " повредил бы свою обувь... если бы она была на нем");
        } else {
            System.out.println("принадлежащая " + getName() + footwear.takeDamage());
        }
    }
}



