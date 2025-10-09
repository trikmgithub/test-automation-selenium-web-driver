/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trikmgithub.practice;

import java.nio.file.Paths;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Admin
 */
public class InteractingWithWebElements {
    
    public static void interactingWithWebElements(WebDriver driver) {
        
        /** 
        >>>>> Check boxes
        WebElement checkbox = driver.findElement(By.id("my-check-1"));
        
        if (checkbox.isSelected()) {
            checkbox.click();
        }
        */
        
        /**
        >>>>> Drop-down menus
        Select dropdown = new Select(driver.findElement(By.name("my-select")));
        dropdown.selectByValue("2"); //nên dùng vì value ít thay đổi
        dropdown.selectByContainsVisibleText("Three");
        dropdown.selectByIndex(1);
        
        WebElement selectedOption = dropdown.getFirstSelectedOption(); // selectedOption.getText()
        List<WebElement> selectedOptions = dropdown.getAllSelectedOptions();
         
        dropdown.deselectedByValue("2");
        dropdown.deselectedByVisibleText("One");
        dropdown.deselectedByIndex(1);
        */
        
        /**
        >>>>> File uploads
        String filePath = Paths.get("Resources", "file.txt").toAbsolutePath().toString();
        WebElement uploadElement = driver.findElement(By.name("my-file"));
        uploadElement.sendKeys(filePath);
        */
        
        // ===== Nhập dữ liệu vào các trường =====
        // Nhập text vào input text
        driver.findElement(By.id("my-text-id")).sendKeys("username");

        // Nhập password
        driver.findElement(By.name("my-password")).sendKeys("passw0rd");

        // Nhập nội dung vào textarea
        driver.findElement(By.name("my-textarea")).sendKeys("I am learning Selenium WebDriver");

        // ===== Chọn giá trị trong dropdown =====
        Select dropdown = new Select(driver.findElement(By.name("my-select")));
        dropdown.selectByValue("3");

        // ===== Bỏ chọn checkbox nếu đang chọn =====
        WebElement checkedCheckbox = driver.findElement(By.id("my-check-1"));
        if (checkedCheckbox.isSelected()) {
            checkedCheckbox.click();
        }

        // ===== Chọn checkbox nếu chưa được chọn =====
        WebElement defaultCheckbox = driver.findElement(By.id("my-check-2"));
        if (!defaultCheckbox.isSelected()) {
            defaultCheckbox.click();
        }

        // ===== Chọn radio button =====
        driver.findElement(By.id("my-radio-2")).click();

        // ===== Nhấn nút Submit =====
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        // ===== Đóng trình duyệt =====
        driver.quit();

    }
    
}
