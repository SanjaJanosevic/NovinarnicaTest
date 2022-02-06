package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.Products;

public class ChangePasswordTest {

@Test
    public void ChangePassword(){

    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    HomePage homepage= new HomePage(driver);
    LoginPage loginPage = homepage.clickOnLogInButton(driver);
    loginPage.logInWithValidCredentials("bucimirka@gmail.com", "Bongo123");
    MyAccountPage myAccount = homepage.clickOnMyAccountButton();
    myAccount.clickOnChangePasswordButton();
    myAccount.inputPasswordDetails("Bongo123","Proka1234","Proka1234");
    myAccount.clickOnChangePassButton();
    driver.quit();

}

}
