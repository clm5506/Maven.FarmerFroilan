package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;
import sun.swing.BakedArrayList;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FarmTest {
    @Test
    public void testgetField(){
        //Given
        Farm farm = new Farm();

        //When
        int actualResult = farm.getField().size();

        //Then
        Assert.assertEquals(5,actualResult);
    }

}