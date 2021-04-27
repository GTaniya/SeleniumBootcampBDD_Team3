package stepDefinitions;

import common.WebAPI;
import internetpage.InternetPage;
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

public class InternetPageStepDefinition extends WebAPI {
    public static InternetPage internetPage = new InternetPage();
    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // Take a screenshot
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","ATT");  // embed it in the report
        }
    }


    @After
    public void closeBrowser(){
        cleanUp();
    }


    @Given("I am on ATT homepage")
    public void iAmOnATTHomePage() throws IOException {
        // Call Action method
        openBrowser("https://www.att.com/");
    }


    @When("I click Internet section")
    public void iClickInternetSection() {
        internetPage.clickInternetPage();
    }

    @And("I click Plans and Prices")
    public void iClickPlansAndPrices() {
        internetPage.clickPlansPrices();
    }

    @And("I scroll down")
    public void iScrollDown() {
        internetPage.ScrollDowntoLearnMore();
    }

    @And("I click Learn More Button")
    public void iClickLearnMoreButton() {
        internetPage.clickLearnMore();
    }

    @Then("I verify {string} Internet Page")
    public void iVerifyInternetPage(String expectedText) {
        internetPage.verifyPageHeader(expectedText);
    }

    @When("I click on search bar")
    public void iClickOnSearchBar() {
        internetPage.clickSearchBar();
    }

    @And("I typed in {string} in seach bar")
    public void iTypedInInSeachBar(String SearchValue) {
        internetPage.SendKeysToSearchBar(SearchValue);
    }

    @And("I should see {string} in search bar")
    public void iShouldSeeInSearchBar(String ExpectedValue) {
        internetPage.SendKeysToExpectedValue(ExpectedValue);
    }

    @Then("I verify {string} in page")
    public void iVerifyInPage(String ExpectedURL) {
        internetPage.VerifyExpectedURL(ExpectedURL);
    }
}
