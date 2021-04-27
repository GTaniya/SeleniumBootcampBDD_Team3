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
   public static HomePage homePage =new HomePage();

    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // Take a screenshot
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","Mercedes");  // embed it in the report
        }
    }



    @After
    public void closeBrowser(){
        cleanUp();
    }


    @Given("I am on mercedes home Page")
    public void iAmOnMercedesHomePage() throws IOException {
        openBrowser("https://www.mbusa.com/en/home");
    }




    @When("I click search button")
    public void iClickSearchButton() {
        homePage.clickSearchButton();

    }


    @When("I click on the search bar")
    public void iClickOnTheSearchBar() {
        homePage.clickOmTheSearchBar();

    }

    @When("I enter {string} in the search bar")
    public void iEnterInTheSearchBar(String searchText) {
        homePage.searchModelsInSearchBar(searchText);

    }

    @Then("I verify {string} in search bar")
    public void iVerifyInSearchBar(String expectedTextValue) {
        homePage.verifyExpectedText(expectedTextValue);

    }

    @When("I click vehicle button")
    public void iClickVehicleButton() {
        homePage.clickMenuBar();

    }

    @And("I click on coupes button")
    public void iClickOnCoupesButton() {
        homePage.clickCoupesButton();

    }

    @And("I click on vehicle name")
    public void iClickOnVehicleName() {
        homePage.clickVehicleButton();

    }

    @Then("I should {string} coupe")
    public void iShouldCoupe(String expectedText) {
        homePage.verifyingEClassCoupe(expectedText);

    }

    @When("I click all vehicles")
    public void iClickAllVehicles() {
        homePage.clickAllVehicles();
    }

    @And("I click {string} in all vehicle page")
    public void iClickInAllVehiclePage(String expectedVehicle) {
        homePage.clickVehicles(expectedVehicle);

    }

    @Then("I verify {string} in each page")
    public void iVerifyInEachPage(String expectedUrl) {
        homePage.verifyExpectedUrl(expectedUrl);

    }
}

