package Exceptions;

public class WrongComparisonException extends RuntimeException {
    public WrongComparisonException() {
        super("Ошибка, попытка сравнить горячие с серым!");
    }
}
