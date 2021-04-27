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

    public void clickMenuBar(){click(WEB_ELEMENT_CLICK_MENU_BAR);
    }
    public void scrollDown(){scrollToElementUsingJavaScript(WEB_ELEMENT_CLICK_INVESTMENT_BUTTON);}

    public void clickInvestmentButton(){click(WEB_ELEMENT_CLICK_INVESTMENT_BUTTON);}

    public void clickInvestmentPlanning() {
        click(WEB_ELEMENT_CLICK_INVESTMENT_PLANNING);
    }
        public void clickRetirementButton () {
            click(WEB_ELEMENT_CLICK_RETIREMENT_BUTTON);
        }
        public void verifyRetirementHeader(String expectedText){
         softAssert.assertEquals(expectedText,WEB_ELEMENT_RETIREMENT_HEADER);
        }
    }




