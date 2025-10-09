/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trikmgithub.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author Admin
 */
public class DetectingElementState {
    public static void detectingElementState(WebDriver driver) {
        
        /**
        boolean isVisible = driver.findElement(By.name("my-hidden")).isDisplayed();
        boolean isEnable = driver.findElement(By.name("my-disabled")).isEnabled();

        */
        
        WebElement box = driver.findElement(By.id("box"));
        
        if (box.isDisplayed()) {
            box.click();
        } else {
            System.out.println("box is not visible");
        }
        
        driver.quit();
        
        
    }
}
