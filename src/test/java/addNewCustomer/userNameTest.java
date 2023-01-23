package addNewCustomer;

import main.Main;
import org.example.login_page.LoginPage;
import org.example.new_customer.NewCustomer;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class userNameTest extends Main {

    @Test
    public void TestEmptyDataInUserName(){
        LoginPage loginPage = welcomePage.login();
        loginPage.setUserId("mngr472826");
        loginPage.setPassword("apEqyre");
        loginPage.clickSubmit();
        assertTrue(loginPage.getText()
                        .contains("Welcome To Manager's Page of Guru99 Bank"),
                "successfully");
        NewCustomer newCustomer = welcomePage.addNewCustomer();
        newCustomer.setCustomerName("");
        newCustomer.setCustomerGender("f");
        assertTrue(newCustomer.getCustomerNameValidation()
                        .contains("Customer name must not be blank"),
                "successfully");
    }
    @Test
    public void TestFirstCharacterInUserNameSpace(){
        LoginPage loginPage = welcomePage.login();
        loginPage.setUserId("mngr472826");
        loginPage.setPassword("apEqyre");
        loginPage.clickSubmit();
        assertTrue(loginPage.getText()
                        .contains("Welcome To Manager's Page of Guru99 Bank"),
                "successfully");
        NewCustomer newCustomer = welcomePage.addNewCustomer();
        newCustomer.setCustomerName(" ");
        assertTrue(newCustomer.getCustomerNameValidation()
                        .contains("First character can not have space"),
                "successfully");
    }
    @Test
    public void TestNumberInUserName(){
        LoginPage loginPage = welcomePage.login();
        loginPage.setUserId("mngr472826");
        loginPage.setPassword("apEqyre");
        loginPage.clickSubmit();
        assertTrue(loginPage.getText()
                        .contains("Welcome To Manager's Page of Guru99 Bank"),
                "successfully");
        NewCustomer newCustomer = welcomePage.addNewCustomer();
        newCustomer.setCustomerName("3467537");
        assertTrue(newCustomer.getCustomerNameValidation()
                        .contains("Numbers are not allowed"),
                "successfully");
    }
}
