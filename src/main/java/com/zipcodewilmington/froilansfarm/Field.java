package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Field extends Container {
    public List<CropRow> fieldCropRow;
    public Field(){
        fieldCropRow = new ArrayList<CropRow>();
    }
}
