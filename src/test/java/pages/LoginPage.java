package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    private String email = "***@gmail.com";
    private String password = "***";


    @FindBy(xpath = "//input[@id='loginformmodel-username']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='loginformmodel-password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@value='Uloguj se']")
    private WebElement signInButton;


    public LoginPage(ChromeDriver driver) {

        super(driver);

    }

    public void enterValidCredentials(String email, String password) {

        emailField.sendKeys(email);
        passwordField.sendKeys(password);
    }

    public void clickSignInButton() {

        signInButton.click();
    }

    public void logInWithValidCredentials(String email, String password) {

        enterValidCredentials(email, password);
        clickSignInButton();
    }


}

