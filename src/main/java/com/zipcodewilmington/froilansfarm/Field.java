package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Field extends Container<CropRow> {
    public List<CropRow> fieldCropRow;

    private boolean flyOverTheField = false;

    public Field(){
        fieldCropRow = new ArrayList<CropRow>();
    }
    public List<CropRow> getFieldCropRow() {
        return fieldCropRow;
    }

    public void setFieldCropRow(List<CropRow> fieldCropRow) {
        this.fieldCropRow = fieldCropRow;
    }
    public boolean getFlyOverTheField() {
        return flyOverTheField;
    }

    public void setFlyOverTheField(boolean flyOverTheField) {
        this.flyOverTheField = flyOverTheField;
    }

}
