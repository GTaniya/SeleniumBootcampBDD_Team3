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
        softAssertAssertEqualsGetText(WEB_ELEMENT_FIVE_G_PAGE_HEADER, expectedText);
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
        softAssertAssertEqualsGetText(WEB_ELEMENT_FOREWORD_HEADER, expectedText);
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
        softAssertAssertEqualsGetText(WEB_ELEMENT_IPHONE_SE_HEADER, expectedText);
    }

    public void changeTheColorRed(){
        implicitWait(10);
        clickByXNCssUsingJavaScript(WEB_ELEMENT_IPHONE_SE_COLOR_RED);
    }

    public void clickViewDetailsInSamsungGalaxy(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_SAMSUNG_VIEW_PRODUCTS);
    }

    public void verifyProductHeaderSamsungGalaxy(String expectedResult){
        softAssertAssertEqualsGetText(WEB_ELEMENT_SAMSUNG_GALAXY_HEADER, expectedResult);
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
        softAssertAssertEqualsGetText(WEB_ELEMENT_SAMSUNG_GALAXY_ADD_POPUP_WINDOW_HEADER, expectedText);
    }

    public void clickNetworkTab(){
        WebElement element = driver.findElement(By.xpath(WEB_ELEMENT_NETWORK));
    }

    public void clickPrivateIPLearnMore(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_NETWORK_PRIVATE_IP);
    }

    public void verifyPrivateIPHeader(String expectedHeader){
        softAssertAssertEqualsGetText(WEB_ELEMENT_NETWORK_PRIVATE_IP_HEADER, expectedHeader);
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
        softAssertAssertEqualsGetText(WEB_ELEMENT_STORE_LOCATOR_HEADER, expectedText);
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
        softAssertAssertEqualsGetText(WEB_ELEMENT_FIOS_BUSINESS_OFFERS_AND_PRICING_HEADER, expectedText);
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
}
