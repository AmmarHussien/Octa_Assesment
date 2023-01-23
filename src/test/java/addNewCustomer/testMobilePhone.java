package addNewCustomer;

import main.Main;
import org.example.login_page.LoginPage;
import org.example.new_customer.NewCustomer;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class testMobilePhone extends Main {
    @Test
    public void testCharactersInMobilePhone () {
        LoginPage loginPage = welcomePage.login();
        loginPage.setUserId("mngr472826");
        loginPage.setPassword("apEqyre");
        loginPage.clickSubmit();
        assertTrue(loginPage.getText()
                        .contains("Welcome To Manager's Page of Guru99 Bank"),
                "successfully");
        NewCustomer newCustomer = welcomePage.addNewCustomer();
        newCustomer.setCustomerPhoneNumber("sdksdjh");
        assertTrue(newCustomer.getCustomerPhoneValidation()
                        .contains("Characters are not allowed"),
                "successfully");
    }
    @Test
    public void testEmptyPhoneNumber () {
        LoginPage loginPage = welcomePage.login();
        loginPage.setUserId("mngr472826");
        loginPage.setPassword("apEqyre");
        loginPage.clickSubmit();
        assertTrue(loginPage.getText()
                        .contains("Welcome To Manager's Page of Guru99 Bank"),
                "successfully");
        NewCustomer newCustomer = welcomePage.addNewCustomer();
        newCustomer.setCustomerPhoneNumber("");
        newCustomer.setCustomerGender("f");
        assertTrue(newCustomer.getCustomerPhoneValidation()
                        .contains("Mobile no must not be blank"),
                "successfully");
    }
    @Test
    public void testSpaceInPhoneNumber() {
        LoginPage loginPage = welcomePage.login();
        loginPage.setUserId("mngr472826");
        loginPage.setPassword("apEqyre");
        loginPage.clickSubmit();
        assertTrue(loginPage.getText()
                        .contains("Welcome To Manager's Page of Guru99 Bank"),
                "successfully");
        NewCustomer newCustomer = welcomePage.addNewCustomer();
        newCustomer.setCustomerPhoneNumber(" ");
        assertTrue(newCustomer.getCustomerPhoneValidation()
                        .contains("First character can not have space"),
                "successfully");
    }
}
