package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Horse extends Animal implements Rideable {

    private boolean hasBeenRidden = false;

    public void setHorseHasBeenRidden(boolean horseHasBeenRidden){
        this.hasBeenRidden = horseHasBeenRidden;
    }

    public boolean checkIfHorseHasBeenRidden(){
        return hasBeenRidden;
    }

    public String makeNoise() {
        return "Neigh";
    }

    public void eat(Edible edible) {

    }

    public ArrayList getStomachContents() {
        return new ArrayList();
    }
}
