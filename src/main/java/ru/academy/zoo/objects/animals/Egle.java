package ru.academy.zoo.objects.animals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.academy.zoo.exceptions.AgeException;
import ru.academy.zoo.objects.Animal;
import ru.academy.zoo.objects.interfaces.Flyable;

public class Egle extends Animal implements Flyable {

    private static final Logger log = LogManager.getLogger(Egle.class);

    public Egle(String name_, int age_) throws AgeException {
        super(name_, age_);
    }

    @Override
    public void makeSoung() {
        System.out.println("Карррр");
    }

    @Override
    public boolean isBigBird() {
        return true;
    }

    @Override
    public void fly() {
        log.info("Орел с именем {} летит", getName());
    }
}
