package fashionPage;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static fashionPage.FashionPageWebElement.*;

public class FashionPage extends WebAPI {

    public FashionPage() {
        PageFactory.initElements(driver,this);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////

 public void clickJewelryDropDown(){
        click( WEB_ELEMENT_LINK_JEWELRY);
 }
 public void clickFashionEarrings(){
        click(WEB_ELEMENT_LINK_FASHION_EARRING);
 }
 public void scrollToPinkBox(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_CHECK_BOX_PINK);
 }
 public void clickOnPinkCheckBox(){
        click(WEB_ELEMENT_CHECK_BOX_PINK);
 }
 public void verifyPinkEarringHeader(String expectedText){
        softAssertAssertEqualsGetText(WEB_ELEMENT_HEADER_PINK_EARRINGS,expectedText);

 }
 public void clickOnDropEarrings(){
        click(WEB_ELEMENT_LINK_DROP_EARRINGS);
 }
 public void verifyDropEarringPrice(String expected){
        softAssertAssertEqualsGetText(WEB_ELEMENT_SEARCH_EARRINGS_PRICE,expected);
 }
 public void clickSearchBar(){
        click(WEB_ELEMENT_SEARCH_BAR);
 }
 public void searchItemsInSearchBar(String searchText){
        typeOnElement(WEB_ELEMENT_SEARCH_BAR,searchText);
 }
 public void verifyingExpectedValue(String expectedValue){
     Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_BAR,"value"),expectedValue);
 }
 public void verifyNotExpectedValue(String notExpectedValue){
        Assert.assertNotEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_BAR,"value"),notExpectedValue);
 }
 public void verifyExpectedUrl(String expectedUrl){
        Assert.assertFalse(isUrlTrue(expectedUrl));

 }
}
