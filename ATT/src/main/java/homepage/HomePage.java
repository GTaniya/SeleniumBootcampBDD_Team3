package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

// Action Method class

    // Find By Annotation: First Approach
    @FindBy(how = How.ID, using = searchBoxLocator)
    public WebElement searchBox;
    @FindBy(how = How.XPATH, using = searchButton1Locator)
    public WebElement searchButton1;



    public void enterProductName(String productName) {
        searchBox.sendKeys(productName);
    }

    public void clickOnSearchButton1() { searchButton1.click();}

    public void verifyPageTitle(String expectedText) {
        String actualText = driver.getTitle();
        Assert.assertEquals("Page Title not match", expectedText, actualText);
    }


}
