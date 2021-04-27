package businessPage;

import common.WebAPI;
import io.cucumber.java.an.E;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.PrintWriter;

import static businessPage.BusinessPageLocators.*;


public class BusinessPage extends WebAPI {

    public BusinessPage(){
        PageFactory.initElements(driver, this);
    }

    public void scrollDownToSeeSolutions(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_SEE_SOLUTIONS_BUTTON);
    }

    public void clickSeeSolutionsButton(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_SEE_SOLUTIONS_BUTTON);
    }
    public void clickExploreFiveGLink(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_EXPLORE_FIVE_G_LINK);
    }

    public void scrollDownToPageTitle() throws InterruptedException {
        robotScrollDown(4);
    }

    public void verifyPageHeader(String expectedText){
        softAssert.assertEquals(expectedText, WEB_ELEMENT_FIVE_G_PAGE_HEADER);
    }

    public void scrollDownToReadTheReportButton(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_SEE_READ_THE_REPORT_BUTTON);
    }

    public void clickReadTheReportButton(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_SEE_READ_THE_REPORT_BUTTON);
    }

    public void clickViewMSIButton(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_VIEW_THE_MSI_ONLINE_BUTTON);
    }

    public void VerifyPageHeaderForeword(String expectedText){
        softAssert.assertEquals(expectedText, WEB_ELEMENT_FOREWORD_HEADER);
    }

    public void scrollDownToSeeAllProducts(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_SEE_ALL_PRODUCT_LINK);
    }

    public void clickSeeAllProductsLink(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_SEE_ALL_PRODUCT_LINK);
    }

    public void clickViewDetailsInIphoneSE(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_IPHONE_VIEW_PRODUCTS);
    }

    public void verifyProductHeaderIphoneSE(String expectedText){

        softAssert.assertEquals(expectedText, WEB_ELEMENT_IPHONE_SE_HEADER);
    }

    public void changeTheColorRed(){
        implicitWait(10);
        clickByXNCssUsingJavaScript(WEB_ELEMENT_IPHONE_SE_COLOR_RED);
    }

    public void clickViewDetailsInSamsungGalaxy(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_SAMSUNG_VIEW_PRODUCTS);
    }

    public void verifyProductHeaderSamsungGalaxy(String expectedResult){

        softAssert.assertEquals(expectedResult, WEB_ELEMENT_SAMSUNG_GALAXY_HEADER);
    }

    public void addToCartSamsungGalaxy(){
        WebElement element = driver.findElement(By.xpath(WEB_ELEMENT_SAMSUNG_GALAXY_ADD_TO_CART));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", element);

    }

    public void clickContinueButton(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_SAMSUNG_GALAXY_ADD_TO_CART_CONTINUE);
    }

    public void verifyPopUpWindowHeader(String expectedText){
        softAssert.assertEquals(expectedText, WEB_ELEMENT_SAMSUNG_GALAXY_ADD_POPUP_WINDOW_HEADER);


    }

    public void clickNetworkTab(){
        WebElement element = driver.findElement(By.xpath(WEB_ELEMENT_NETWORK));
    }

    public void clickPrivateIPLearnMore(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_NETWORK_PRIVATE_IP);
    }

    public void verifyPrivateIPHeader(String expectedHeader){
        softAssert.assertEquals(expectedHeader, WEB_ELEMENT_NETWORK_PRIVATE_IP_HEADER);

    }

    @FindBy(xpath = WEB_ELEMENT_CONTACT_US )
    WebElement contactUs;

    public void clickContactUsTab(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_CONTACT_US);
    }

    public void clickStoreLocatorLink(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_CONTACT_US_STORE_LOCATOR);

    }

    public void inputTheLocationZipCode(){
        WebElement zipcode = driver.findElement(By.xpath(WEB_ELEMENT_STORE_LOCATOR_ZIP_CODE_INPUT));
        zipcode.sendKeys("20874");
    }

    public void verifyTheStoreLocatorHeader(String expectedText){
        softAssert.assertEquals(expectedText,WEB_ELEMENT_STORE_LOCATOR_HEADER);

    }

    public void scrollDownToBusinessInternet() throws InterruptedException {
        //scrollToElementUsingJavaScript(WEB_ELEMENT_FIOS_BUSINESS_INTERNET);
        robotScrollDown(8);
    }

    public void clickBusinessInternet(){
        WebElement element = driver.findElement(By.xpath(WEB_ELEMENT_FIOS_BUSINESS_INTERNET));
    }

    public void clickViewBundleButton(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_FIOS_BUSINESS_INTERNET_VIEW_BUNDLE);
    }

    public void clickOffersAndPriceLink(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_FIOS_BUSINESS_OFFERS_AND_PRICING);
    }

    public void verifyOfferAndDetails(String expectedText){
        softAssert.assertEquals(expectedText, WEB_ELEMENT_FIOS_BUSINESS_OFFERS_AND_PRICING_HEADER);

    }

    public void clickInternetAndTVLink(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_INTERNET_AND_TV);
    }
    public void clickLearnMoreInTV(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_INTERNET_AND_TV_LEARN_MORE);
    }

    public void verifyTVHeader(String expectedText){
        softAssertAssertEqualsGetText(WEB_ELEMENT_INTERNET_AND_TV_HEADER, expectedText);
    }

    public void clickSearchButton(){
        click(WEB_ELEMENT_SEARCH_BUTTON);
    }
    public void clickSearchField(){clickByXpath(WEB_ELEMENT_SEARCH_BAR);}

    public void enterValuesInSearchBar(String searchValues){
        typeOnElement(WEB_ELEMENT_SEARCH_BAR, searchValues );
    }
}
