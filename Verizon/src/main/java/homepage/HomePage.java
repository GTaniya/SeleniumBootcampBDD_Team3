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
    public void clickShopMenu(){click(WEB_ELEMENT_CLICK_SHOP_LIST);}

    public void clickAccessories(){click(WEB_ELEMENT_CLICK_ACCESSORIES);}

    public void clickCasesAndPROTECTION(){click(WEB_ELEMENT_CLICK_CASES_AND_PROTECTION);}

    public void clickIphoneCases(){click(WEB_ELEMENT_CLICK_IPHONE_CASES);}

    public void verifyIphoneCases(String expectedText){
        softAssert.assertEquals(WEB_ELEMENT_VERIFY_IPHONE_CASES,expectedText);
    }



}
