package com.datadriven.tests;

import com.datadriven.base.TestBase;
import com.datadriven.pages.RegisterPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Date;

public class AutomatedTests extends TestBase {
    public RegisterPage registerPage;

    @BeforeMethod
    public void setup()
    {
        initialize();
        registerPage = new RegisterPage();
    }

    @Test
    public void open()
    {
        driver.get(props.getProperty("url"));
        System.out.println(driver.getTitle());
        registerPage.populateForm("", "", "", "", "", "", "", "", "", "", new Date(), "");
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
