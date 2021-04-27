package stepDefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import videogamesConsoles.VideogamesConsolesPage;

import java.io.IOException;

public class VideogamesConsolesStepDefinition extends WebAPI {
    public static VideogamesConsolesPage videogamesConsoles = new VideogamesConsolesPage();
    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // Take a screenshot
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","Ebay");  // embed it in the report
        }
    }


    @After
    public void closeBrowser(){
        cleanUp();
    }


    

    @Given("I am on Ebay homepage")
    public void iAmOnEbayHomePage() throws IOException {
        // Call Action method
        openBrowser("https://www.ebay.com");
    }

    @When("I click on search bar")
    public void iClickOnSearchBar() {
        videogamesConsoles.clickSearchBar();
    }
}


