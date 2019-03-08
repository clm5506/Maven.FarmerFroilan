package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FarmerTest {

    @Test
    public void testMakeNoise(){
        Farmer testFarmer = new Farmer();
        String expected = "Ey aye ey aye oh";

        Assert.assertEquals(expected, testFarmer.makeNoise());
    }

    @Test
    public void testEat(){
        //Given
        Farmer testFarmer = new Farmer();
        Tomato edibleTomato = new Tomato();
        //When
        testFarmer.eat(edibleTomato);
        List fakeStomach = new ArrayList<Edible>();
        fakeStomach.add(edibleTomato);
        //Then
        Assert.assertEquals(fakeStomach, testFarmer.getStomachContents());
    }

    @Test
    public void testMount(){
        //Given
        Farmer testFarmer = new Farmer();
        Horse testHorse = new Horse();
        //When
        testFarmer.mount(testHorse);
        //Then
        Assert.assertTrue(testHorse.getRideStatus());
    }

    @Test
    public void testUnmount(){
        //Given
        Farmer testFarmer = new Farmer();
        Horse testHorse = new Horse();

        //When
        testFarmer.unmount(testHorse);

        //Then
        Assert.assertFalse(testHorse.getRideStatus());
    }

    @Test
    public void testPlant(){
        //Given
        Farmer testFarmer = new Farmer();
        CornStalk cs = new CornStalk();
        CropRow cropRow = new CropRow();
        List fakeCropRow = new ArrayList<Crop>();
        fakeCropRow.add(cs);

        //When
        testFarmer.plant(cs, cropRow);

        //Then
        Assert.assertEquals(fakeCropRow, cropRow.getList());
    }

}
