package ru.academy.zoo.objects.animals;

import ru.academy.zoo.exceptions.AgeException;
import ru.academy.zoo.objects.Animal;
import ru.academy.zoo.objects.interfaces.Dangerous;

public class Lion extends Animal implements Dangerous {

    public Lion(String name_, int age_) throws AgeException {
        super(name_, age_);
    }

    @Override
    public void makeSoung() {
        System.out.println("РРРрррр");
    }

    // Уровень опасности по 10 бальной шкале
    @Override
    public int dangerLevel() {
        return 10;
    }
}
