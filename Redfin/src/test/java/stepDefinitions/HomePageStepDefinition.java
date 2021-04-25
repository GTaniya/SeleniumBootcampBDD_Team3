package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePageStepDefinition  extends WebAPI {
    public static HomePage homePage = new HomePage();

    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot
            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "Trulia");  // embed it in the report
        }
    }


    @After
    public void closeBrowser() {
        cleanUp();
    }


    @Given("I am on Redfin Home Page")
    public void iAmOnRedfinHomePage() throws IOException {
        openBrowser("https://www.redfin.com/");
    }

    @When("I click on sell")
    public void iClickOnSell() {
        homePage.clickSell();
    }

    @And("I scroll down to offers")
    public void iScrollDownToOffers() {
        homePage.scrollDownToOffers();
    }

    @And("I click Offers")
    public void iClickOffers() {
        homePage.clickSellOffers();
    }


    @Then("Verify page header {string} in Sell Page")
    public void verifyPageHeaderInSellPage(String expectedText) {
        homePage.verifyHeaderSell(expectedText);
    }

    @When("I scroll down to Help in the bottom of the page")
    public void iScrollDownToHelpInTheBottomOfThePage() {
        homePage.scrollDownToBottomOfThePage();
    }

    @And("I click help link")
    public void iClickHelpLink() {
        homePage.clickHelpLink();
    }

    @And("I click controlling Alerts button")
    public void iClickControllingAlertsButton() {
        homePage.clickControllingAlertsButton();
    }

    @Then("Verify page header {string} in Controlling Alerts page")
    public void verifyPageHeaderInControllingAlertsPage(String expectedText) {
        homePage.verifyControllingAlertsPageHeader(expectedText);
    }

    @And("I click Log in with Facebook or Google Link")
    public void iClickLogInWithFacebookOrGoogleLink() {
        homePage.clickHelpFacebookGoogleLogin();
    }

    @Then("Verify page header {string} in Log in with Facebook or Google Page")
    public void verifyPageHeaderInLogInWithFacebookOrGooglePage(String expectedHeader) {
        homePage.VerifyHeaderFacebookGoogleHeader(expectedHeader);
    }

    @And("I click password reset link")
    public void iClickPasswordResetLink() {
        homePage.clickPasswordRestLink();
    }

    @And("I scroll down to bottom of the page")
    public void iScrollDownToBottomOfThePage() {
        homePage.scrollDownToClickYes();
    }

    @And("I click Yes in Help Topic")
    public void iClickYesInHelpTopic() {
        homePage.clickYes();
    }

    @Then("Verify page header {string} in Password reset page")
    public void verifyPageHeaderInPasswordResetPage(String expectedText) {
        homePage.verifyPasswordResetPageHeader(expectedText);
    }

    @And("I click Jobs")
    public void iClickJobs() {
        homePage.clickJobsLink();
    }

    @And("I click see all Departments button")
    public void iClickSeeAllDepartmentsButton() {
        homePage.clickSeeAllDepartmentButton();
    }

    @And("I scroll down to Early Careers")
    public void iScrollDownToEarlyCareers() {
        homePage.scrollDownToEarlyCareers();
    }

    @And("I click Early Careers")
    public void iClickEarlyCareers() {
        homePage.clickEarlyCareers();
    }


    @Then("Verify page header {string} in Internships Page")
    public void verifyPageHeaderInInternshipsPage(String expectedHeader) {
        homePage.verifyInternshipHeader(expectedHeader);
    }

    @And("I click Data Engineer Intern")
    public void iClickDataEngineerIntern() {
        homePage.clickDataEngineerJob();
    }

    @Then("Verify page header {string} in Data Engineer job page")
    public void verifyPageHeaderInDataEngineerJobPage(String expectedText) {
        homePage.verifyDataEngineerHeader(expectedText);
    }

    @And("I scroll down to Real state")
    public void iScrollDownToRealState() {
        homePage.ScrollDownRealState();
    }

    @And("I click Real State")
    public void iClickRealState() {
        homePage.clickRealState();
    }

    @And("I click learn more in real state agent")
    public void iClickLearnMoreInRealStateAgent() {
        homePage.clickLearnMore();
    }

    @Then("Verify page header {string} in Real state Agent page")
    public void verifyPageHeaderInRealStateAgentPage(String expectedText) {
        homePage.verifyRealStateAgentHeader(expectedText);
    }

    @And("I click Apply Now")
    public void iClickApplyNow() {
        homePage.clickApplyNowButton();
    }

    @Then("Verify header {string} In real state agent job")
    public void verifyHeaderInRealStateAgentJob(String expectedText) {
        homePage.verifyApplyNowHeader(expectedText);
    }

    @When("I scroll down to Contact us")
    public void iScrollDownToContactUs() {
        homePage.scrollToContactUs();
    }

    @And("I click Contact Us")
    public void iClickContactUs() {
        homePage.clickContactUs();
    }

    @And("I click Message Us")
    public void iClickMessageUs() {
        homePage.clickMessageUs();
    }

    @Then("Verify header {string} in Contact Page")
    public void verifyHeaderInContactPage(String expectedText) {
        homePage.verifySubmitRequestHeader(expectedText);

    }

    @And("I click Drop down menu")
    public void iClickDropDownMenu() {
        homePage.clickDropDownMenu();
    }

    @And("I click Technical Assistance")
    public void iClickTechnicalAssistance() {
        homePage.clickTechnicalAssistance();
    }

    @When("I click on search bar")
    public void iClickOnSearchBar() {
        homePage.selectSearchField();
    }

    @And("I enter {string} in search bar")
    public void iEnterInSearchBar(String searchText) {
        homePage.sendKeysToSearchBar(searchText);
    }

    @And("I should see {string} values in search bar")
    public void iShouldSeeValuesInSearchBar(String expectedText) {
        homePage.verifyExpectedResultText(expectedText);
    }

    @But("I should not see {string} values in the search bar")
    public void iShouldNotSeeValuesInTheSearchBar(String notExpectedValue) {
        homePage.verifyNotExpectedValue(notExpectedValue);

    }

    @Then("I verify {string} as page url")
    public void iVerifyAsPageUrl(String expectedUrl) {
        homePage.verifyExpectedUrl(expectedUrl);
    }
}