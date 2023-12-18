package com.course.tests.Day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();//1 krok
        WebDriver driver=new ChromeDriver();// 2 krok
        driver.get("https://www.amazon.com/");//3 krok
        Thread.sleep(2000);

        //WebDriverManager.edgedriver().setup();
        //WebDriver driver1=new EdgeDriver();
        //driver1.get("https://www.facebook.com/?locale=pl_PL");

        driver.navigate().to("https://www.facebook.com/?locale=pl_PL");
        Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();



    }
}
