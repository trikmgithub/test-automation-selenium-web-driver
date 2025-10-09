/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trikmgithub.practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

/**
 *
 * @author Admin
 */

public class LocatingWebElements {
    public static void findElements (WebDriver driver) {
        //id
        WebElement useID = driver.findElement(By.id("email"));
        System.out.println(">>>id: " + useID);
        
        //name
        WebElement useName = driver.findElement(By.name("image"));
        System.out.println(">>>name: " + useName);
        
        //class
        WebElement useClass = driver.findElement(By.className("inputLabel"));
        System.out.println(">>>class: " + useClass);
        
        //css selector
        WebElement useCSSSelector = driver.findElement(By.cssSelector("form input[type='email']"));
        System.out.println(">>>CSS selector: " + useCSSSelector);
        
        //tag name
        List<WebElement> useTagName = driver.findElements(By.tagName("form"));
        System.out.println(">>>Tag name: " + useTagName);
        
        //Link text
//        WebElement useLinkText = driver.findElement(By.linkText("link"));

        //relative locator: near, above, left, below, right
        WebElement useRelativeLocator = driver.findElement(RelativeLocator.with(By.name("submit")).below(By.id("submit")));
        System.out.println(">>>Relative locator: " + useRelativeLocator);
        
    }
}
