package addNewCustomer;

import main.Main;
import org.example.login_page.LoginPage;
import org.example.new_customer.NewCustomer;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class resetButton extends Main {
    @Test
    public void ResetButton(){
        LoginPage loginPage = welcomePage.login();
        loginPage.setUserId("mngr472826");
        loginPage.setPassword("apEqyre");
        loginPage.clickSubmit();
        assertTrue(loginPage.getText()
                        .contains("Welcome To Manager's Page of Guru99 Bank"),
                "successfully");
        NewCustomer newCustomer = welcomePage.addNewCustomer();
        newCustomer.setCustomerName("Amira");
        newCustomer.setCustomerGender("f");  // m for Male , f for Female
        newCustomer.setCustomerDateOfBirth("10102020"); // day,month,year
        newCustomer.setCustomerAddress("Test 123456");
        newCustomer.setCustomerCity("cairo");
        newCustomer.setCustomerState("wadi hof");
        newCustomer.setCustomerPIN("123456");
        newCustomer.setCustomerPhoneNumber("01146082989");
        newCustomer.setCustomerEmail("Test@test.com");
        newCustomer.setCustomerPassword("12345678");
        newCustomer.clickResetButton();
        assertTrue(newCustomer.getCustomerName()
                        .contains(""),
                "successfully");
        assertTrue(newCustomer.getCustomerDateOfBirth()
                        .contains(""),
                "successfully");
        assertTrue(newCustomer.getCustomerAddress()
                        .contains(""),
                "successfully");
        assertTrue(newCustomer.getCustomerCity()
                        .contains(""),
                "successfully");
        assertTrue(newCustomer.getCustomerState()
                        .contains(""),
                "successfully");
        assertTrue(newCustomer.getCustomerPIN()
                        .contains(""),
                "successfully");
        assertTrue(newCustomer.getCustomerPhoneNumber()
                        .contains(""),
                "successfully");
        assertTrue(newCustomer.getCustomerEmail()
                        .contains(""),
                "successfully");
        assertTrue(newCustomer.getCustomerPassword()
                        .contains(""),
                "successfully");

    }

}
