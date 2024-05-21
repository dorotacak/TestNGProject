package com.course.tests.FileUpload;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUpload {
    @Test
    public void fileUpload(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");//upload!!!!!!
        driver.manage().window().maximize();

        WebElement chooseFile=driver.findElement(By.id("file-upload"));

        chooseFile .sendKeys("C:\\Users\\Ali\\Desktop\\Nowy dokument tekstowy.txt");

        driver.findElement(By.id("file-submit")).click(); //upload button

        String actualFileName= driver.findElement(By.id("uploaded-files")).getText();
        String expectedFileName="Nowy dokument tekstowy.txt";
        Assert.assertEquals(actualFileName,expectedFileName);





    }


}
