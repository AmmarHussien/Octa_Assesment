package addNewCustomer;

import main.Main;
import org.example.login_page.LoginPage;
import org.example.new_customer.NewCustomer;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class emailTest extends Main {
    @Test
    public void emptyTest() {
        LoginPage loginPage = welcomePage.login();
        loginPage.setUserId("mngr472826");
        loginPage.setPassword("apEqyre");
        loginPage.clickSubmit();
        assertTrue(loginPage.getText()
                        .contains("Welcome To Manager's Page of Guru99 Bank"),
                "successfully");
        NewCustomer newCustomer = welcomePage.addNewCustomer();
        newCustomer.setCustomerEmail("");
        newCustomer.setCustomerGender("f");
        assertTrue(newCustomer.getCustomerEmailValidation()
                        .contains("Email-ID must not be blank"),
                "successfully");
    }
    @Test
    public void wrongEmailFormat() {
        LoginPage loginPage = welcomePage.login();
        loginPage.setUserId("mngr472826");
        loginPage.setPassword("apEqyre");
        loginPage.clickSubmit();
        assertTrue(loginPage.getText()
                        .contains("Welcome To Manager's Page of Guru99 Bank"),
                "successfully");
        NewCustomer newCustomer = welcomePage.addNewCustomer();
        newCustomer.setCustomerEmail("test.fsjhfs");
        assertTrue(newCustomer.getCustomerEmailValidation()
                        .contains("Email-ID is not valid"),
                "successfully");
    }
}
