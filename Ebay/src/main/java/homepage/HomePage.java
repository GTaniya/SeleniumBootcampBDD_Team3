package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

// Action Method class

    // Find By Annotation: First Approach

    @FindBy(how = How.CSS, using = searchButtonLocator)
    public WebElement searchButton;

    public void verifyPageTitle(String expectedText) {
        String actualText = driver.getTitle();
        Assert.assertEquals("Page Title not match", expectedText, actualText);
    }

    /**
     * Send Keys
     */
    public void selectSearchField(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_FIELD_SEARCH);
    }
    public void sendKeysToField(){
        typeOnElement(WEB_ELEMENT_FIELD_SEARCH,WEB_ELEMENT_INPUT_SEARCH);
    }
    public void selectSearchButton(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_BUTTON_SEARCH);
    }
    public void verifyMacbookResultHeader(String expectedText){
        assertEqualGetText(WEB_ELEMENT_HEADER_MACBOOK,expectedText);

    }


}
