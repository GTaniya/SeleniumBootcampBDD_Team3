package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePageStepDefinition  extends WebAPI {
    static HomePage homePage;

    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot
            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "Ebay");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }


    @Given("I am on ebay homePage")
    public void iAmOnT_mobileHomePage() throws IOException {
        // Call Action method
        openBrowser("https://www.ebay.com/");

    }

    @When("I click on search bar")
    public void iClickOnSearchBar() {
        homePage.selectSearchField();

    }

    @And("I enter Macbook into search field")
    public void iEnterMacbookIntoSearchField() {
        homePage.sendKeysToField();
    }

    @And("I click on search button")
    public void iClickOnSearchButton() {
        homePage.selectSearchButton();
    }

    @Then("I should see {string} as result header")
    public void iShouldSeeAsResultHeader(String expectedText) {
        homePage.verifyMacbookResultHeader(expectedText);
    }
}
