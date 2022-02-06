package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

public class LogInTest extends BaseTest{

@Test
     public void testLogIn() {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        HomePage homepage= new HomePage(driver);
        LoginPage loginPage = homepage.clickOnLogInButton(driver);
        loginPage.logInWithValidCredentials("bucimirka@gmail.com", "Bongo123");
        driver.quit();
    }


}

