package com.course.tests.Day2_basicLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameLocaterTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        WebElement nameInput= driver.findElement(By.name("full_name"));
        nameInput.sendKeys("Dorota Cakar");
        System.out.println(nameInput.getAttribute("value"));
        WebElement emailinput= driver.findElement(By.name("email"));
        emailinput.sendKeys("abc@gmail.com");
        System.out.println(emailinput.getAttribute("value"));
        WebElement signUp= driver.findElement(By.name("wooden_spoon"));
        signUp.click();
        driver.quit();

    }
}
