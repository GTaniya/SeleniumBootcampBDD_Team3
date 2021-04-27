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
            scenario.attach(screenShot,"image/png","bank of america");  // embed it in the report
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


    @Given("I AM ON THE Bank OF America page")
    public void iAMONTHEBankOFAmericaPage() throws IOException {
        openBrowser("https://www.bankofamerica.com/");
    }


    @When("I click credit cards button")
    public void iClickCreditCardsButton() {
        homePage.clickCreditCardsButton();

    }

    @And("I click cash reward card button")
    public void iClickCashRewardCardButton() {
        homePage.clickCashRewardCards();
    }

    @Then("I should see {string} in bank od America page")
    public void iShouldSeeInBankOdAmericaPage(String expectedText) {
        homePage.verifyExpectedText(expectedText);

    }
}

