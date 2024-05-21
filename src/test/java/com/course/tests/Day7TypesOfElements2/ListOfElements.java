package com.course.tests.Day7TypesOfElements2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElements {
    @Test
    public void Test1() {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        List<WebElement> buttons=driver.findElements(By.tagName("button"));
        System.out.println(buttons.get(5).getText());
        System.out.println(buttons.size());
        //verify we have 6 buttons
        Assert.assertEquals(buttons.size(),6);
        // loop for each button, we can implement selenium methods
        for ( WebElement button: buttons){
            Assert.assertTrue(button.isDisplayed());
        }
        buttons.get(1).click();
    }
}