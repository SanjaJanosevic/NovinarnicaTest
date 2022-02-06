package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.Products;

public class SearchProductsTest extends BaseTest{

@Test
    public void searchProductsTest(){

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        HomePage homepage = new HomePage(driver);
        Products products = homepage.searchProducts("Peter Handke", driver);
        driver.quit();
    }

}
