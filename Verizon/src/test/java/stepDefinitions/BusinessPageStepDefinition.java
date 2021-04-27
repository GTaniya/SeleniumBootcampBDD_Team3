package stepDefinitions;

import businessPage.BusinessPage;
import common.WebAPI;
import homepage.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BusinessPageStepDefinition extends WebAPI {


    public static BusinessPage businessPage = new BusinessPage();

    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // Take a screenshot
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","Verizon");  // embed it in the report
        }
    }


    @After
    public void closeBrowser(){
        cleanUp();
    }


    @Given("I am on Verizon Business Page")
    public void iAmOnVerizonBusinessPage() throws IOException {
        // Call Action method
        openBrowser("https://www.verizon.com/business/");
    }


    @When("I scroll down to see solutions")
    public void iScrollDownToSeeSolutions() {
        businessPage.scrollDownToSeeSolutions();
    }

    @And("I am going to click See solutions Button")
    public void iAmGoingToClickSeeSolutionsButton() {
        businessPage.clickSeeSolutionsButton();
    }

    @And("I am going to click Explore FiveG Link")
    public void iAmGoingToClickExploreGLink() {
        businessPage.clickExploreFiveGLink();
    }

    @And("I scroll down")
    public void iScrollDown() throws InterruptedException {
        businessPage.scrollDownToPageTitle();
    }

    @Then("Verify Page header {string} of the FiveG Page")
    public void verifyPageHeaderOfTheFiveGPage(String expectedText) {
        businessPage.verifyPageHeader(expectedText);
    }

    @When("I scroll down to read the report")
    public void iScrollDownToReadTheReport() {
        businessPage.scrollDownToReadTheReportButton();
    }

    @And("I am going to click read the Report button")
    public void iAmGoingToClickReadTheReportButton() {
        businessPage.clickReadTheReportButton();
    }

    @And("I am going to click view the MSI online button")
    public void iAmGoingToClickViewTheMSIOnlineButton() {
        businessPage.clickViewMSIButton();
    }

    @Then("Verify Page header {string} of the MSI Page")
    public void verifyPageHeaderOfTheMSIPage(String expectedText) {
        businessPage.VerifyPageHeaderForeword(expectedText);
    }

    @When("I scroll down to see all products")
    public void iScrollDownToSeeAllProducts() {
        businessPage.scrollDownToSeeAllProducts();

    }

    @And("I am going to click See all products Link")
    public void iAmGoingToClickSeeAllProductsLink() {
        businessPage.clickSeeAllProductsLink();
    }

    @And("I am going to click view details link in Apple iPhone SE")
    public void iAmGoingToClickViewDetailsLinkInAppleIPhoneSE() {
        businessPage.clickViewDetailsInIphoneSE();
    }

    @Then("Verify product header {string} in the product page")
    public void verifyProductHeaderInTheProductPage(String expectedText) {
        businessPage.verifyProductHeaderIphoneSE(expectedText);
    }

    @And("I am going to change the iPhone SE color to Red")
    public void iAmGoingToChangeTheIPhoneSEColorToRed() {
        businessPage.changeTheColorRed();
    }

    @And("I am going to click view details link in Samsung Galaxy")
    public void iAmGoingToClickViewDetailsLinkInSamsungGalaxy() {
        businessPage.clickViewDetailsInSamsungGalaxy();
    }

    @Then("Verify product header {string} in the Samsung Product Page")
    public void verifyProductHeaderInTheSamsungProductPage(String expectedResult) {
        businessPage.verifyProductHeaderSamsungGalaxy(expectedResult);
    }

    @And("I am going to click Add to Cart Button")
    public void iAmGoingToClickAddToCartButton() {
        businessPage.addToCartSamsungGalaxy();

    }

    @And("I click Continue button")
    public void iClickContinueButton() {
        businessPage.clickContinueButton();
    }

    @Then("Verify header {string} in popup window")
    public void verifyHeaderInPopupWindow(String expectedText) {
        businessPage.verifyPopUpWindowHeader(expectedText);
    }

    @And("I am going to click networks in left side panel")
    public void iAmGoingToClickNetworksInLeftSidePanel() {
        businessPage.clickNetworkTab();

    }

    @And("I click learn More in Private IP")
    public void iClickLearnMoreInPrivateIP() {
        businessPage.clickPrivateIPLearnMore();

    }


    @Then("Verify header class {string} in Private IP Page")
    public void verifyHeaderClassInPrivateIPPage(String expectedHeader) {
        businessPage.verifyPrivateIPHeader(expectedHeader);
    }

    @When("I click contact us tab")
    public void iClickContactUsTab() {
        businessPage.clickContactUsTab();
    }

    @And("I click Store locator")
    public void iClickStoreLocator() {
        businessPage.clickStoreLocatorLink();
    }

    @And("I am going to add Zip code")
    public void iAmGoingToAddZipCode() {
        businessPage.inputTheLocationZipCode();

    }

    @Then("Verify header {string}")
    public void verifyHeader(String expectedText) {
        businessPage.verifyTheStoreLocatorHeader(expectedText);
    }

    @When("I scroll down to Fios Business Internet")
    public void iScrollDownToFiosBusinessInternet() throws InterruptedException {
        businessPage.scrollDownToBusinessInternet();
    }

    @And("I am going to click Fios Business Internet")
    public void iAmGoingToClickFiosBusinessInternet() {
        businessPage.clickBusinessInternet();
    }

    @And("I am going to click View bundle button")
    public void iAmGoingToClickViewBundleButton() {
        businessPage.clickViewBundleButton();
    }

    @And("I am going to click Offer and Pricing Link")
    public void iAmGoingToClickOfferAndPricingLink() {
        businessPage.clickOffersAndPriceLink();
    }

    @Then("verify header {string} in popup window FIOS")
    public void verifyHeaderInPopupWindowFIOS(String expectedText) {
        businessPage.verifyOfferAndDetails(expectedText);
    }

    @And("I click Internet and TV")
    public void iClickInternetAndTV() {
        businessPage.clickInternetAndTVLink();
    }

    @And("I click learn more in FIOS TV")
    public void iClickLearnMoreInFIOSTV() {
        businessPage.clickLearnMoreInTV();
    }

    @Then("Verify the page header {string} in FIOS TV page")
    public void verifyThePageHeaderInFIOSTVPage(String expectedText) {
        businessPage.verifyTVHeader(expectedText);
    }

    @When("I click search Button")
    public void iClickSearchButton() {
        businessPage.clickSearchButton();

    }

    @And("I click on search bar")
    public void iClickOnSearchBar() {
        businessPage.clickSearchField();
    }

    @And("I enter {string} in search field")
    public void iEnterInSearchField(String searchValues) {
        businessPage.enterValuesInSearchBar(searchValues);

    }
}


