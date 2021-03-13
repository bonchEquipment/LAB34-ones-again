package organisations;

import static java.lang.Math.*;

public class Bank {

    private final String name; //нужно будет назвать банк СПБ

    private float amountOfMoney;

    private final String address;

    public Bank(String name, float amountOfMoney, String address) {
        this.name = name;
        this.amountOfMoney = abs(amountOfMoney);
        this.address = address;
        System.out.println("Банк " + name + " был создан и помещен по адресу " + address +
                ". Теперь на его счету кругленькая сумма");
    }

    public float beRobbed(float amountOfMoney) {
        if (amountOfMoney < 0) {
            throw new NegativeArraySizeException();
        } else if (this.amountOfMoney < amountOfMoney) {
            System.out.println("Из банка " + name + " были украдены все деньги! " +
                    "(а именно " + (int) this.amountOfMoney + ")");
            float temporaryVariable = this.amountOfMoney;
            this.amountOfMoney = 0;
            return temporaryVariable;
        } else {
            System.out.println("Из банка " + name + "было украдено " + (int) amountOfMoney + " фертингов");
            return amountOfMoney;
        }
    }

    public void depositMoney(float amount) {
        if (amount < 0) {
            throw new NegativeArraySizeException();
        } else {
            amountOfMoney += amount;
            System.out.println("На счет банка " + name + " поступило " + amount + " фертингов");
        }

    }

    public String getName() {
        return name;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public String getAddress() {
        return address;
    }
}
