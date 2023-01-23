package addNewCustomer;

import main.Main;
import org.example.login_page.LoginPage;
import org.example.new_customer.NewCustomer;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class stateTest extends Main {

    @Test
    public void TestEmptyDataInState(){
        LoginPage loginPage = welcomePage.login();
        loginPage.setUserId("mngr472826");
        loginPage.setPassword("apEqyre");
        loginPage.clickSubmit();
        assertTrue(loginPage.getText()
                        .contains("Welcome To Manager's Page of Guru99 Bank"),
                "successfully");
        NewCustomer newCustomer = welcomePage.addNewCustomer();
        newCustomer.setCustomerState("");
        newCustomer.setCustomerGender("f");
        assertTrue(newCustomer.getCustomerStateValidation()
                        .contains("State must not be blank"),
                "successfully");
    }
    @Test
    public void TestFirstCharacterInStateSpace(){
        LoginPage loginPage = welcomePage.login();
        loginPage.setUserId("mngr472826");
        loginPage.setPassword("apEqyre");
        loginPage.clickSubmit();
        assertTrue(loginPage.getText()
                        .contains("Welcome To Manager's Page of Guru99 Bank"),
                "successfully");
        NewCustomer newCustomer = welcomePage.addNewCustomer();
        newCustomer.setCustomerState(" ");
        assertTrue(newCustomer.getCustomerStateValidation()
                        .contains("First character can not have space"),
                "successfully");
    }
    @Test
    public void TestNumberInState(){
        LoginPage loginPage = welcomePage.login();
        loginPage.setUserId("mngr472826");
        loginPage.setPassword("apEqyre");
        loginPage.clickSubmit();
        assertTrue(loginPage.getText()
                        .contains("Welcome To Manager's Page of Guru99 Bank"),
                "successfully");
        NewCustomer newCustomer = welcomePage.addNewCustomer();
        newCustomer.setCustomerState("3467537");
        assertTrue(newCustomer.getCustomerStateValidation()
                        .contains("Numbers are not allowed"),
                "successfully");
    }
}
