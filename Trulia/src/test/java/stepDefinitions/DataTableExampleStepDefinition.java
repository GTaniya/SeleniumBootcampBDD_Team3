package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.support.PageFactory;

public class DataTableExampleStepDefinition extends WebAPI {
    static HomePage homePage;

    @BeforeStep
    public static void getInit(){
        homePage= PageFactory.initElements(driver,HomePage.class);
    }




}


