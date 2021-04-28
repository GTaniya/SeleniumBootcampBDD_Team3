package buildYourOwn;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static buildYourOwn.BuildYourOwnWebElement.*;

public class BuildYourOwnPage extends WebAPI {
    public BuildYourOwnPage(){
        PageFactory.initElements(driver,this);
    }

    public void clickSearchButton(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_SEARCH_BUTTON);
    }
    public void clickSearchBar() { clickByXNCssUsingJavaScript(WEB_ELEMENT_SEARCH_BAR); }
    public void SendKeysToSearchBar(String SearchValue){
        typeOnElement(WEB_ELEMENT_SEARCH_BAR, SearchValue);
    }
    public void SendKeysToExpectedValue(String ExpectedValue) { Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_BAR, "value"), ExpectedValue); }
    public void VerifyExpectedURL(String ExpectedURL){
        Assert.assertTrue(isUrlTrue(ExpectedURL));
    }
}
