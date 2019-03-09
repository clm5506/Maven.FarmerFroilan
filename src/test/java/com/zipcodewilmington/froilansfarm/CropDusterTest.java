package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CropDusterTest {

    @Test
    public void testmakeNoise() {
        //Given
        CropDuster cropDuster = new CropDuster();
        String expectedResult ="Woooosh";

        //When
        String actualResult = cropDuster.makeNoise();

        //Then
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testfertilize() {
    }

    @Test
    public void testfly() {
    }
}