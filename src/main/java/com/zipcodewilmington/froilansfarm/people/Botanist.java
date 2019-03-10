package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.produce.Crop;
import com.zipcodewilmington.froilansfarm.produce.CropRow;

public interface Botanist {
    public void plant(Crop crop, CropRow cropRow);
}
