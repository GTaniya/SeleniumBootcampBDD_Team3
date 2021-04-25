package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static homepage.HomePageWebElement.*;



public class HomePage extends WebAPI {

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public void selectSearchField(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_SEARCH_FIELD);
    }

    public void sendKeysToSearchBar(String searchText){
        typeOnElement(WEB_ELEMENT_SEARCH_FIELD,searchText);
    }

    public void verifyExpectedResultText(String expectedValue){
        Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_FIELD, "value"),expectedValue);
    }

    public void clickElectronics(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_ELECTRONICS);
    }

    public void VerifyPageHeader(String expectedHeader){
        softAssert.assertEquals(expectedHeader, WEB_ELEMENT_ELECTRONICS_HEADER);
    }

    public void clickSearchBar(){
        clickByXpath(WEB_ELEMENT_SEARCH_FIELD);
    }

    public void typeItemToSearch(){
        WebElement item = driver.findElement(By.xpath(WEB_ELEMENT_SEARCH_FIELD));
        item.sendKeys("Tablets");
    }

    public void clickSearchButton(){
        clickByXpath(WEB_ELEMENT_SEARCH_BUTTON);
    }

    public void clickSamsungGalaxy(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_SAMSUNG_GALAXY);
    }

    public void verifySamsungHeader(String expectedText){
        softAssert.assertEquals(expectedText, WEB_ELEMENT_SAMSUNG_GALAXY_HEADER);
    }
}

