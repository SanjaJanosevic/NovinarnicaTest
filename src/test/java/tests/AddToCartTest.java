package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.Products;

public class AddToCartTest extends BaseTest{

@Test
    public void AddToCart() {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        HomePage homepage = new HomePage(driver);
        Products products = homepage.searchProducts("Agata Kristi", driver);
        products.clickOnBook();
        products.addToCart();
        driver.quit();
    }

}
