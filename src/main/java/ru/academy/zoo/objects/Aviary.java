package ru.academy.zoo.objects;

import ru.academy.zoo.exceptions.MaxCapacityException;

import java.util.Set;

public abstract class Aviary {
    protected final int maxCapacity;
    protected final Set<Animal> animals;

    protected Aviary(int maxCapacity, Set<Animal> animals) throws MaxCapacityException {
        if (maxCapacity < 0 || maxCapacity > 100) {
            this.maxCapacity = maxCapacity;
        } else {
            throw new MaxCapacityException(maxCapacity);
        }
        this.animals = animals;
    }
}
