package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.produce.Egg;
import com.zipcodewilmington.froilansfarm.produce.Produce;

public class Chicken extends Animal implements Produce {

    public Egg yield() {
       return new Egg();
    }

    public String makeNoise() {
        return "Bawk Bawk";
    }

}
