package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public void clickSearchButton(){click(WEB_ELEMENT_cLICK_SEARCH_BUTTON);}

    public void clickSearchbar(){click(WEB_ELEMENT_SEARCH_DIFFERENT_PLACES_TO_GO);}

    public void searchPlacesToGo(String searchText){
        typeOnElement(WEB_ELEMENT_SEARCH_DIFFERENT_PLACES_TO_GO,searchText);
    }
    public void verifyExpectedTextValue(String expectedTextValue){
        Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_DIFFERENT_PLACES_TO_GO,"value"),expectedTextValue);
    }








}
