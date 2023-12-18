package com.course.tests.Day6TypesOfElement1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AtributeTest {
    @Test
    public void Test1() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/radio_buttons");
        WebElement yellowButton=driver.findElement(By.id("yellow"));
        System.out.println(yellowButton.getAttribute("type"));
        System.out.println(yellowButton.getAttribute("name"));
        System.out.println(yellowButton.getAttribute("id"));//atribut ktory widze po inspekcji
    }
}
