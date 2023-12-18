package com.course.tests.Day5_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionDemo {
    @Test
    public void firstAssertions(){
        System.out.println("first assertion");
        Assert.assertEquals(1,5,"sayilar birbirine esit degil");

    }
    @Test
    public void secondAssertions(){//pierwszy sposob
        System.out.println("second assertion");
        Assert.assertEquals("blue","blue","colors are different");
    }
    @Test//drugi sposob
    public void thirdAssertions(){
        String actualText="Dorota";
        String expectedText="Hakan";
        Assert.assertEquals(actualText,expectedText);
    }
}
