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
            scenario.attach(screenShot, "image/png", "verizon");  // embed it in the report
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
    @Given("I am on the verizon page")
    public void iAmOnTheVerizonPage() throws IOException {
        openBrowser("https://www.verizon.com/");
    }

    @When("I click shop menu list")
    public void iClickShopMenuList() {
        homePage.clickShopMenu();

    }

    @And("I click accessories")
    public void iClickAccessories() {
        homePage.clickCasesAndPROTECTION();

    }

    @And("I click cases and protection")
    public void iClickCasesAndProtection() {
        homePage.clickCasesAndPROTECTION();

    }

    @And("I click Iphone cases button")
    public void iClickIphoneCasesButton() {
        homePage.clickIphoneCases();

    }

    @Then("I verify {string} in header")
    public void iVerifyInHeader(String arg0) {

    }
}
