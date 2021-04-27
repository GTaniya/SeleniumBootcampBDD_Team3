package stepDefinitions;

import common.WebAPI;
import fashionPage.FashionPage;
import homepage.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class EarringStepDefinition extends WebAPI {

   public static FashionPage fashionPage = new FashionPage();





    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot
            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "Ebay");  // embed it in the report
        }
    }


    @After
    public void closeBrowser() {
        cleanUp();
    }


    @Given("I am on Ebay fashion pages")
    public void iAmOnEbayFashionPage () throws IOException {
        // Call Action method
        openBrowser("https://www.ebay.com/b/Fashion/bn_7000259856"); }

    @When("I click jewelry")
    public void iClickJewelry() {
        fashionPage.clickJewelryDropDown();
    }

    @And("I click on fashion earring")
    public void iClickOnFashionEarring() {
        fashionPage.clickFashionEarrings();
    }

    @And("I scroll down to pink check box")
    public void iScrollDownToPinkCheckBox() {
        fashionPage.scrollToPinkBox();
    }

    @And("I click on pink check box")
    public void iClickOnPinkCheckBox() {
        fashionPage.clickOnPinkCheckBox();
    }

    @Then("I should see {string} pink earring page header")
    public void iShouldSeePinkEarringPageHeader(String expectedText) {
        fashionPage.verifyPinkEarringHeader(expectedText);

    }

    @And("I click on drop earrings")
    public void iClickOnDropEarrings() {
        fashionPage.clickOnDropEarrings();
    }

    @Then("I should see {string} drop earrings price")
    public void iShouldSeeDropEarringsPrice(String expected) {
        fashionPage.verifyDropEarringPrice(expected);



    }

    @When("I click search bar")
    public void iClickSearchBar() {
        fashionPage.clickSearchBar();

    }

    @And("I enter {string} in search bar")
    public void iEnterInSearchBar(String searchText) {
        fashionPage.searchItemsInSearchBar(searchText);

    }

    @And("I should see {string} in search bar")
    public void iShouldSeeInSearchBar(String expectedValue) {
        fashionPage.verifyingExpectedValue(expectedValue);

    }

    @But("I should not see {string} in search bar")
    public void iShouldNotSeeInSearchBar(String notExpectedValue) {
        fashionPage.verifyNotExpectedValue(notExpectedValue);

    }

    @Then("I verify  {string} in ebay page")
    public void iVerifyInEbayPage(String expectedUrl) {
        fashionPage.verifyExpectedUrl(expectedUrl);


    }
    //////////////////////////////////////////////////////////////////////////////////////////////////







}

