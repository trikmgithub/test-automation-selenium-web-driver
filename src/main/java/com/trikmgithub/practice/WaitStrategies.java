/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trikmgithub.practice;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.apache.hc.core5.http.support.Expectation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Admin
 */
public class WaitStrategies {
    public static void waitStrategies(WebDriver driver) {
        
        /**
         * implicit wait
        driver.findElement(By.id("reveal")).click();
        driver.findElement(By.id("revealed")).sendKeys("I see you");
        
         * explicit wait
        WebElement textbox = driver.findElement(By.id("revealed"));
        driver.findElement(By.id("reveal")).click();
        
        var wait = new WebDriverWait(driver, Duration.ofSeconds(2)); //Explicit wait
        wait.until(ExpectedConditions.visibilityOf(textbox));
        
        textbox.sendKeys("I see you");
        
         * fluent wait
        driver.findElement(By.id("adder")).click();
        
        var wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class);
        
        WebElement box = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("box0")));
         */
        
        WebElement elementToRemove = driver.findElement(By.id("element-to-remove"));
        driver.findElement(By.id("buttonDelete")).click();

        var wait = new WebDriverWait(driver, Duration.ofMillis(5001));
        boolean removed = wait.until(
            ExpectedConditions.invisibilityOf(elementToRemove)
        );
        
        System.out.println("Removed: " + removed);
    }
}
