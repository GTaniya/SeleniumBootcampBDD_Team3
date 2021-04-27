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
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // Take a screenshot
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","TMobile");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit(){
        homePage= PageFactory.initElements(driver,HomePage.class);
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }
    @Given("I am on the att home page")
    public void iAmOnTheAttHomePage() throws IOException {
        openBrowser("https://www.att.com/");
    }


    @When("I click phone and devices")
    public void iClickPhoneAndDevices() {
        homePage.clickHomeAndDevice();

    }

    @And("I scroll down and click iphone twelve")
    public void iScrollDownAndClickIphoneTwelve() {

    }
    @And("I click iphone twelve")
    public void iClickIphoneTwelve() {
        homePage.clickIphoneTwelve();
    }




    @Then("I should see {string} in iphone header")
    public void iShouldSeeInIphoneHeader(String expectedText) {
        homePage.verifyIphoneTwelveHeader(expectedText);

    }


    @When("I click search bar")
    public void iClickSearchBar() {
        homePage.clickSearchBar();

    }

    @And("I enter {string} in search bar")
    public void iEnterInSearchBar(String searchText) {
        homePage.searchItemsInTheSearchBar(searchText);

    }

    @And("I verify {string} in search bar")
    public void iVerifyInSearchBar(String expectedValue) {
        homePage.verifyExpectedValue(expectedValue);

    }
}


