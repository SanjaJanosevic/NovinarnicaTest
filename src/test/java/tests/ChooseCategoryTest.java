package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.HouseAndGarden;
import pages.RecommendedNewspapers;

public class ChooseCategoryTest extends BaseTest{

 @Test
     public void chooseCategory() {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        HomePage page = new HomePage(driver);
        page.scrollIntoView(page.seeAllButton);
        RecommendedNewspapers newspapers = page.clickOnSeeAllButton();
        HouseAndGarden magazines = newspapers.clickOnCategory(driver);
        driver.quit();

    }


}
