package stepDefinitions;

import buildYourOwn.BuildYourOwnPage;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

public class BuildYourOwnStepDefinition extends WebAPI {
    public static BuildYourOwnPage buildYourOwn = new BuildYourOwnPage();
    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // Take a screenshot
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","BMW");  // embed it in the report
        }
    }


    @After
    public void closeBrowser(){
        cleanUp();
    }


    @Given("I am on BMW homepage")
    public void iAmOnBMWHomePage() throws IOException {
        // Call Action method
        openBrowser("https://www.bmwusa.com/");
    }

    @When("I click on search button")
    public void iClickOnSearchButton() {
        buildYourOwn.clickSearchButton();
    }

    @And("I click on search bar")
    public void iClickOnSearchBar() {
        buildYourOwn.clickSearchBar();
    }

    @And("I typed in {string} in the search bar")
    public void iTypedInInTheSearchBar(String SearchValue) {
        buildYourOwn.SendKeysToSearchBar(SearchValue);
    }

    @And("I should see {string} in the search bar")
    public void iShouldSeeInTheSearchBar(String ExpectedValue) {
        buildYourOwn.SendKeysToExpectedValue(ExpectedValue);
    }

    @Then("I verify {string} in page")
    public void iVerifyInPage(String ExpectedURL) {
        buildYourOwn.VerifyExpectedURL(ExpectedURL);
    }
}
