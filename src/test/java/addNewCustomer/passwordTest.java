package addNewCustomer;

import main.Main;
import org.example.login_page.LoginPage;
import org.example.new_customer.NewCustomer;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class passwordTest extends Main {
    @Test
    public void TestEmptyPassword() {
        LoginPage loginPage = welcomePage.login();
        loginPage.setUserId("mngr472826");
        loginPage.setPassword("apEqyre");
        loginPage.clickSubmit();
        assertTrue(loginPage.getText()
                        .contains("Welcome To Manager's Page of Guru99 Bank"),
                "successfully");
        NewCustomer newCustomer = welcomePage.addNewCustomer();
        newCustomer.setCustomerPassword("");
        newCustomer.setCustomerGender("f");
        assertTrue(newCustomer.getCustomerPasswordValidation()
                        .contains("Password must not be blank"),
                "successfully");
    }
}
