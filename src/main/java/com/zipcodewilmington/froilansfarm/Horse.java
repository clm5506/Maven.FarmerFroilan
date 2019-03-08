package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Horse extends Animal implements Rideable {

    private boolean hasBeenRidden = false;

    public String makeNoise() {
        return "Neigh";
    }

    public void eat(Edible edible) {
    }

    public List getStomachContents() {
        return new ArrayList();
    }

    public void setRideStatus(boolean horseHasBeenRidden) {
        this.hasBeenRidden = horseHasBeenRidden;
    }

    public boolean getRideStatus() {
       return this.hasBeenRidden;
    }
}
