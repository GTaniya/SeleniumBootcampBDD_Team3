package videogamesConsoles;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static videogamesConsoles.VideogamesConsolesWebElement.*;

public class VideogamesConsolesPage extends WebAPI {
    public VideogamesConsolesPage(){
        PageFactory.initElements(driver,this);
    }

    public void clickSearchBar(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_SEARCH_BAR);
    }
    public void SendKeysToSearchBar(String SearchValue){
        typeOnElement(WEB_ELEMENT_SEARCH_BAR, SearchValue);
    }
    public void SendKeysToExpectedValue(String ExpectedValue){
        Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_BAR, "value"), ExpectedValue);
    }
    public void VerifyExpectedURL(String ExpectedURL){
        Assert.assertTrue(isUrlTrue(ExpectedURL));
    }
}

