package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

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
        //Then
        Assert.assertEquals(edibleTomato, testFarmer.getStomachContents());
    }

    @Test
    public void testMount(){
        //Given
        Farmer testFarmer = new Farmer();
        Horse testHorse = new Horse();
        //When
        testFarmer.mount(testHorse);
        //Then
        

    }

}
