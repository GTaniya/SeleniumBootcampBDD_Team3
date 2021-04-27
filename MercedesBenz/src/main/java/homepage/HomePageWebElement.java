package homepage;

public class HomePageWebElement {

    public static final String WEB_ELEMENT_SEARCH_BUTTON ="//button[@class='global-header__menu-l1-list-button global-header__menu-l1-list-button--search icon-mb icon-search']";

    public static final String WEB_ELEMENT_SEARCH_MERCEDES_MODELS ="//input[@name='search']";

    //select vehicle

    public static final String WEB_ELEMENT_VEHICLES ="//button[.='Vehicles']";

    public static final String WEB_ELEMENT_Link_Coupes_BUTTON  ="//ul[@class='global-header__menu-l3-tabs']//button[.='Coupes']";

    public static final String WEB_ELEMENT_Link_E_CLASS_Coupe_BUTTON  ="//p[.='E-Class Coupe']";

    public static final String WEB_ELEMENT_Link_E_CLASS_Coupe_HEADER ="//h2[@class='three-up-module__header']";

    public static final String WEB_ELEMENT_ALL_VEHICLES ="//p[.='ALL VEHICLES']";

    public static String getVehiclesLocators(String vehicles){
        return "//img[@alt='"+vehicles+"']";
    }







}
