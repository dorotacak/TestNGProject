package com.course.tests.Day7TypesOfElements2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropDown {
    @Test
    public void Test1() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/dropdown");
        WebElement dropDown = driver.findElement(By.id("state"));
        //create Select object by passing the our element
        Select stateDropdown=new Select(dropDown);
        // getOptions()--> returns all the avaliable options from dropdown list
        List<WebElement> options=stateDropdown.getOptions();
        System.out.println(options.size());
        System.out.println(options.get(51).getText());
        //how to select options from dropdown
        //1.select using visible text
        stateDropdown.selectByVisibleText("Florida");
        String expectedOption="Florida";
        String actualOption=stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedOption,actualOption);
        Thread.sleep(3000);
        //2. select using index number
        stateDropdown.selectByIndex(3);
        String expectedOption1="Arizona";
        String actualOption1=stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedOption1,actualOption1);
        //3. select by value
        stateDropdown.selectByValue("CO");
        String expectedOption2="Colorado";
        String actualOption2=stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedOption2,actualOption2);







    }
}