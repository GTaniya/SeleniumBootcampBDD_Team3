package mlbPage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.PrintWriter;

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
        //clickElement(driver.findElement(By.xpath(getPlayersLocators(players))));
        driver.findElement(By.xpath(getPlayersLocators(players))).click();
        implicitWait(20);
    }

    public void verifyExpectedPlayerUrl(String expectedUrl) {
        Assert.assertTrue(isUrlTrue(expectedUrl));
    }

    public void clickTeams(){click(WEB_ELEMENT_TEAMS);}

    public void clickSchedule(){clickByXpath(WEB_ELEMENT_TEAMS_SCHEDULE);}

    public void clickLosAngeles(){click(WEB_ELEMENT_TEAMS_SCHEDULE_LOS_ANGELES);}

    public void verifyLosAngelesHeader(String expectedResult){
        softAssert.assertEquals(expectedResult, WEB_ELEMENT_TEAMS_SCHEDULE_LOS_ANGELES_HEADER);
    }

    public void clickFantasyBaseball(){click(WEB_ELEMENT_FANTASY_BASEBALL);}

    public void clickStartLeagueButton(){click(WEB_ELEMENT_FANTASY_BASEBALL_START_LEAGUE_BUTTON);}

    @FindBy(xpath = WEB_ELEMENT_EMAIL_FIELD)
    WebElement emailField;

    public void clickEmailField(){
        iframeHandle(emailField);
        click(WEB_ELEMENT_EMAIL_FIELD);

    }

    public void addEmail(){
        iframeHandle(emailField);
        WebElement email = driver.findElement(By.xpath("[placeholder='Username or Email Address']"));
        email.sendKeys("taniya@gmail.com");
    }

    public void clickSignUp(){click(WEB_ELEMENT_SIGN_UP_BUTTON);}

    public void verifySignInWindow(String expectedText){
        softAssert.assertEquals(expectedText, WEB_ELEMENT_SIGN_UP_HEADER);
    }

    public void clickTeamsHeader(String teams){
        //clickElement(driver.findElement(By.xpath(getTeamsLocators(teams))));
        clickByXpath(getTeamsLocators(teams));
        implicitWait(20);
    }

    public void verifyTheNames(String expectedText){
        Assert.assertTrue(isUrlTrue(expectedText));
    }

    public void clickStandingsLink(){click(WEB_ELEMENT_STANDINGS);}

    public void clickStandingsHeader(String standings){
        clickByXpath(getStandingsLocators(standings));
        implicitWait(20);
    }

    public void verifyExpectedUrl(String expectedUrl){
        Assert.assertTrue(isUrlTrue(expectedUrl));
    }

}
