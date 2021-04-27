package internetpage;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static internetpage.InternetWebElement.*;

public class InternetPage extends WebAPI {
    public InternetPage(){ PageFactory.initElements(driver,this); }

    public void clickInternetPage(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_INTERNET_PAGE);
    }

    public void clickPlansPrices(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_PLANS_PRICES);
    }

    public void ScrollDowntoLearnMore(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_LEARN_MORE);
    }

    public void clickLearnMore(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_LEARN_MORE);
    }

    public void verifyPageHeader(String expectedText){
       softAssert.assertEquals(expectedText, WEB_ELEMENT_FEATURES_PRICE_HEADER);
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
