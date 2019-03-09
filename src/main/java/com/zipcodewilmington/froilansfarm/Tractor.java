package com.zipcodewilmington.froilansfarm;

public class Tractor extends FarmVehicle {
    public void harvest(CropRow cropRow) {

        Field field = new Field();
        field.fieldCropRow.add(cropRow);

        field.fieldCropRow.remove(cropRow);
    }
}
