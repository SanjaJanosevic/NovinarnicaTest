package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public ChromeDriver driver;

    @FindBy(xpath = "//div[@class='right phone-hide']//input[@placeholder='pretraga']")
    public WebElement searchField;

    @FindBy(xpath = "//div[@class='right phone-hide']//descendant::button")
    public WebElement searchButton;


    public BasePage(ChromeDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void waitUntilVisible(WebElement webElement, int timeOutInSeconds) {

        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(webElement));

    }

    public void waitUntilClickable(WebElement webElement, int timeOutInSeconds) {

        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));

    }

    public void scrollIntoView(WebElement element) {

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public Products searchProducts(String item, ChromeDriver driver) {

        BasePage page = new BasePage(driver);
        page.searchField.sendKeys(item);
        page.waitUntilClickable(page.searchButton, 5);
        page.searchButton.click();
        return new Products(driver);

    }

}
