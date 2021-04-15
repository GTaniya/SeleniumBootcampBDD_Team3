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

    @FindBy(how = How.CSS, using = searchButtonLocator)
    public WebElement searchButton;
    @FindBy(how = How.ID, using = searchBoxLocator)
    public WebElement searchBox;



    public void enterProductName(String productName) {
        searchBox.sendKeys(productName);
    }

    public void clickOnSearchButton() {
        searchButton.click();
    }

    public void verifyPageTitle(String expectedText) {
        String actualText = driver.getTitle();
        Assert.assertEquals("Page Title not match", expectedText, actualText);
    }


}
