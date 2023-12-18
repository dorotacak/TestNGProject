package com.course.tests.Day10;

import org.testng.annotations.*;

public class BeforeAfterTest {
    @Test
    public void Test1() {//TO JEST METODA TEST1,2,3
        System.out.println("This is my Test1");

    }

    @Test
    public void Test2() {
        System.out.println("This is my Test2");

    }

    @Test
    public void Test3() {
        System.out.println("This is my Test3");
    }
    @BeforeMethod
    public void setUp(){
        // WebDriver
        System.out.println("BEFORE METHOD HERE");
        System.out.println("WebDriver part here");

    }
    @AfterMethod
    public void tearDown(){
        // close, quit
        System.out.println("AFTER METHOD HERE");
        System.out.println("Driver quit");
    }
    @BeforeClass
    public void setUpClass(){
        System.out.println("----BEFORE CLASS---");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("-----AFTER CLASS----");
    }
}


