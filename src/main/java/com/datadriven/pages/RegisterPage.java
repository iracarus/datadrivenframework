package com.datadriven.pages;

import com.datadriven.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Date;

public class RegisterPage extends TestBase {
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

    public RegisterPage()
    {
        PageFactory.initElements(driver, this);
        System.out.println("constructor run");
    }

    public void populateForm(String firstName, String lastName, String address, String emailAddress, String phone, String gender, String hobbies, String languages, String skills, String country, Date dateOfBirth , String password)
    {
        System.out.println("starting");
        System.out.println(firstNameObj.isEnabled());
        System.out.println(lastNameObj.isEnabled());
        System.out.println(addressObj.isEnabled());
        System.out.println(emailAddressObj.isEnabled());
        System.out.println(phoneObj.isEnabled());
        System.out.println(genderMaleObj.isEnabled());
        System.out.println(genderFemaleObj.isEnabled());
        System.out.println(hobbiesCricketObj.isEnabled());
        System.out.println(hobbiesMoviesObj.isEnabled());
        System.out.println(hobbiesHockeyObj.isEnabled());
        System.out.println(languagesObj.isEnabled());
        System.out.println(skillsObj.isEnabled());
        System.out.println(countriesObj.isEnabled());
        System.out.println(yearObj.isEnabled());
        System.out.println(monthObj.isEnabled());
        System.out.println(dayObj.isEnabled());
        System.out.println(mainPasswordObj.isEnabled());
        System.out.println(secondPasswordObj.isEnabled());
    }

}
