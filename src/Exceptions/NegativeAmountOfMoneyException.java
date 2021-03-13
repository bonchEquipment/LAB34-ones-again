package Exceptions;

public class NegativeAmountOfMoneyException extends Exception {
    public NegativeAmountOfMoneyException() {
        super("Ошибка, коллическтво денег не может быть отрицательным!");
    }
}
