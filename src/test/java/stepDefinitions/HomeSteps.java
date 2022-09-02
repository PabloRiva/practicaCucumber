package stepDefinitions;

import com.google.common.collect.Ordering;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Homepage;
import utilities.DriverManager;

import java.util.List;

public class HomeSteps {
    Homepage homepage = new Homepage(DriverManager.getDriver().driver);

    @When("I click on add to cart button")
    public void clickOnAddToCartButton(){
        homepage.clickOnAddSauceLabsBackPackToCartButton();
    }
    @Then("The cart's number should increase")
    public void verifyTheCartsNumberHasIncreased(){
        Assert.assertEquals("1",homepage.getCartIconText());
    }
    @Given("I select the product filter {string}")
    public void selectProductFilter(String productFilter){
        homepage.selectProductFilter(productFilter);
    }
    @Then("The prices should be sorted")
    public void verifyPricesAreSorted(){
        List<Double> prices = homepage.getAllItemPrices();
        boolean pricesAreSorted = Ordering.natural().isOrdered(prices);
        Assert.assertTrue(pricesAreSorted);
    }
}
