/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.trikmgithub.main;

import com.trikmgithub.practice.LocatingWebElements;
import org.openqa.selenium.WebDriver;
import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import java.util.List;
import javax.accessibility.AccessibleAction;
import javax.lang.model.element.Element;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;
/**
 *
 * @author Admin
 */
public class Main {

  static protected WebDriver driver;

  static {
    chromedriver().setup();
    var options = new ChromeOptions();
    options.addArguments("--start-maximized");
    driver = new ChromeDriver(options);
  }

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/formPage.html");
      LocatingWebElements.findElements(driver);
  }
}
