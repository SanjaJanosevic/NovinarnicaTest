package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

    private String oldPassword = "Bongo123";
    private String newPassword = "Proka1234";
    private String repeatPassword = "Proka1234";

    @FindBy(xpath="//a[@data-popup='change-password']")
    private WebElement changePasswordButton;

    @FindBy(xpath = "//input[@id='changepasswordform-pswd']")
    private WebElement oldPasswordField;

    @FindBy(xpath = "//input[@id='changepasswordform-newpassword']")
    private WebElement newPasswordField;

    @FindBy(xpath="//input[@id='changepasswordform-passwordrepeat']")
    private WebElement repeatPasswordField;

    @FindBy(xpath = "//button[@id='change-password-btn']")
    private WebElement changePassButton;


    public MyAccountPage(ChromeDriver driver){

        super(driver);

    }

    public void clickOnChangePasswordButton(){

        changePasswordButton.click();
    }

    public void inputPasswordDetails(String oldPassword, String newPassword, String repeatPassword){

        oldPasswordField.sendKeys(oldPassword);
        newPasswordField.sendKeys(newPassword);
        repeatPasswordField.sendKeys(repeatPassword);

    }

    public void clickOnChangePassButton(){

        changePassButton.click();
    }

}
