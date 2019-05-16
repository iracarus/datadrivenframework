package com.datadriven.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
    public Properties props;
    public WebDriver driver;

    public TestBase()
    {
        String configFilePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" +
                                                                File.separator + "resources" +
                                                                File.separator + "config.properties";

        props = new Properties();
        FileInputStream configFile = null;
        try {
            configFile = new FileInputStream(configFilePath);
            props.load(configFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initialize()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
}
