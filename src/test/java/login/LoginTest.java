package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginSuccess()
    {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        SecureAreaPage secureAreaPage=  loginPage.clickLoginBtn();
        secureAreaPage.getAlertText();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),
                   "Alert test is incorrect!");


    }
}
