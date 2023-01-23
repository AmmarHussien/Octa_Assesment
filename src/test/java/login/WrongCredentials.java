package login;
import main.Main;
import org.example.login_page.LoginPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class WrongCredentials extends Main {
    @Test
    public void testWrongPassword(){
        LoginPage loginPage = welcomePage.login();
        loginPage.setUserId("mngr47282");
        loginPage.setPassword("apEqyre");
        loginPage.clickSubmit();
        assertTrue(loginPage.getTextFromAlert()
                        .contains("User or Password is not valid"),
                "successfully");
        loginPage.alert_Click();
    }
    @Test
    public void testWrongUsername() {
        LoginPage loginPage = welcomePage.login();
        loginPage.setUserId("mngr472826");
        loginPage.setPassword("apEqyr");
        loginPage.clickSubmit();
        assertTrue(loginPage.getTextFromAlert()
                        .contains("User or Password is not valid"),
                "successfully");
        loginPage.alert_Click();
    }
    @Test
    public void testEmptyCredentials() {
        LoginPage loginPage = welcomePage.login();
        loginPage.setUserId("");
        loginPage.setPassword("");
        loginPage.clickSubmit();
        assertTrue(loginPage.getTextFromAlert()
                        .contains("User or Password is not valid"),
                "successfully");
        loginPage.alert_Click();
    }
}
