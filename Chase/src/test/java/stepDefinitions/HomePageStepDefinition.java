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
            scenario.attach(screenShot, "image/png", "chase");  // embed it in the report
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


    @Given("I am on the chase home Page")
    public void iAmOnTheChaseHomePage() throws IOException {

        openBrowser("https://www.chase.com/");
    }


    @When("I click menu bar")
    public void iClickMenuBar() {
        homePage.clickMenuBar();
    }
    @And("scroll down")
    public void scrollDown() {
        homePage.scrollDown();
    }

    @And("I click investment button")
    public void iClickInvestmentButton() {
        homePage.clickInvestmentButton();

    }


    @And("I click investment planning")
    public void iClickInvestmentPlanning() {
        homePage.clickInvestmentPlanning();

    }

    @And("I click retirement button")
    public void iClickRetirementButton() {
        homePage.clickRetirementButton();

    }

    @Then("I verify {string} in the retirement page")
    public void iVerifyInTheRetirementPage(String expectedText) {
        homePage.verifyRetirementHeader(expectedText);

    }
}

