package mlbPage;

public class MLBPageWebElement {

    public static final String WEB_ELEMENT_MLB_TAB="//a[@name='&lpos=sitenavdefault+sitenav_mlb']//span[@class='link-text']";
    public static final String WEB_ELEMENT_STATS="//a[@name='&lpos=sitenavdefault+mlb_mlbstats']//span[@class='link-text']";

    public static String getPlayersLocators(String players){
        return "//img[@title='"+players+"']";
    }

    public static final String WEB_ELEMENT_TEAMS = "//a[@name='&lpos=sitenavdefault+mlb_mlbteams']//span[@class='link-text']";
    public static final String WEB_ELEMENT_TEAMS_SCHEDULE = "//a[@href='/mlb/team/schedule/_/name/chw']";
    public static final String WEB_ELEMENT_TEAMS_SCHEDULE_LOS_ANGELES = "//tr[2]//a[contains(.,'Los Angeles')]";
    public static final String WEB_ELEMENT_TEAMS_SCHEDULE_LOS_ANGELES_HEADER = "//span[@class='ClubhouseHeader__DisplayName']";

    public static final String WEB_ELEMENT_FANTASY_BASEBALL = "//a[@name='&lpos=sitenavdefault+mlb_mlbfantasy_baseball']//span[@class='link-text']";
    public static final String WEB_ELEMENT_FANTASY_BASEBALL_START_LEAGUE_BUTTON = "//button[.='Start a New League']";

    public static final String WEB_ELEMENT_EMAIL_FIELD = "//input[@class='ng-pristine ng-invalid ng-invalid-required ng-valid-pattern ng-touched']";
    public static final String WEB_ELEMENT_SIGN_UP_BUTTON = "//a[.='Sign Up']";
    public static final String WEB_ELEMENT_SIGN_UP_HEADER = "//h2[@class='title title-primary ng-isolate-scope']";

    public static String getTeamsLocators(String teams){
        return "//h2[.='"+teams+"']";
    }

    public static final String WEB_ELEMENT_STANDINGS = "//a[@name='&lpos=sitenavdefault+mlb_mlbstandings']//span[@class='link-text']";

    public static String getStandingsLocators(String standings){
        return "//img[@title='"+standings+"']";
    }
}
