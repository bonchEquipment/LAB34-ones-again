package run;

import guns.*;
import persons.*;
import organisations.*;

import java.util.ArrayList;

public class Story {
    public void tellStory() {
        ArrayList<Policeman> policeDepartment = new ArrayList<>();
        ArrayList<Robber> band = new ArrayList<>();
        Bank bank = new Bank("Банк СПБ", 10_000_000, "Санкт-Петербург, Малоохтинский проспект, 64A");
        slowDownStoryForABit(1000);
        Newspaper newspaper = new Newspaper("The New York Times");
        policeDepartment.add(new Policeman("Фигль", State.HEALTHY, new Rifle(), Location.POLICE_STATION));
        slowDownStoryForABit(500);
        policeDepartment.add(new Policeman("Шамиль", State.HEALTHY, new Rifle(), Location.POLICE_STATION));
        slowDownStoryForABit(500);
        policeDepartment.add(new Policeman("Сигель", State.HEALTHY, new Rifle(), Location.POLICE_STATION));
        slowDownStoryForABit(500);
        band.add(new Robber("Гигель", State.HEALTHY, new HandGun(), Location.BANDIT_LAIR));
        slowDownStoryForABit(500);
        band.add(new Robber("Пнигель", State.HEALTHY, new HandGun(), Location.BANDIT_LAIR));
        slowDownStoryForABit(500);
        band.add(new Robber("Скригль", State.HEALTHY, new HandGun() {
            private final String model = "Walther P5";
        }, Location.BANDIT_LAIR));
        slowDownStoryForABit(500);
        BankEmployee bankEmployee = new BankEmployee("Steve", State.HEALTHY, Location.BANK);
        System.out.println("----------------------------------------------");
        slowDownStoryForABit(1000);
        band.get(0).say("Ну что жe, давайте же ограбим банк!");
        slowDownStoryForABit(400);
        for (Robber robber : band) {
            slowDownStoryForABit(950);
            robber.changeClothesToPolice();
        }
        for (Robber robber : band) {
            slowDownStoryForABit(750);
            robber.changeLocation(Location.BANK);
            slowDownStoryForABit(750);
        }
        bankEmployee.reportARobbery();
        slowDownStoryForABit(1200);
        policeDepartment.get(0).say("Ограбление по адресу " + bank.getAddress() + " выезжаем!");
        for (Robber robber : band) {
            slowDownStoryForABit(850);
            robber.robABank(bank, 100_000);
        }
        for (Policeman policeman : policeDepartment) {
            slowDownStoryForABit(750);
            policeman.changeLocation(Location.BANK);
        }
        slowDownStoryForABit(1000);
        policeDepartment.get(1).say("Сдавайтесь, вы окружены!");
        slowDownStoryForABit(1500);
        band.get(1).say("Черта с два!");
        slowDownStoryForABit(1400);
        band.get(2).shoot(policeDepartment.get(1));
        slowDownStoryForABit(1400);
        policeDepartment.get(2).shoot(band.get(2));
        slowDownStoryForABit(1400);
        policeDepartment.get(2).shoot(band.get(1));
        slowDownStoryForABit(1400);
        band.get(1).shoot(policeDepartment.get(0));
        slowDownStoryForABit(1400);
        policeDepartment.get(0).toHavePantsDamaged();
        slowDownStoryForABit(1400);
        policeDepartment.get(0).takeOfHat();
        slowDownStoryForABit(1400);
        band.get(0).say("уезжаем, срочно");
        for (Robber robber : band) {
            slowDownStoryForABit(500);
            robber.changeLocation(Location.BANDIT_LAIR);
            slowDownStoryForABit(500);
        }
        slowDownStoryForABit(1750);
        newspaper.publishNews();


    }

    private void slowDownStoryForABit(long time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            //this will never happen
        }
    }
}
