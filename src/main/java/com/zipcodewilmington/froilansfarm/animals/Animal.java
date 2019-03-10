package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.people.NoiseMaker;
import com.zipcodewilmington.froilansfarm.produce.Edible;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements Eater, NoiseMaker {
    private List<Edible> stomachContents;

    public Animal() {
        this.stomachContents = new ArrayList<Edible>();
    }

    public abstract String makeNoise();

    public void eat(Edible edible) {
        this.stomachContents.add(edible);
    }

    public List getStomachContents() {
        return this.stomachContents;
    }



}
