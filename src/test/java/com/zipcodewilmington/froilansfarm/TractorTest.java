package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TractorTest {

    @Test
    public void testharvest() {
        //Given
        Tractor tractor = new Tractor();
        CropRow cropRow= new CropRow();
        Tomato tomato = new Tomato();
        cropRow.add(tomato);
       Field field = new Field();

        int expectedSize =0;

        //When
        tractor.harvest(cropRow);
        int actualSize = field.fieldCropRow.size();

        //Then
        Assert.assertEquals(expectedSize,actualSize);
    }
}