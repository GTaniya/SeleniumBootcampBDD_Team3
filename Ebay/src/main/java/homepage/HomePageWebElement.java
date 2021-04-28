package homepage;

public class HomePageWebElement {

    public static final String WEB_ELEMENT_SEARCH_FIELD ="//input[@id='gh-ac']";
    public static final String WEB_ELEMENT_SEARCH_BUTTON_EBAY ="//input[@id='gh-ac']";

    public static final String WEB_ELEMENT_ELECTRONICS ="//ul[@class='hl-cat-nav__container']/li[@class='hl-cat-nav__js-tab']/a[.='Electronics']";
    public static final String WEB_ELEMENT_ELECTRONICS_HEADER ="//span[@class='b-pageheader__text']";

    //Search Item
    public static final String WEB_ELEMENT_SEARCH_BUTTON ="//input[@id='gh-btn']";
    public static final String WEB_ELEMENT_SAMSUNG_GALAXY ="//h3[.='Samsung Galaxy Tab A SM-T380 16GB, Wi-Fi, 8.0\" - Black']";
    public static final String WEB_ELEMENT_SAMSUNG_GALAXY_HEADER ="//h1[contains(text(),'Samsung Galaxy Tab A SM-T380 16GB, Wi-Fi, 8.0\" - B')]";

    //Fashion
    public static final String WEB_ELEMENT_FASHION ="//ul[@class='hl-cat-nav__container']/li[@class='hl-cat-nav__js-tab']/a[.='Fashion']";
    public static final String WEB_ELEMENT_FASHION_WOMEN_CLOTHING ="//div[.=\"Women's Clothing\"]";
    public static final String WEB_ELEMENT_FASHION_WOMEN_CLOTHING_JEANS ="//div[.='Jeans']";
    public static final String WEB_ELEMENT_FASHION_WOMEN_CLOTHING_JEANS_ROCK_REVIVAL ="//p[.='Rock Revival']";
    public static final String WEB_ELEMENT_FASHION_WOMEN_CLOTHING_JEANS_ROCK_REVIVAL_HEADER ="//span[@class='b-pageheader__text']";

    public static String getFashionCategoriesLocators(String fashionCategories){
        return "//div[.=\""+fashionCategories+"\"]";
    }
    public static String getHeaderLocators(String header){
        return "//span[@class='"+header+"']";
    }







}
