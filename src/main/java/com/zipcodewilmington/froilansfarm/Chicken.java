package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Chicken extends Animal implements Produce {
    public Egg yield() {
       return new Egg();
    }

    public String makeNoise() {
        return null;
    }

    public void eat(Edible edible) {

    }

    public ArrayList getStomachContents() {
        return null;
    }
}
