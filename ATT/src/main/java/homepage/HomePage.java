package homepage;

import common.WebAPI;
import org.junit.Assert;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

    public void clickHomeAndDevice(){click(WEB_ELEMENT_CLICK_HOME_AND_DEVICES);}

    public void scrollDownAndClickIphone12(){scrollToElementUsingJavaScript(WEB_ELEMENT_SCROLL_DOWN_AND_CLICK_IPHONE_12);}

    public void clickIphoneTwelve(){click(WEB_ELEMENT_SCROLL_DOWN_AND_CLICK_IPHONE_12);}

    public void verifyIphoneTwelveHeader(String expectedText){
        softAssertAssertEqualsGetText(WEB_ELEMENT_HEADER_IPHONE_12,expectedText);
    }
    public void clickSearchBar(){click(WEB_ELEMENT_CLICK_ON_THE_SEARCH_BAR);}

    public void searchItemsInTheSearchBar(String searchText){
        typeOnElement(WEB_ELEMENT_CLICK_ON_THE_SEARCH_BAR,searchText);
    }
    public void verifyExpectedValue(String expectedValue){
        Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_CLICK_ON_THE_SEARCH_BAR,"value"),expectedValue);
    }




}
