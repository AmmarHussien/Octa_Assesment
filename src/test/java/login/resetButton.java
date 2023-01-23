package login;

import main.Main;
import org.example.login_page.LoginPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class resetButton extends Main {

    @Test
    public void TestResetButton(){
        LoginPage loginPage = welcomePage.login();
        loginPage.setUserId("mngr47282");
        loginPage.setPassword("apEqyre");
        loginPage.clickReset();
        assertTrue(loginPage.getUserID()
                        .contains(""),
                "successfully");
        assertTrue(loginPage.getUserPassword()
                        .contains(""),
                "successfully");
    }
}
