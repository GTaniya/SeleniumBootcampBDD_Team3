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
    public void clickCreditCardsButton(){click(WEB_ELEMENT_CLICK_CREDIT_CARDS);}

    public void clickCashRewardCards(){click(WEB_ELEMENT_CLICK_CASH_REWARDS_CARD_BUTTON);}


    public void verifyExpectedText(String expectedTextValue){
        Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_LINK_CASH_BACK_CREDIT_CARD_HEADER,"value"),expectedTextValue);
    }



}
