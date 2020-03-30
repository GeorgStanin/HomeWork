package com.telran.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OpenGoogleTest {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
wd = new ChromeDriver();
wd.get("https://www.google.com/");
wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void testOpenGoogle(){
wd.get("https://www.google.com/");
        Click(By.className("gb_D"));
        Click(By.className("gb_D"));
    }

    private void Click(By gb_d) {
        wd.findElement(gb_d).click();
    }

    public void testSearchGoogle(){
        wd.get("https://www.google.com/");
        Click(By.name("q"));
        wd.findElement(By.className("gLFyf")).clear();
        wd.findElement(By.className("gLFyf")).sendKeys("Java");

    }
@AfterMethod
    public void tearDown(){
        wd.quit();
    }
}
