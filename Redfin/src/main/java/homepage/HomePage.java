package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void clickSearchButton(){click(WEB_ELEMENT_CLICK_SEARCH_BUTTON);}

    public void clickOmTheSearchBAr(){click(WEB_ELEMENT_CLICK_SEARCH_DIFFERENT_LOCATION);}

    public void searchLocationInSearchBar(String searchText){
        typeOnElement(WEB_ELEMENT_CLICK_SEARCH_DIFFERENT_LOCATION,searchText);
    }
    public void verifyingExpectedText(String expectedTextValue){
        Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_CLICK_SEARCH_DIFFERENT_LOCATION,"value"),expectedTextValue);
    }
}




