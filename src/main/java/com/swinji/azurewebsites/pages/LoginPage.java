package pages;

import com.swinji.azurewebsites.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "Email")
    WebElement email;
    @FindBy(id = "inputPassword")
    WebElement password;
    @FindBy(id = "btnLogin")
    WebElement loginButton;

    public HomePage performLogin (String user, String pass) {

        email.sendKeys(user);
        password.sendKeys(pass);
        loginButton.click();

        return new HomePage();

    }
}
