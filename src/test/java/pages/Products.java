package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Products extends BasePage{

    @FindBy(xpath = "//h4[contains(text(),'Mačka među golubovima')]")
    public WebElement book;

    public Products(ChromeDriver driver) {
        super(driver);

    }

    public Books clickOnBook() {

        book.click();
        return new Books(driver);

    }

    public Cart addToCart() {

        Books book= new Books(driver);
        book.addToCartButton.click();
        return new Cart(driver);

    }

}
