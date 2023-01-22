package login;
import main.Main;
import org.example.login_page.LoginPage;
import org.testng.annotations.Test;
public class WrongCredentials extends Main {
    @Test
    public void testWrongPassword(){
        LoginPage loginPage = welcomePage.Login();
        loginPage.setUserId("mngr47282");
        loginPage.setPassword("apEqyre");
        loginPage.clickSubmit();
        loginPage.alert_Click();
    }
    @Test
    public void testWrongUsername() {
        LoginPage loginPage = welcomePage.Login();
        loginPage.setUserId("mngr472826");
        loginPage.setPassword("apEqyr");
        loginPage.clickSubmit();
        loginPage.alert_Click();
    }
    @Test
    public void testEmptyCredentials() {
        LoginPage loginPage = welcomePage.Login();
        loginPage.setUserId("");
        loginPage.setPassword("");
        loginPage.clickSubmit();
        loginPage.alert_Click();
    }
}
