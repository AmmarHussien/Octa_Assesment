package addNewCustomer;

import main.Main;
import org.example.login_page.LoginPage;
import org.example.new_customer.NewCustomer;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class cityTest extends Main {

    @Test
    public void TestEmptyDataInCity(){
        LoginPage loginPage = welcomePage.login();
        loginPage.setUserId("mngr472826");
        loginPage.setPassword("apEqyre");
        loginPage.clickSubmit();
        assertTrue(loginPage.getText()
                        .contains("Welcome To Manager's Page of Guru99 Bank"),
                "successfully");
        NewCustomer newCustomer = welcomePage.addNewCustomer();
        newCustomer.setCustomerCity("");
        newCustomer.setCustomerGender("f");
        assertTrue(newCustomer.getCustomerCityValidation()
                        .contains("City Field must not be blank"),
                "successfully");
    }
    @Test
    public void TestFirstCharacterInCitySpace(){
        LoginPage loginPage = welcomePage.login();
        loginPage.setUserId("mngr472826");
        loginPage.setPassword("apEqyre");
        loginPage.clickSubmit();
        assertTrue(loginPage.getText()
                        .contains("Welcome To Manager's Page of Guru99 Bank"),
                "successfully");
        NewCustomer newCustomer = welcomePage.addNewCustomer();
        newCustomer.setCustomerCity(" ");
        assertTrue(newCustomer.getCustomerCityValidation()
                        .contains("First character can not have space"),
                "successfully");
    }
    @Test
    public void TestNumberInCity(){
        LoginPage loginPage = welcomePage.login();
        loginPage.setUserId("mngr472826");
        loginPage.setPassword("apEqyre");
        loginPage.clickSubmit();
        assertTrue(loginPage.getText()
                        .contains("Welcome To Manager's Page of Guru99 Bank"),
                "successfully");
        NewCustomer newCustomer = welcomePage.addNewCustomer();
        newCustomer.setCustomerCity("3467537");
        assertTrue(newCustomer.getCustomerCityValidation()
                        .contains("Numbers are not allowed"),
                "successfully");
    }
}
