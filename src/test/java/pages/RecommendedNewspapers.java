package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class RecommendedNewspapers extends BasePage{

    @FindBy(xpath = "//a[contains(text(),'Kuća & Bašta')]")
    public WebElement houseAndGardenCategory;

    public RecommendedNewspapers(ChromeDriver driver) {

        super(driver);

    }

    public HouseAndGarden clickOnCategory( ChromeDriver driver) {

        RecommendedNewspapers newspapers = new RecommendedNewspapers(driver);
        newspapers.houseAndGardenCategory.click();
        return new HouseAndGarden(driver);
    }

}

