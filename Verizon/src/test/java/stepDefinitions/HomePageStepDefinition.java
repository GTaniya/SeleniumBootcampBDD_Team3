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


    @Given("I am on t_mobile homePage")
    public void iAmOnT_mobileHomePage() throws IOException {
        // Call Action method
        openBrowser("https://www.t-mobile.com/");
    }
//    @Given("I click on search Button1")
//    public void i_click_on_search_button1() {
//        homePage.clickOnSearchButton1();
//    }
//    @Given("I type {string}")
//    public void i_type(String productName) {
//        homePage.enterProductName(productName);
//    }
//    @When("I click on search Button")
//    public void i_click_on_search_button() {
//        homePage.clickOnSearchButton();
//    }
//    @And("I click on T-Mobile FamilyWhere app")
//    public void iClickOnTMobileFamilyWhereApp() {
//        homePage.clickOnTMobileFamilyWhere();
//    }
//    @Then("I should see {string} is properly appeared")
//    public void i_should_see_is_properly_appeared(String expectedText) {
//        homePage.verifySearchResult(expectedText);
//    }
//    @Then("I should not see {string} is appeared")
//    public void i_should_not_see_is_appeared(String expectedText) {
//        homePage.verifySearchResultNotMatch(expectedText);
//    }
//    @And("I verify {string}  in product title")
//    public void iVerifyInProductTitle(String expectedText) {
//        homePage.verifyPageTitle(expectedText);
//    }



}
