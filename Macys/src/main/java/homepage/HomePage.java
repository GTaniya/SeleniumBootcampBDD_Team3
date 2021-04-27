package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

    public void clickSearchInput(){click(WEB_ELEMENT_CLICK_SEARCH_INPUT);}

    public void searchItemsInSearchBar(String searchText){
        typeOnElement(WEB_ELEMENT_CLICK_SEARCH_INPUT,searchText);
        click(WEB_ELEMENT_CLICK_SEARCH_ITEMS);
    }
    public void verifyingExpectedTextValue(String expectedText){
        Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_CLICK_SEARCH_INPUT,"value"),expectedText);
    }

}
