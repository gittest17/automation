package login;

import base.BasePage;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTest extends BasePage {

    @Test
    public void testSuccessulLogin(){
       LoginPage loginPage = homePage.clickFormAuthentication();
       loginPage.setUserName("tomsmith");
       loginPage.setPassword("SuperSecretPassword!");
       SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
       assertTrue(secureAreaPage.getAlertText()
                       .contains("You logged into a secure area!"),
                       "Alert text is incorrect");
    }
}
