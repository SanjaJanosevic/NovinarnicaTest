package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    String homePageUrl = "https://www.novinarnica.net/";

    @FindBy(xpath = "//a[@class='button primary user']")
    public WebElement logInButton;

    @FindBy(xpath = "//h3[contains(text(),'Preporučene knjige')]")
    public WebElement recommendedNewspapers;

    @FindBy(xpath = "//a[@href='/novine/preporucene']")
    public WebElement seeAllButton;

    @FindBy(xpath = "//a[@class='button primary user']")
    private WebElement myAccountButton;


    public HomePage(ChromeDriver driver) {

        super(driver);
        driver.get(homePageUrl);
        this.driver = driver;

    }

    public LoginPage clickOnLogInButton(ChromeDriver driver) {

        HomePage homepage = new HomePage(driver);
        homepage.logInButton.click();
        return new LoginPage(driver);
    }


    public RecommendedNewspapers clickOnSeeAllButton() {

        scrollIntoView(recommendedNewspapers);
        waitUntilVisible(seeAllButton, 5);
        waitUntilClickable(seeAllButton, 10);
        seeAllButton.click();
        return new RecommendedNewspapers(driver);
    }

    public MyAccountPage clickOnMyAccountButton() {

        HomePage homePage = new HomePage(driver);
        homePage.myAccountButton.click();
        return new MyAccountPage(driver);
    }

}


