package com.course.tests.Day7TypesOfElements2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropdown {
@Test
    public void Test1(){

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://practice.cydeo.com/dropdown");
    WebElement dropDown= driver.findElement(By.id("dropdownMenuLink"));
    dropDown.click();
    List<WebElement> dropDownOptions=driver.findElements(By.className("dropdown-item"));
    for(WebElement option:dropDownOptions){
        System.out.println(option.getText());
    }
    dropDownOptions.get(2).click();

}
}
