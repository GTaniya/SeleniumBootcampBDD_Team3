package stepDefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
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


    @And("I click Teams")
    public void iClickTeams() {
        mlbPage.clickTeams();
    }

    @And("I click schedule in theTeams page")
    public void iClickScheduleInTheTeamsPage() {
        mlbPage.clickSchedule();
    }

    @And("I click Los Angeles")
    public void iClickLosAngeles() {
        mlbPage.clickLosAngeles();
    }

    @Then("I verify {string} header in the page")
    public void iVerifyHeaderInThePage(String expectedResult) {
        mlbPage.verifyLosAngelesHeader(expectedResult);
    }

    @And("I click Fantasy Baseball")
    public void iClickFantasyBaseball() {
        mlbPage.clickFantasyBaseball();
    }

    @And("I click start New League button")
    public void iClickStartNewLeagueButton() {
        mlbPage.clickStartLeagueButton();
    }


    @And("I click SignUp")
    public void iClickSignUp() {
        mlbPage.clickSignUp();
    }

    @Then("I verify {string} header in Signup Window")
    public void iVerifyHeaderInSignupWindow(String expectedText) {
        mlbPage.verifySignInWindow(expectedText);
    }
}
