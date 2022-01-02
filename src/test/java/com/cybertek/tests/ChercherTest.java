package com.cybertek.tests;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ChercherTest {
  /*
  Task1:
    1. Go to https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver
    2. Click on "Click me, to Open an alert after 5 seconds"
    3. Explicitly wait until alert is present
    4. Then handle the Javascript alert
   */
  WebDriver driver; //declare our reference for the object

    @BeforeMethod
    public void setUp(){
    driver= WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();

    //implicitly wait, this is going to be applied to whole test case and elements
    //it is going to handle no such element exception, going to wait for the elemen
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

  }

   @AfterMethod
   public void tearDown(){
    driver.close();
   }

   @Test
   public void alertPresentTest(){

      driver.findElements(By.id("alert"));


   }




}
