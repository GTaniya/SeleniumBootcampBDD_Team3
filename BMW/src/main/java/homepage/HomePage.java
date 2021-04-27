package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    public void clickModelsButton(){click(WEB_ELEMENT_CLICK_MODELS_BUTTON);}

    public void clickBMWSevenSeries(){click(WEB_ELEMENT_CLICK_BMW_SEVEN_SERIES);}

    public void clickGallery(){click(WEB_ELEMENT_CLICK_GALLERY);}

    public void verifyBmwSevenSeries(String expectedText){
        softAssert.assertEquals(WEB_ELEMENT_CLICK_BMW_SEVEN_SERIES,expectedText);
    }
}






