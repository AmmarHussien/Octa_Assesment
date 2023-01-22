package login;
import main.Main;
import org.example.login_page.LoginPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class validationMassage extends Main {

    @Test
    public void testUserIdValidationMessage() {
        LoginPage loginPage = welcomePage.Login();
        loginPage.clickUserID();
        loginPage.setPassword("apEqyre");
        assertTrue(loginPage.getUserNameValidationMassage()
                        .contains("User-ID must not be blank"),
                "successfully");
    }
    @Test
    public void testPasswordIdValidationMessage() {
        LoginPage loginPage = welcomePage.Login();
        loginPage.clickPassword();
        loginPage.setUserId("test");
        assertTrue(loginPage.getUserPasswordValidationMassage()
                        .contains("Password must not be blank"),
                "successfully");
    }
    @Test
    public void testValidationMassage (){
        LoginPage loginPage = welcomePage.Login();
        loginPage.clickUserID();
        loginPage.clickPassword();
        loginPage.clickUserID();
        assertTrue(loginPage.getUserNameValidationMassage()
                        .contains("User-ID must not be blank"),
                "successfully");
        assertTrue(loginPage.getUserPasswordValidationMassage()
                        .contains("Password must not be blank"),
                "successfully");
    }
}
