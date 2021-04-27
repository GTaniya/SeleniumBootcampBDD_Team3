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
            scenario.attach(screenShot,"image/png","BMW");  // embed it in the report
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

    @Given("I am on the BMW home page")
    public void iAmOnTheBMWHomePage() throws IOException {
        openBrowser("https://www.bmwusa.com/");

    }

    @When("I click model button")
    public void iClickModelButton() {
        homePage.clickModelsButton();

    }

    @And("I click BMW SEVEN series")
    public void iClickBMWSEVENSeries() {
        homePage.clickBMWSevenSeries();

    }

    @And("I click Gallery")
    public void iClickGallery() {
        homePage.clickGallery();

    }

    @Then("I verify {string} in the Gallery page")
    public void iVerifyInTheGalleryPage(String expectedText) {
        homePage.verifyBmwSevenSeries(expectedText);

    }
}



