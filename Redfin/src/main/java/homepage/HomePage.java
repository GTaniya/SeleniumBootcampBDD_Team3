package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.PrintWriter;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public void clickSell(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_SELL_TAB);
    }

    public void scrollDownToOffers(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_SELL_TAB_OFFERS);
    }

    public void clickSellOffers(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_SELL_TAB_OFFERS);
    }

    public void verifyHeaderSell(String expectedText){
        softAssert.assertEquals(expectedText,WEB_ELEMENT_SELL_PAGE_HEADER);

    }

    public void scrollDownToBottomOfThePage(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void clickHelpLink(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_HELP);
    }

    public void clickControllingAlertsButton(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_HELP_CONTROLLING_ALERTS);
    }

    public void verifyControllingAlertsPageHeader(String expectedText){
        softAssert.assertEquals(expectedText,WEB_ELEMENT_HELP_CONTROLLING_ALERTS_HEADER);

    }

    public void clickHelpFacebookGoogleLogin(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_HELP_LOGIN_WITH_FACEBOOK_OR_GOOGLE);
    }

    public void VerifyHeaderFacebookGoogleHeader(String expectedText){
        softAssertAssertEqualsGetText(WEB_ELEMENT_HELP_LOGIN_WITH_FACEBOOK_OR_GOOGLE_HEADER, expectedText);
    }

    public void clickPasswordRestLink(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_HELP_PASSWORD_RESET);
    }

    public void scrollDownToClickYes(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_HELP_PASSWORD_RESET_CLICK_YES);
    }

    public void clickYes(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_HELP_PASSWORD_RESET_CLICK_YES);
    }

    public void verifyPasswordResetPageHeader(String expectedText){
        softAssert.assertEquals(expectedText,WEB_ELEMENT_HELP_PASSWORD_RESET_HEADER);

    }

    public void clickJobsLink(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_JOBS);
    }

    public void clickSeeAllDepartmentButton(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_JOBS_SEE_ALL_DEPARTMENT);
    }

    public void scrollDownToEarlyCareers(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_JOBS_SEE_ALL_DEPARTMENT_INTERNSHIPS);
    }

    public void clickEarlyCareers(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_JOBS_SEE_ALL_DEPARTMENT_INTERNSHIPS);
    }

    public void verifyInternshipHeader(String expectedHeader){
        softAssert.assertEquals(expectedHeader,WEB_ELEMENT_JOBS_SEE_ALL_DEPARTMENT_INTERNSHIPS_HEADER);
    }

    public void clickDataEngineerJob(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_JOBS_SEE_ALL_DEPARTMENT_INTERNSHIPS_DATA_ENGINEER);
    }

    public void verifyDataEngineerHeader(String expectedText){
        softAssert.assertEquals(expectedText,WEB_ELEMENT_JOBS_SEE_ALL_DEPARTMENT_INTERNSHIPS_DATA_ENGINEER_HEADER);

    }

    public void ScrollDownRealState(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_JOBS_REAL_STATE);
    }

    public void clickRealState(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_JOBS_REAL_STATE);
    }

    public void clickLearnMore(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_JOBS_REAL_STATE_AGENT_LEARN_MORE);
    }

    public void verifyRealStateAgentHeader(String expectedText){
        softAssert.assertEquals(expectedText,WEB_ELEMENT_JOBS_REAL_STATE_AGENT_LEARN_MORE_HEADER);

    }

    public void clickApplyNowButton(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_JOBS_REAL_STATE_AGENT_APPLY_NOW);
    }

    public void verifyApplyNowHeader(String expectedText){

        softAssertAssertEqualsGetText(WEB_ELEMENT_JOBS_REAL_STATE_AGENT_APPLY_NOW_HEADER, expectedText);
    }

    public void scrollToContactUs(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_CONTACT_US);
    }
    public void clickContactUs(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_CONTACT_US);
    }

    public void clickMessageUs(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_CONTACT_US_MESSAGE);
    }

    public void verifySubmitRequestHeader(String expectedText){
        softAssert.assertEquals(expectedText,WEB_ELEMENT_CONTACT_US_MESSAGE_HEADER);

    }

    public void clickDropDownMenu(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_CONTACT_US_MESSAGE_DROP_DOWN);
    }

    public void clickTechnicalAssistance(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_CONTACT_US_MESSAGE_DROP_DOWN_ASSISTANCE);
    }


    public void selectSearchField(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_SEARCH_BAR);
    }

    public void sendKeysToSearchBar(String searchText){
        typeOnElement(WEB_ELEMENT_SEARCH_BAR,searchText);
    }

    public void verifyExpectedResultText(String expectedText){
        Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_BAR, "value"),expectedText);
    }

    public void verifyNotExpectedValue(String notExpectedText){
        Assert.assertNotEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_BAR, "value"),notExpectedText);
    }

    public void verifyExpectedUrl(String expectedUrl){
        Assert.assertTrue(isUrlTrue(expectedUrl));
    }
}
