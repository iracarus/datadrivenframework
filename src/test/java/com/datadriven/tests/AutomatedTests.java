package com.datadriven.tests;

import com.datadriven.base.TestBase;
import com.datadriven.excel.ExcelReader;
import com.datadriven.pages.RegisterPage;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class AutomatedTests extends TestBase {
    public RegisterPage registerPage;

    @FindBy(xpath = "//input[@placeholder = 'First Name']")
    WebElement firstNameObj;

    @FindBy(xpath = "//input[@placeholder = 'Last Name']")
    WebElement lastNameObj;

    @FindBy(xpath = "//textarea[@ng-model='Adress']")
    WebElement addressObj;

    @FindBy(xpath = "//input[@ng-model='EmailAdress']")
    WebElement emailAddressObj;

    @FindBy(xpath = "//input[@ng-model='Phone']")
    WebElement phoneObj;

    @FindBy(xpath = "//input[@type='radio' and @value='Male']")
    WebElement genderMaleObj;

    @FindBy(xpath = "//input[@type='radio' and @value='FeMale']")
    WebElement genderFemaleObj;

    @FindBy(xpath = "//input[@type = 'checkbox' and @value ='Cricket']")
    WebElement hobbiesCricketObj;

    @FindBy(xpath = "//input[@type = 'checkbox' and @value ='Movies']")
    WebElement hobbiesMoviesObj;

    @FindBy(xpath = "//input[@type = 'checkbox' and @value ='Hockey']")
    WebElement hobbiesHockeyObj;

    @FindBy(xpath = "//div[@id='msdd']")
    WebElement languagesObj;

    @FindBy(xpath = "//div[@id='msdd']/following-sibling::div/ul")
    WebElement languageOptionsObj;

    @FindBy(id = "Skills")
    WebElement skillsObj;

    @FindBy(id = "countries")
    WebElement countriesObj;

    @FindBy(id = "yearbox")
    WebElement yearObj;

    @FindBy(xpath = "//select[@placeholder ='Month']")
    WebElement monthObj;

    @FindBy(id = "daybox")
    WebElement dayObj;

    @FindBy(id = "firstpassword")
    WebElement mainPasswordObj;

    @FindBy(id = "secondpassword")
    WebElement secondPasswordObj;

    @BeforeMethod
    public void setup()
    {
        //initialize();
        //PageFactory.initElements(driver, this);
    }

    @Test
    public void open()
    {

        ExcelReader.getCellData("Westeros", 1,1);
//        String gender = "female";
//        driver.get(props.getProperty("url"));
//        System.out.println(driver.getTitle());
//        //registerPage.populateForm("", "", "", "", "", "", "", "", "", "", new Date(), "");
//        System.out.println(firstNameObj.isDisplayed());
//        firstNameObj.sendKeys("Rajesh");
//        lastNameObj.sendKeys("Kumar");
//        addressObj.sendKeys("NEw Delhi address");
//        emailAddressObj.sendKeys("chahalraj@gmail.com");
//        phoneObj.sendKeys("1234567893");
//        if(gender.equalsIgnoreCase("male"))
//        {
//            genderMaleObj.click();
//        }
//        else
//        {
//            genderFemaleObj.click();
//        }
//
//        hobbiesCricketObj.click();
//        hobbiesHockeyObj.click();
//        hobbiesMoviesObj.click();
//
//        languagesObj.click();
//        WebDriverWait wait = new WebDriverWait(driver, 20);
//        wait.until(ExpectedConditions.visibilityOf(languageOptionsObj));
//
//        languageOptionsObj.click();
//
//        Select skills = new Select(skillsObj);
//        skills.selectByVisibleText("AutoCAD");
//
//        Select countries = new Select(countriesObj);
//        countries.selectByVisibleText("Algeria");
//
//        Select year = new Select(yearObj);
//        year.selectByVisibleText("2007");
//
//        Select month = new Select(monthObj);
//        month.selectByVisibleText("February");
//
//        Select day = new Select(dayObj);
//        day.selectByVisibleText("10");
//
//
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    @AfterMethod
    public void tearDown()
    {
        //driver.quit();
    }
}
