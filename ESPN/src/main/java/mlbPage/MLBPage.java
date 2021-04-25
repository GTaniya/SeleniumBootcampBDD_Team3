package mlbPage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static mlbPage.MLBPageWebElement.*;

public class MLBPage extends WebAPI {

    public MLBPage(){
        PageFactory.initElements(driver, this);
    }

    public void clickMLBTab(){click(WEB_ELEMENT_MLB_TAB);}
    public void clickStatsTab(){
        clickByXpath(WEB_ELEMENT_STATS);
    }

    public void clickPlayersImage(String players){
        clickElement(driver.findElement(By.xpath(getPlayersLocators(players))));
    }
}
