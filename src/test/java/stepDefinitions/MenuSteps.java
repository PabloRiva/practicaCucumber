package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.Homepage;
import pages.LoginPage;
import utilities.DriverManager;

public class MenuSteps {
    LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
    Homepage homepage = new Homepage(DriverManager.getDriver().driver);


    @Given("I click on menu icon")
    public void clickOnMenuIcon(){
        homepage.clickOnHamburguerButton();
    }
    @And("I click on logout link")
    public void clickOnLogoutLink(){
        homepage.clickOnLogoutLink();
    }
    @Then("We should be in the login page")
    public void verifyWeAreInLoginPage(){
        loginPage.loginButtonIsDisplayed();
    }

}
