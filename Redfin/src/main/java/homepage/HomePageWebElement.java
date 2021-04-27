package homepage;

public class HomePageWebElement {


    public static final String WEB_ELEMENT_SELL_TAB ="//a[.='Sell ▾']";
    //public static final String WEB_ELEMENT_SELL_TAB ="//a[@id='topMenuRealEstateAgentsLink']";
    public static final String WEB_ELEMENT_SELL_TAB_OFFERS ="//span[.=', your agent has the experience to negotiate the best offer for you.']";
    public static final String WEB_ELEMENT_SELL_PAGE_HEADER ="//span[.='Better agents. Lower fees.']";

    //Help
    public static final String WEB_ELEMENT_HELP ="//a[.='Help']";
    public static final String WEB_ELEMENT_HELP_CONTROLLING_ALERTS ="//h4[contains(.,'Controlling your Account & Alerts')]";
    public static final String WEB_ELEMENT_HELP_CONTROLLING_ALERTS_HEADER ="//h1[contains(.,'Controlling your Account & Alerts')]";
    public static final String WEB_ELEMENT_HELP_LOGIN_WITH_FACEBOOK_OR_GOOGLE ="//a[.='Log in with Facebook or Google +']";
    public static final String WEB_ELEMENT_HELP_LOGIN_WITH_FACEBOOK_OR_GOOGLE_HEADER ="//a[.='Log in with Facebook or Google +']";

    //Password
    public static final String WEB_ELEMENT_HELP_PASSWORD_RESET ="//a[.='Password Reset']";
    public static final String WEB_ELEMENT_HELP_PASSWORD_RESET_CLICK_YES ="//div[@class='article-votes-controls']/a[1]";
    public static final String WEB_ELEMENT_HELP_PASSWORD_RESET_HEADER ="//h1[@class='article-title']";

    //Jobs
    public static final String WEB_ELEMENT_JOBS ="//a[.='Jobs']";
    public static final String WEB_ELEMENT_JOBS_SEE_ALL_DEPARTMENT ="//div[@class='banner-contents']//span[.='See All Departments']";
    public static final String WEB_ELEMENT_JOBS_SEE_ALL_DEPARTMENT_INTERNSHIPS ="//h2[.='Internships & Early Career']";
    public static final String WEB_ELEMENT_JOBS_SEE_ALL_DEPARTMENT_INTERNSHIPS_HEADER ="//span[.='Internships & Early Career at Redfin']";
    public static final String WEB_ELEMENT_JOBS_SEE_ALL_DEPARTMENT_INTERNSHIPS_DATA_ENGINEER="//a[.='Data Engineer Intern']";
    public static final String WEB_ELEMENT_JOBS_SEE_ALL_DEPARTMENT_INTERNSHIPS_DATA_ENGINEER_HEADER="//h1[.='Data Engineer Intern']";

    //Real State
    public static final String WEB_ELEMENT_JOBS_REAL_STATE="//h2[.='Real Estate']";
    public static final String WEB_ELEMENT_JOBS_REAL_STATE_AGENT_LEARN_MORE="//a[@href='/careers/real-estate/agents']/span[.='Learn More']";
    public static final String WEB_ELEMENT_JOBS_REAL_STATE_AGENT_LEARN_MORE_HEADER="//span[contains(text(),'Redfin sets you up for success')]";
    public static final String WEB_ELEMENT_JOBS_REAL_STATE_AGENT_APPLY_NOW ="//div[@class='cta']//span[.='Apply Now']";
    public static final String WEB_ELEMENT_JOBS_REAL_STATE_AGENT_APPLY_NOW_HEADER ="//h2[@class='fs-title cApplyUtils cContactInfo']";

    //Contact Us
    public static final String WEB_ELEMENT_CONTACT_US ="//a[.='Contact Us']";
    public static final String WEB_ELEMENT_CONTACT_US_MESSAGE ="//div[@class='ContactUsOptions topOfPage']//span[.='Message us']";
    public static final String WEB_ELEMENT_CONTACT_US_MESSAGE_HEADER ="//h1[contains(.,'Submit a request')]";
    public static final String WEB_ELEMENT_CONTACT_US_MESSAGE_DROP_DOWN ="//a[.='-']";
    public static final String WEB_ELEMENT_CONTACT_US_MESSAGE_DROP_DOWN_ASSISTANCE ="//a[.='Customer looking for: Technical Assistance']";

    //Send Keys To Search bar
    public static final String WEB_ELEMENT_SEARCH_BAR ="//div[@class='searchInputNode']//input[@id='search-box-input']";
    public static final String WEB_ELEMENT_SEARCH_SUBMIT_BUTTON ="//div[@class='SearchBox showResults']//button[@class='inline-block SearchButton clickable float-right']";

    //Click Links Using Table
    public static final String WEB_ELEMENT_CALIFORNIA_HOME_F0R_SALE ="//a[@href='/state/California']";

    public static String getCityLinkLocators(String cities){
        return "//a[.='"+cities+"']";
    }

}
