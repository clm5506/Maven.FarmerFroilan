package com.zipcodewilmington.froilansfarm;

public class CropDuster extends FarmVehicle implements Aircraft {
    public String makeNoise() {

        return "Woooosh";
    }

    public void fertilize(CropRow cropRow) {
        cropRow.setHasFertilized(true);
    }

    public void fly(Field field) {
        field.setFlyOverTheField(true);
    }
}
