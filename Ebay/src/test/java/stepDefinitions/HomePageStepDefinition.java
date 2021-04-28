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
    public static HomePage homePage = new HomePage();

    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {

            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "Ebay");  // embed it in the report
        }
    }


    @After
    public void closeBrowser() {
        cleanUp();
    }


    @Given("I am on ebay homePage")
    public void iAmOnT_mobileHomePage() throws IOException {

        openBrowser("https://www.ebay.com/");

    }

    @When("I click on search bar")
    public void iClickOnSearchBar() {
        homePage.selectSearchField();

    }

    @And("I enter {string} in search bar")
    public void iEnterInSearchBar(String searchText) {
        homePage.sendKeysToSearchBar(searchText);
    }

    @And("I should see {string} values in search bar")
    public void iShouldSeeValuesInSearchBar(String expectedValue) {
        homePage.verifyExpectedResultText(expectedValue);
    }

    @When("I click Electronics")
    public void iClickElectronics() {
        homePage.clickElectronics();
    }

    @Then("I should see {string} in Electronics page")
    public void iShouldSeeInElectronicsPage(String expectedHeader) {
        homePage.VerifyPageHeader(expectedHeader);
    }

    @When("I check on search bar")
    public void iCheckOnSearchBar() {
        homePage.clickSearchBar();
    }

    @And("I type to search")
    public void iTypeToSearch() {
        homePage.typeItemToSearch();
    }

    @And("I click search submit button")
    public void iClickSearchSubmitButton() {
        homePage.clickSearchButton();
    }

    @And("I click Samsung Galaxy")
    public void iClickSamsungGalaxy() {
        homePage.clickSamsungGalaxy();
    }


    @Then("I verify {string} in Tablets results")
    public void iVerifyInTabletsResults(String expectedText) {
        homePage.verifySamsungHeader(expectedText);
    }

    @And("I put {string} in search bar")
    public void iPutInSearchBar(String searchValues) {
        homePage.sendValues(searchValues);
        }

    @Then("I verify {string} in search bar")
    public void iVerifyInSearchBar(String expectedValues) {
        homePage.verifyExpectedValues(expectedValues);
    }

    @When("I click Fashion Link")
    public void iClickFashionLink() {
        homePage.clickOnFashionLink();
    }

    @And("I click Women clothing")
    public void iClickWomenClothing() {
        homePage.clickWomenClothing();
    }

    @And("I click Jeans")
    public void iClickJeans() {
        homePage.clickJeans();
    }

    @And("I click Rock Revival")
    public void iClickRockRevival() {
        homePage.clickRockRevival();
    }

    @Then("I verify {string} in Jeans results")
    public void iVerifyInJeansResults(String expectedValue) {
        homePage.VerifyJeansHeader(expectedValue);
    }


    @And("I select {string} in fashion page")
    public void iSelectInFashionPage(String fashionCategories) {
        homePage.selectFashionCategories(fashionCategories);
    }

    @And("I should see {string} in each page")
    public void iShouldSeeInEachPage(String expectedHeader) {
        homePage.selectHeaders(expectedHeader);

    }

    @Then("I verify {string} in each page")
    public void iVerifyInEachPage(String expectedUrl) {
        homePage.verifyUrl(expectedUrl);
    }

    @Then("I verify {string} values in search bar")
    public void iVerifyValuesInSearchBar(String expectedUrl) {
        homePage.verifyUrl(expectedUrl);
    }
}