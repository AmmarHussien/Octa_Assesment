package addNewCustomer;

import main.Main;
import org.example.login_page.LoginPage;
import org.example.new_customer.NewCustomer;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class addressTest extends Main {
    @Test
    public void TestEmptyDataInAddress(){
        LoginPage loginPage = welcomePage.login();
        loginPage.setUserId("mngr472826");
        loginPage.setPassword("apEqyre");
        loginPage.clickSubmit();
        assertTrue(loginPage.getText()
                        .contains("Welcome To Manager's Page of Guru99 Bank"),
                "successfully");
        NewCustomer newCustomer = welcomePage.addNewCustomer();
        newCustomer.setCustomerAddress("");
        newCustomer.setCustomerGender("f");
        assertTrue(newCustomer.getCustomerAddressValidation()
                        .contains("Address Field must not be blank"),
                "successfully");
    }
    @Test
    public void TestFirstCharacterInAddressSpace(){
        LoginPage loginPage = welcomePage.login();
        loginPage.setUserId("mngr472826");
        loginPage.setPassword("apEqyre");
        loginPage.clickSubmit();
        assertTrue(loginPage.getText()
                        .contains("Welcome To Manager's Page of Guru99 Bank"),
                "successfully");
        NewCustomer newCustomer = welcomePage.addNewCustomer();
        newCustomer.setCustomerAddress(" ");
        assertTrue(newCustomer.getCustomerAddressValidation()
                        .contains("First character can not have space"),
                "successfully");
    }
}
