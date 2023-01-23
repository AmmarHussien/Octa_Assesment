package addNewCustomer;

import main.Main;
import org.example.login_page.LoginPage;
import org.example.new_customer.NewCustomer;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class pinTest extends Main {
    @Test
    public void testCharactersInPin () {
        LoginPage loginPage = welcomePage.login();
        loginPage.setUserId("mngr472826");
        loginPage.setPassword("apEqyre");
        loginPage.clickSubmit();
        assertTrue(loginPage.getText()
                        .contains("Welcome To Manager's Page of Guru99 Bank"),
                "successfully");
        NewCustomer newCustomer = welcomePage.addNewCustomer();
        newCustomer.setCustomerPIN("sdksdjh");
        assertTrue(newCustomer.getCustomerPinValidation()
                        .contains("Characters are not allowed"),
                "successfully");
    }
    @Test
    public void testEmptyPin () {
        LoginPage loginPage = welcomePage.login();
        loginPage.setUserId("mngr472826");
        loginPage.setPassword("apEqyre");
        loginPage.clickSubmit();
        assertTrue(loginPage.getText()
                        .contains("Welcome To Manager's Page of Guru99 Bank"),
                "successfully");
        NewCustomer newCustomer = welcomePage.addNewCustomer();
        newCustomer.setCustomerPIN("");
        newCustomer.setCustomerGender("f");
        assertTrue(newCustomer.getCustomerPinValidation()
                        .contains("PIN Code must not be blank"),
                "successfully");
    }
    @Test
    public void testNotGetTheMinimum () {
        LoginPage loginPage = welcomePage.login();
        loginPage.setUserId("mngr472826");
        loginPage.setPassword("apEqyre");
        loginPage.clickSubmit();
        assertTrue(loginPage.getText()
                        .contains("Welcome To Manager's Page of Guru99 Bank"),
                "successfully");
        NewCustomer newCustomer = welcomePage.addNewCustomer();
        newCustomer.setCustomerPIN("1234");
        assertTrue(newCustomer.getCustomerPinValidation()
                        .contains("PIN Code must have 6 Digits"),
                "successfully");
    }
    @Test
    public void testSpaceInPin() {
        LoginPage loginPage = welcomePage.login();
        loginPage.setUserId("mngr472826");
        loginPage.setPassword("apEqyre");
        loginPage.clickSubmit();
        assertTrue(loginPage.getText()
                        .contains("Welcome To Manager's Page of Guru99 Bank"),
                "successfully");
        NewCustomer newCustomer = welcomePage.addNewCustomer();
        newCustomer.setCustomerPIN(" ");
        assertTrue(newCustomer.getCustomerPinValidation()
                        .contains("First character can not have space"),
                "successfully");
    }
}
