package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Horse extends Animal implements Rideable {

    boolean hasBeenRidden = false;

    public String makeNoise() {
        return "Neigh";
    }

    public void eat(Edible edible) {

    }

    public ArrayList getStomachContents() {
        return new ArrayList();
    }
}
