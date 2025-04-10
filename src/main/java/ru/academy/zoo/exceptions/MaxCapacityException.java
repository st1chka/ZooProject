package ru.academy.zoo.exceptions;

public class MaxCapacityException extends Throwable {
    public MaxCapacityException(int maxCapacity) {
        super("Ошибка: количество животных вышло за промежуток 0 - 100 {0}");
    }
}
