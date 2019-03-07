package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal implements Produce {
    public Egg yield() {
       return new Egg();
    }
}
