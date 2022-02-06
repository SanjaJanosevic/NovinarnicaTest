package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Books extends BasePage{

    @FindBy(css = ".button.primary.bag.block.add-to-cart")
    public WebElement addToCartButton;

    public Books(ChromeDriver driver) {

        super(driver);
    }

}

