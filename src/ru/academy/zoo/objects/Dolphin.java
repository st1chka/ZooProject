package ru.academy.zoo.objects;

import ru.academy.zoo.exceptions.AgeException;

public class Dolphin extends Animal implements Swimmeble{

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
