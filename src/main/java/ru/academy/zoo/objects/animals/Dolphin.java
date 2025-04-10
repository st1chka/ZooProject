package ru.academy.zoo.objects.animals;

import ru.academy.zoo.exceptions.AgeException;
import ru.academy.zoo.objects.Animal;
import ru.academy.zoo.objects.interfaces.Swimmeble;

public class Dolphin extends Animal implements Swimmeble {

    public Dolphin(String name_, int age_) throws AgeException {
        super(name_, age_);
    }

    @Override
    public void makeSoung() {
        System.out.println("РРРрррр");
    }


    @Override
    public boolean isSultWater() {
        return true;
    }
}
