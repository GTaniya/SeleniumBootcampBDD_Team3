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
            scenario.attach(screenShot,"image/png","expedia");  // embed it in the report
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


        @Given("I am on the Expedia page")
        public void iAmOnTheExpediaPage() throws IOException {

            openBrowser("https://www.expedia.com/");
    }


    @When("I click search button")
    public void iClickSearchButton() {
        homePage.clickSearchButton();

    }

    @And("I click on the search bar")
    public void iClickOnTheSearchBar() {
        homePage.clickSearchbar();

    }

    @And("I enter {string} in the search bar")
    public void iEnterInTheSearchBar(String searchText) {
        homePage.searchPlacesToGo(searchText);

    }

    @Then("I verify {string} in search bar")
    public void iVerifyInSearchBar(String arg0) {

    }
}

