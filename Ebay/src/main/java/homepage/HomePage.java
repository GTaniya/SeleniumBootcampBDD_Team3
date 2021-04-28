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

    @FindBy (xpath = WEB_ELEMENT_SEARCH_BUTTON)
    public WebElement searchButton;

    public void selectSearchField(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_SEARCH_FIELD);
    }

    public void sendKeysToSearchBar(String searchText){
        typeOnElement(WEB_ELEMENT_SEARCH_FIELD,searchText);

    }

    public void verifyExpectedResultText(String expectedValue){
        Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_FIELD, "value"),expectedValue);
    }

    public void verifyExpectedUrl(String expectedUrl){
        Assert.assertTrue(isUrlTrue(expectedUrl));
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
    public void sendValues(String searchValue){
        typeOnElement(WEB_ELEMENT_SEARCH_FIELD, searchValue);
        //searchButton.click();
        clickByXNCssUsingJavaScript(WEB_ELEMENT_SEARCH_BUTTON);

    }

    public void verifyExpectedValues(String expectedValues){
        Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_FIELD, "value"),expectedValues);
    }

    public void clickOnFashionLink(){click(WEB_ELEMENT_FASHION);}

    public void clickWomenClothing(){
        WebElement element = driver.findElement(By.xpath(WEB_ELEMENT_FASHION_WOMEN_CLOTHING));
    }

    public void clickJeans(){clickByXNCssUsingJavaScript(WEB_ELEMENT_FASHION_WOMEN_CLOTHING_JEANS);}

    public void clickRockRevival(){click(WEB_ELEMENT_FASHION_WOMEN_CLOTHING_JEANS_ROCK_REVIVAL);}

    public void VerifyJeansHeader(String expectedValue){
        softAssert.assertEquals(expectedValue, WEB_ELEMENT_FASHION_WOMEN_CLOTHING_JEANS_ROCK_REVIVAL_HEADER);
    }

    public void selectFashionCategories(String fashionCategories){
            clickElement(driver.findElement(By.xpath(getFashionCategoriesLocators(fashionCategories))));
            implicitWait(20);
        }

    public void selectHeaders(String expectedHeader){
        softAssert.assertEquals(expectedHeader, getHeaderLocators(expectedHeader));
    }

    public void verifyUrl(String expectedUrl){Assert.assertTrue(isUrlTrue(expectedUrl));}
    }


