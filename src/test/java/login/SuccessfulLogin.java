package login;

import main.Main;
import org.example.login_page.LoginPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SuccessfulLogin extends Main {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = welcomePage.Login();
        loginPage.setUserId("mngr472826");
        loginPage.setPassword("apEqyre");
        loginPage.clickSubmit();
      assertTrue(loginPage.getText()
              .contains("Welcome To Manager's Page of Guru99 Bank"),
              "successfully");
    }
}
