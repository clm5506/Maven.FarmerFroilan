package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public abstract class Animal implements Eater, NoiseMaker {
    public abstract String makeNoise();
    public abstract void eat(Edible edible);
    public abstract ArrayList getStomachContents();
}
