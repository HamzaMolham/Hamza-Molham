package steps;

import com.SauceDemo.base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.SauceDemo.pages.HomePage;
import com.SauceDemo.pages.LoginPage;

import java.io.IOException;


public class loginSteps extends Base {

    LoginPage loginPage;
    HomePage homePage;

    @Given("User open the website")
    public void userOpenTheWebsite() throws IOException {
        launchBrowser();
    }

    @When ("user signing with {string} and {string}")
    public void user_signin_with_valid_email_and_password(String userName,String Password) {
        loginPage = new LoginPage();
       homePage = loginPage.performLogin(userName,Password);

    }

    @Then("user will be directed to homepage")
    public void then_will_be_directed_to_homepage() {
        homePage.IsProductTestDisplayed();
    }


    @Then("the user will get an error massage")
    public void theUserWillGetAnErrorMassage() {
    loginPage.IsErrorMassageDisplayed();
    }


    @Then("user will see wrong image displayed in homepage")
    public void theUserWillGetToHomepageButTheItemsIsNotCorrect() {

        homePage.IsWrongImageDisplayed();
    }

    @Then("user will wait too long for the homepage to be displayed")
    public void userWillWaitTooLongForThePageToBeDisplayed() {
        homePage.IsProductTestDisplayed();
    }

    @And("user click on sorting button")
    public void userClickOnSortingButton() {
        homePage.SelectSorting();
    }

    @Then("An alert will pop up to the user")
    public void anAlertWillPopUpToTheUser() {
        homePage.AlertScreen();
    }


    @Then("user will find basket button is misplaced.")
    public void userWillFindBasketButtonIsMisplaced() {
        homePage.BasketButtonWrongPlace();
    }


}
