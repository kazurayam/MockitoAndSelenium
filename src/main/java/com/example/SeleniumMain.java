package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumMain {

    private static final String CHROMEDRIVER_PATH = "C:\\Katalon_Studio_Windows_64-5.10.0\\configuration\\resources\\drivers\\chromedriver_win32\\chromedriver.exe";
    private static final String AUT_URL = "http://www.google.com";
    
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        
        driver.get(AUT_URL);
        
        WebElement q = driver.findElement(By.name("q"));
        q.sendKeys("selenium");
        q.submit();
        
        new WebDriverWait(driver, 10).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("selenium");
            }
        });
        
        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();
    }
}
