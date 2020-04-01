package com.telran.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginJira {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
wd = new ChromeDriver();
wd.get("http://jira.tel-ran.net/");
wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void loginJira(){
        wd.get("http://jira.tel-ran.net/");
        wd.findElement(By.name("os_username")).clear();
        wd.findElement(By.name("os_username")).sendKeys("ymfuks");
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //wd.findElement(By.name("os_password")).clear();
        wd.findElement(By.name("os_password")).sendKeys("Parolotjira1");
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.findElement(By.name("login")).click();

    }
    @AfterMethod
    public void tearDown(){
//        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//wd.quit();
    }
}
