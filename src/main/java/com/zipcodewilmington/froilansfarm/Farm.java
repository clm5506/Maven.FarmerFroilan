package com.zipcodewilmington.froilansfarm;

import java.util.List;

public class Farm {

    private Field field;
    private Stable stableOne;
    private Stable stableTwo;
    private Stable stableThree;
    private ChickenCoop firstChickenCoop;
    private ChickenCoop secondChickenCoop;
    private ChickenCoop thirdChickenCoop;
    private ChickenCoop fourthChickenCoop;
    private CropRow firstCropRow;
    private CropRow secondCropRow;
    private CropRow thirdCropRow;
    private CropRow fourthCropRow;
    private CropRow fifthCropRow;
    private FarmHouse farmHouse;

    Farm() {
        this.field = new Field();
        this.firstChickenCoop = new ChickenCoop();
        this.secondChickenCoop = new ChickenCoop();
        this.thirdChickenCoop = new ChickenCoop();
        this.fourthChickenCoop = new ChickenCoop();
        this.firstCropRow = new CropRow();
        this.secondCropRow = new CropRow();
        this.thirdCropRow = new CropRow();
        this.fourthCropRow = new CropRow();
        this.fifthCropRow = new CropRow();
        this.stableOne = new Stable();
        this.stableTwo = new Stable();
        this.stableThree = new Stable();
        populateField();
        populateChickenCoop();
        populateStables();
    }

    public void populateField() {

        firstCropRow.add(new CornStalk());
        secondCropRow.add(new TomatoPlant());
        thirdCropRow.add(new OtherVegetation());
        fourthCropRow.add(new OtherVegetation());
        fifthCropRow.add(new OtherVegetation());

        this.field.add(firstCropRow);
        this.field.add(secondCropRow);
        this.field.add(thirdCropRow);
        this.field.add(fourthCropRow);
        this.field.add(fifthCropRow);
    }

    public void populateChickenCoop() {
        for (int i = 0; i < 4; i++) {
            firstChickenCoop.add(AnimalFactory.createChicken());
            secondChickenCoop.add(AnimalFactory.createChicken());
            thirdChickenCoop.add(AnimalFactory.createChicken());
        }
        for (int i = 0; i < 3; i++) {
            fourthChickenCoop.add(AnimalFactory.createChicken());
        }
    }

    public void populateStables() {
        for(int i = 0; i < 3; i++){
           stableOne.add(new Horse());
           stableTwo.add(new Horse());
           stableThree.add(new Horse());
        }
           stableThree.add(new Horse());
    }

    public void populateVehicles() {
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Stable getStableOne() {
        return stableOne;
    }

    public Stable getStableTwo(){
        return stableTwo;
    }

    public Stable getStableThree(){
        return stableThree;
    }
    public FarmHouse getFarmHouse() {
        return farmHouse;
    }
    public ChickenCoop getFirstChickenCoop(){
        return firstChickenCoop;
    }
    public ChickenCoop getSecondChickenCoop(){
        return secondChickenCoop;
    }
    public ChickenCoop getThirdChickenCoop(){
        return thirdChickenCoop;
    }
    public ChickenCoop getFourthChickenCoop(){
        return fourthChickenCoop;
    }

}


