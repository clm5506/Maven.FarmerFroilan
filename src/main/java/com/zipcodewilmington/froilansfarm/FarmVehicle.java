package com.zipcodewilmington.froilansfarm;

public class FarmVehicle implements Vehicle {

    private boolean hasBeenRidden = false;

    public void operate(Farm farm) {
    }

    public String makeNoise() {
        return "Beep Beep";
    }

    public void setRideStatus(boolean hasBeenRidden) {
    this.hasBeenRidden = hasBeenRidden;
    }

    public boolean getRideStatus() {
        return this.hasBeenRidden;
    }
}
