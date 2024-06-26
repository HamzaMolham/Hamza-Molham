package com.SauceDemo.pages;

import com.SauceDemo.base.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css= "[placeholder=\"Username\"]")
    WebElement email;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(css = "[value=\"Login\"]")
    WebElement loginButton;

    @FindBy(css = "[data-test=\"error\"]")
    WebElement error;

    public HomePage performLogin (String user, String pass) {

        email.sendKeys(user);
        password.sendKeys(pass);
        loginButton.click();
        return new HomePage();
    }

    public void IsErrorMassageDisplayed (){
       Assert.assertTrue(error.isDisplayed());
    }


}
