package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

        public HomePage(){
            PageFactory.initElements(driver,this);
        }

        public void clickSearchButton(){click(WEB_ELEMENT_SEARCH_BUTTON);}

        public void clickOmTheSearchBar(){click(WEB_ELEMENT_SEARCH_MERCEDES_MODELS);}

        public void searchModelsInSearchBar(String searchText){
            typeOnElement(WEB_ELEMENT_SEARCH_MERCEDES_MODELS,searchText);}

        public void verifyExpectedText(String expectedTextValue){
            Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_MERCEDES_MODELS,"value"),expectedTextValue);}

          //  public void clickMenuBar(){click(WEB_ELEMENT_SEARCH_BUTTON);}
            public void clickMenuBar(){click(WEB_ELEMENT_VEHICLES);}


            public void clickCoupesButton(){click(WEB_ELEMENT_Link_Coupes_BUTTON);}

            public void clickVehicleButton(){click(WEB_ELEMENT_Link_E_CLASS_Coupe_BUTTON);}

            public void verifyingEClassCoupe(String expectedText){
            softAssertAssertEqualsGetText(WEB_ELEMENT_Link_E_CLASS_Coupe_HEADER,expectedText);
            }
            public void clickAllVehicles(){click(WEB_ELEMENT_ALL_VEHICLES);}

            public void clickVehicles(String vehicles){
            clickByXNCssUsingJavaScript(getVehiclesLocators(vehicles));
            }
            public void verifyExpectedUrl(String expectedUrl){
            Assert.assertTrue(isUrlTrue(expectedUrl));
            }
        }


