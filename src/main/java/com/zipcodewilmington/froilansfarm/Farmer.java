package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Farmer extends Person implements Rider, Botanist {

    public void plant(Crop crop, CropRow cropRow) {
            cropRow.add(crop);
    }

    public void mount(Rideable rideable) {
        rideable.setRideStatus(true);
    }

    public void unmount(Rideable rideable) {
        rideable.setRideStatus(false);
    }

@Override
    public String makeNoise() {
        return "Ey aye ey aye oh";
    }
}
