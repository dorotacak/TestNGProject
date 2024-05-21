package com.course.tests.Day11Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LogOut {
    @Test

    public void logOut() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa.azulcrm.com/auth/?backurl=%2Fstream%2F");
        driver.manage().window().maximize();

        driver.findElement(By.name("USER_LOGIN")).sendKeys("hr11@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        driver.findElement(By.className("login-btn")).click();
        driver.findElement(By.id("user-name")).click();
        driver.findElement(By.xpath("//*[text()='Log out']")).click();
        String actualMessage = driver.findElement(By.className("log-popup-header")).getText();//actualne, to co jest na www
        String expectedMessage = "Authorization";

    }

    @Test
    public void getOptions() {
        List<String> expectedOptions = Arrays.asList("My Profile",
                "Edit Profile Settings",
                "Themes",
                "Configure notifications",
                "Log out");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa.azulcrm.com/auth/?backurl=%2Fstream%2F");
        driver.manage().window().maximize();

        driver.findElement(By.name("USER_LOGIN")).sendKeys("hr11@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        driver.findElement(By.className("login-btn")).click();
        List<WebElement> menuOptions = driver.findElements(By.className("menu-popup-item-text"));

        for (WebElement option : menuOptions) {
            Assert.assertEquals(option.getText(), expectedOptions);

        }

    }

    @Test

    public void fiveTabs() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa.azulcrm.com/auth/?backurl=%2Fstream%2F");
        driver.manage().window().maximize();

        driver.findElement(By.name("USER_LOGIN")).sendKeys("hr11@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        driver.findElement(By.className("login-btn")).click();
        driver.findElement(By.id("user-name")).click();
        driver.findElement(By.xpath("//*[text()='My Profile']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='General']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Drive\t\t\t\t\t\t']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Tasks\t\t\t\t\t\t']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Calendar\t\t\t\t\t\t']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Conversations\t\t\t\t\t\t']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("(//a[text()='hr11@cybertekschool.com'])[2]")).isDisplayed());

    }

    @Test

    public void possitiveScenarioSendingMessage() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa.azulcrm.com/auth/?backurl=%2Fstream%2F");
        driver.manage().window().maximize();

        driver.findElement(By.name("USER_LOGIN")).sendKeys("hr11@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        driver.findElement(By.className("login-btn")).click();
        driver.findElement(By.xpath("//*[text()='Message']")).click();
        Thread.sleep(3000);
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Hello");
        WebElement element = driver.findElement(By.id("blog-submit-button-save"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        String actualMessage = driver.findElement(By.id("blog_post_body_3597")).getText();
        Assert.assertEquals(actualMessage, "Hello");


    }

    @Test

    public void employees() throws InterruptedException {
        List<String> expectedOptions = Arrays.asList( "Company Structure",
                "Find Employee","Telephone Directory","Staff Changes","Efficiency Report", "Honored Employees","Birthdays","New page");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa.azulcrm.com/auth/?backurl=%2Fstream%2F");
        driver.manage().window().maximize();

        driver.findElement(By.name("USER_LOGIN")).sendKeys("hr11@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        driver.findElement(By.className("login-btn")).click();
        driver.findElement(By.xpath("(//*[@class='menu-item-link-text'])[10]")).click();
        List<WebElement>modules = driver.findElements(By.className("main-buttons-item-text-title"));
        for (WebElement module : modules) {//wpisuję iter i 3x enter żeby potwierdzić nazwę modułu, sam się tworzy for...
            Assert.assertTrue(module.getText().equals(expectedOptions));//czy module-bo to jest nazwa for...reprezentująca modules, jest taki
            //sam jak List, a expectedOptions to nazwa listy


        }

    }
}
