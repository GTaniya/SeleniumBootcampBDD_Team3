package stepDefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mlbPage.MLBPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

public class MLBPageStepDefinition extends WebAPI {
    public static MLBPage mlbPage = new MLBPage();

    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {

            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "ESPN");  // embed it in the report
        }
    }


    @After
    public void closeBrowser() {
        cleanUp();
    }


    @Given("I am on ESPN homePage")
    public void iAmOnESPNHomePage() throws IOException {
        openBrowser("https://www.espn.com/");
    }

    @When("I click MLB")
    public void iClickMLB() {
        mlbPage.clickMLBTab();
    }


    @When("I click stats")
    public void iClickStats() {
        mlbPage.clickStatsTab();
    }

    @Then("I select {string} in the page")
    public void iSelectInThePage(String players) {
        mlbPage.clickPlayersImage(players);
    }


}
