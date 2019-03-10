package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.vehicles.Rideable;

public class Horse extends Animal implements Rideable {

    private boolean hasBeenRidden = false;

    public String makeNoise() {
        return "Neigh";
    }

    public void setRideStatus(boolean horseHasBeenRidden) {
        this.hasBeenRidden = horseHasBeenRidden;
    }

    public boolean getRideStatus() {
       return this.hasBeenRidden;
    }
}
