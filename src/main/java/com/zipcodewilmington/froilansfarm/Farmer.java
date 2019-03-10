package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Farmer extends Person implements Rider, Botanist {
    boolean hasRodeAllHorses;

    Farm farm;

    public Farmer(){
       farm = new Farm();
    }

    public Farm getFarm(){
        return this.farm;
    }

    public void plant(Crop crop, CropRow cropRow) {
            cropRow.add(crop);
    }

    public void mount(Rideable rideable) {
        rideable.setRideStatus(true);
    }

    public void unmount(Rideable rideable) {

    }


    public void doMorningChores(Farm farm) {
        ArrayList<Horse> horses = farm.getHorses();

        for(Horse h : horses){
            mount(h);
            unmount(h);
            h.eat(new EarCorn());
            h.eat(new EarCorn());
            h.eat(new EarCorn());
        }
        eatBreakfast();
    }

    public void eatBreakfast() {
        eat(new EarCorn());
        eat(new Tomato());
        eat(new Tomato());
        for(int i = 0; i < 5; i++) {
            eat(new Egg());
        }
    }

    public String makeNoise() {
        return "Ey aye ey aye oh";
    }
}
