package videogamesConsoles;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;

import static videogamesConsoles.VideogamesConsolesWebElement.*;

public class VideogamesConsolesPage extends WebAPI {
    public VideogamesConsolesPage(){
        PageFactory.initElements(driver,this);
    }

    public void clickSearchBar(){
        clickByXNCssUsingJavaScript(WEB_ELEMENT_SEARCH_BAR);
    }
}
