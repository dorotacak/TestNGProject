package com.course.tests.Day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
        // close the current window/tab
        driver.close();
        driver.get("https://www.saucedemo.com/");
        //close all the tabs
        driver.quit();
    }
}
