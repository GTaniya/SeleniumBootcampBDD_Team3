package mlbPage;

public class MLBPageWebElement {

    public static final String WEB_ELEMENT_MLB_TAB="//a[@name='&lpos=sitenavdefault+sitenav_mlb']//span[@class='link-text']";
    public static final String WEB_ELEMENT_STATS="//a[@name='&lpos=sitenavdefault+mlb_mlbstats']//span[@class='link-text']";

    public static String getPlayersLocators(String players){
        return "//img[@title='"+players+"']";
    }
}
