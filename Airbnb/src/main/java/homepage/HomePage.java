package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

    public void clickOnTheSearchBar(){click(WEB_ELEMENT_CLICK_SEARCH_BAR);}
    public void  searchLocation(){}


}
