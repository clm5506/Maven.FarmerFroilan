package com.zipcodewilmington.froilansfarm;

import java.util.List;

public class Farm {

    private Field field;
    private Stable stable;
    private ChickenCoop chickenCoops;
    private FarmHouse farmHouse;

    Farm(){
        this.field = new Field();
        populateField();
        this.chickenCoops = new ChickenCoop();
        populateChickenCoop();
    }
    public void populateField(){
        CropRow cropRow1= new CropRow();
        CornStalk cornStalk1 = new CornStalk();
        cropRow1.add(cornStalk1);

        CropRow cropRow2= new CropRow();
        TomatoPlant tomatoPlant2 = new TomatoPlant();
        cropRow2.add(tomatoPlant2);

        CropRow cropRow3= new CropRow();
        OtherVegetation otherVegetation = new OtherVegetation();
        cropRow3.add(otherVegetation);

        CropRow cropRow4= new CropRow();
        OtherVegetation otherVegetation4 = new OtherVegetation();
        cropRow3.add(otherVegetation);

        CropRow cropRow5= new CropRow();
        OtherVegetation otherVegetation5 = new OtherVegetation();
        cropRow3.add(otherVegetation);

        this.field.add(cropRow1);
        this.field.add(cropRow2);
        this.field.add(cropRow3);
        this.field.add(cropRow4);
        this.field.add(cropRow5);

    }
    public void populateChickenCoop(){

    }
    public void populateStable(){}
    public void populateVehicles(){}

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Stable getStable() {
        return stable;
    }

    public void setStable(Stable stable) {
        this.stable = stable;
    }

    public ChickenCoop getChickenCoops() {
        return chickenCoops;
    }

    public void setChickenCoops(ChickenCoop chickenCoops) {
        this.chickenCoops = chickenCoops;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }

}
