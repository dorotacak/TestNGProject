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

public class PracticeClass {
    @Test
    public void Test1() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement dropDown = driver.findElement(By.className("form-control"));
        Select stateDropdown=new Select(dropDown);
        stateDropdown.selectByVisibleText("Sunday");
        String expectedOption="Sunday";
        String actualOption=stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedOption,actualOption);
        List<WebElement>dayOptions=stateDropdown.getOptions();

        int expectedOption1=8;
        int actualOption1= dayOptions.size();
        Assert.assertEquals(actualOption1,expectedOption1);
        String actualmessage=driver.findElement(By.className("selected-value")).getText();
        String expectedmessage="Day selected :- Sunday";
        Assert.assertEquals(actualmessage,expectedmessage);

        WebElement dropdown1=driver.findElement(By.id("multi-select"));
        Select countryDropdown=new Select(dropdown1);
        countryDropdown.selectByIndex(3);
        WebElement firstButton=driver.findElement(By.id("printMe"));
        firstButton.click();
        String actualmessage2=driver.findElement(By.className("getall-selected")).getText();
        String expectedmessage2="First selected option is : New York";
        Assert.assertEquals(actualmessage2,expectedmessage2);







    }
    @Test
    public void Test2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
       driver.findElement(By.id("check1")).click();
       Assert.assertEquals(driver.findElement(By.id("isChkd")).getAttribute("value"),"true");
    }
}